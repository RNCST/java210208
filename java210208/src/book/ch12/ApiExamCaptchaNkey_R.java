package book.ch12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/**
 * get = Connect = readBody<p>
 * 
 * 1.Connect를 통해 url정보를 입력받게 되어 브라우저에 요청을 할 수 있게 한다. 주소(URL) =>객체화 시켜야한다.객체화를 시키면 메소드와 필드를 누릴  수 있다.
 * WEB에 요청하는 방식이 get 방식과  post 방식이 있는데  get은 주소상에 나타나고 post는 나타나지 않는다.
 * QurryString 방식은 get 방식만 받을 수 있다.
 * <p>
 * 2. get(서버요청에서는 요청) key,value 쌍을 통해 시크릿 값을 받을 수 있다.
 * HttpURLConnection을 이용하여 연결을 시도 한다.
 * HttpURLConnection.HTTP_OK(정상 호출시) => con.getInputStream을 리턴
 * <p>
 * 3. readBody 에서 파라미터로 binary코드 (응답으로 받아야 하는 정보)를 받는다.==> inputStream
 * key 값을 가지게 된다.
 * <p>
 * 
 * @author OSH
 * 
 */
public class ApiExamCaptchaNkey_R {
//ID - 5NNeHasY7KCWoMGm0suJ
//SECRET - 4zvlywLkoc
	
	// ID = zbec_p3PaYFMuC84PuWE
	// SECRET = qVK1plhBot
	   public static void main(String[] args) {
	        String clientId = "zbec_p3PaYFMuC84PuWE"; //애플리케이션 클라이언트 아이디값";
	        String clientSecret = "qVK1plhBot"; //애플리케이션 클라이언트 시크릿값";

	        String code = "0"; // 키 발급시 0,  캡차 이미지 비교시 1로 세팅
	        String apiURL = "https://openapi.naver.com/v1/captcha/nkey?code=" + code;

	        Map<String, String> requestHeaders = new HashMap<>();
	        requestHeaders.put("X-Naver-Client-Id", clientId);
	        requestHeaders.put("X-Naver-Client-Secret", clientSecret);
	        String responseBody = get(apiURL, requestHeaders);

	        System.out.println("main()에서 responseBody:"+responseBody);
	    }
/*
 * 가장 먼저 호출되는 메소드
 * - Map에 요청에 필요한 속성값
 * - connect호출 - 연결통로 확보
 * - 요청에 필요한 정보를 만들어서 전송보냄. -get
 * - 응답메시지가(200, 204, 302) 올때 까지 기다림
 * readBody호출(서버와 연결됨 후에 연결정보를 가진 커넥션에서 InputStream 생성함.
 * 이것을 활용하여 네이버에서 전송해주는 키값을 청취할 수 있다.
 */
	    /**
	     * get
	     * 
	     * @param String apiUrl
	     * @param Map<String, String> requestHeaders
	     * @return
	     */
	    private static String get(String apiUrl, Map<String, String> requestHeaders){
	        HttpURLConnection con = connect(apiUrl);
	        try {
	            con.setRequestMethod("GET");
	            for(Map.Entry<String, String> header :requestHeaders.entrySet()) {
	                con.setRequestProperty(header.getKey(), header.getValue());
	            }

	            int responseCode = con.getResponseCode();
	            if (responseCode == HttpURLConnection.HTTP_OK) { // 정상 호출
	                return readBody(con.getInputStream());
	            } else { // 에러 발생
	                return readBody(con.getErrorStream());
	            }
	        } catch (IOException e) {
	            throw new RuntimeException("API 요청과 응답 실패", e);
	        } finally {
	            con.disconnect();
	        }
	    }
	    // parameter 가 2가지.

	    /**
	     * Connect
	     * 
	     * @param apiUrl
	     * @return HttpURL 리턴
	     */
	    private static HttpURLConnection connect(String apiUrl){
	        try {
	            URL url = new URL(apiUrl);
	            return (HttpURLConnection)url.openConnection();
	        } catch (MalformedURLException e) {
	            throw new RuntimeException("API URL이 잘못되었습니다. : " + apiUrl, e);
	        } catch (IOException e) {
	            throw new RuntimeException("연결이 실패했습니다. : " + apiUrl, e);
	        }
	    }
	    // 접속을  해서 HttpURL을 리턴하는 값.

	    /**
	     * readBody
	     * 
	     * @param body
	     * @return
	     */
	    private static String readBody(InputStream body){
	    	System.out.println("readBody 호출 성공");
	        InputStreamReader streamReader = new InputStreamReader(body);

	        try (BufferedReader lineReader = new BufferedReader(streamReader)) {
	            StringBuilder responseBody = new StringBuilder();

	            String line;
	            while ((line = lineReader.readLine()) != null) {
	                responseBody.append(line);
	            }
	            System.out.println("readBody()에서 responseBody : "+responseBody);
	            return responseBody.toString();
	        } catch (IOException e) {
	            throw new RuntimeException("API 응답을 읽는데 실패했습니다.", e);
	        }
	    }	

}