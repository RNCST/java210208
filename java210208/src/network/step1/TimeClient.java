package network.step1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JLabel;

public class TimeClient extends Thread{
	public String timeStr = null;
		   JLabel jlb_time= null;
		   public TimeClient(){}
		   public TimeClient(JLabel jlb_time){
			   this.jlb_time=jlb_time;
		   }
	
	@Override
	public void run() {// 콜백메소드  -- > 사용자가 아니라 시스템 레벨에서 자동 호출이 되는 메소드이다.
		Socket socket = null;
		PrintWriter out = null;
		BufferedReader br = null;
		boolean isFlag = false;
		try {
			socket = new Socket("192.168.0.3",3500); // local port 3500               // 소켓으로 부터 데이터 읽기
			out = new PrintWriter(socket.getOutputStream(),true);
			// 내 소켓에 대한 포트번호는 따로 할당
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));  // 소켓의 입력스트림값을 읽어서 문자로 변환후 bufferedreader에 입력
			while(!isFlag) {
				while((timeStr=br.readLine())!=null) { // br.realine한줄 레코드 전체를 읽을 수 있는 메소드.
					System.out.println(timeStr);
					jlb_time.setText(timeStr);
					try {
						sleep(1000);
					} catch (InterruptedException ie) {
						System.out.println("InterruptedException 발생");
					}
				}
			}
		} catch (Exception e) {

		}
	}
//	
//	public static void main(String[] args) {
//		TimeClient tc = new TimeClient();
//		tc.start();// run메소드 호출 해줌.
//		
//		
//	}
	
	
}

