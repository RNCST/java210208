package network.step1;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Calendar;

import javax.swing.JFrame;

public class TimeServer extends Thread{
	Socket socket = null;
	public TimeServer() {	}
	public TimeServer(Socket socket) {	
		this.socket = socket;
	}
	/*
	 * 소켓  -- 무전기에 장착된 하드웨어
	 * 네트워크에서 정보가 나가고 들어오는 지점에 대한 유일한 식별자
     * 32비트의 숫자로 구성되며 짝수번 소켓을 받아들이는 용도로
     * 홀수번 소켓은 정보를 보내는 용도로 사용됨
     * 
     * FIFO속성 가지고 있다. 큐, 스택(백팩(FILO))
     * 동시에 두가지를 할 수는 없다. (읽으면서 쓰기 혹은 쓰면서 읽기)
     * 
     * 네트워크망 구성되어 있어야 함
     * 
     * TCP포트번호 : 물리적인 어떠한 장치를 꽂는 장ㅊ소는 아니다.용도에 따라 쓰는 숫자 값.
     *  서버에서 돌아가는특정 프로그램을 나타내는 16비트 숫자
     *  웹서버 - 80
     *  텔넷서버 - 23
     *  FTP서버 - 20
     *  SMTP서버 - 25
     *  
     *  같은 포트에서 여러 프로그램이 돌아갈 수 있나요?
     *  BindException이 발생한다.
     *  
     *  netstat -ano | findstr 3500 검색   // 내 pid만 나옴.
     *  taskkill /pid 42356 /f      
     *  
	 * 
	 */
	
	
	/**
	 * 콜백 메소드 == 스레드 기동시 호출 되는 메소드  run()
	 */
	public static void initDisplay() {
		new JFrame().setVisible(true);
	}
	@Override
	public void run() {
		boolean isFlag = false;
		try {
			//socket에 대한 객체 주입은 인스턴스화를 통해서 생성자가 호출되었을 때 객체 주입이 이루어진다.
			PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
			while(!isFlag) {
				if(out!=null) {
					out.println(getTimer());
				}
				//1초동안 기다리고 진행 그리고 1초동안 기다리고 진행
				try {
					sleep(1000); // 밀리세크 단위로 설정. 지연 - 스레드, 경합-스레드, 순서-스레드, 순서를정한다- 스레드
				} catch (InterruptedException ie) {
					System.out.println("InterruptedException 발생");
					
				}
			}
		} catch (Exception e) {
			
		} 
		System.out.println("run call ....");
	}
	public String getTimer() {
		Calendar cal = Calendar.getInstance();
		int hour     = cal.get(Calendar.HOUR_OF_DAY);
		int min      = cal.get(Calendar.MINUTE);
		int sec      = cal.get(Calendar.SECOND);
		String str1   = Integer.toString(hour);
		if(str1.length()==1) {
			str1 = "0"+str1;
		}
		String str2   = Integer.toString(min);
		if(str2.length()==1) {
			str2 = "0"+str2;
		}
		String str3   = Integer.toString(sec);
		if(str3.length()==1) {
			str3 = "0"+str3;
		}
		return str1+":"+str2+":"+str3;
	  //return (hour < 10 ? "0"+hour : ""+hour ) + ":" 
	  //     + (min  < 10 ? "0"+min  : ""+min  ) + ":"
	  //     + (sec  < 10 ? "0"+sec  : ""+sec  )
	}
	
	//본만큼 구현하는 것이다.
	//main메소드도 스레드이다.(default thread 이다) -entry point - static
	//메인메소드보다 먼저 시작되는것은 스태틱 블럭밖에없다.
	public static void main(String[] args) {
		int port       = 3500; // 포트번호지정
		boolean isFlag = false;// 서버탈출수단
		ServerSocket server = null; //ㅇ 클라이언트가 접속할 떄까지 new Socket("ipadress,port)
		Socket       client = null;
		try {
			server = new ServerSocket(port);
		} catch (Exception e) {
			
		}
		System.out.println("TimeServer Start successfully....");
	  //while(true) 무한루프에 빠질수있다.
		while(!isFlag) {
			try {
				//TimeServer ts = new TimeServer(client);
				//ts.start();//  55번라인에서 nullpointerexception이 발생함.
				//이라인에서 client가 접속할떄까지 기다린다.
				client = server.accept();
				//initDisplay(); 여기에 있으면 영원히 세상구겨을 못할 수도 있다. 위치와 순서,
				System.out.println("New Client connected..."+client.toString()+"\n");
				TimeServer ts = new TimeServer(client);
				ts.start(); // start()를 하면 run()이 호출당한다.
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}
