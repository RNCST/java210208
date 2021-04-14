package athread.talk2;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Calendar;
import java.util.StringTokenizer;

public class TalkServerThread extends Thread {
	public TalkServer talkServer = null;
	Socket serverSocket = null;
	ObjectOutputStream oos = null;
	ObjectInputStream ois = null;
	String chatName = null;// 현재 서버에 입장한 클라이언트 스레드 닉네임 저장

	public TalkServerThread(TalkServer talkServer) {
		this.talkServer = talkServer;
		this.serverSocket = talkServer.acceptedSocket;
		try {
			oos = new ObjectOutputStream(serverSocket.getOutputStream()); // 홀수 소켓
			ois = new ObjectInputStream(serverSocket.getInputStream());   // 짝수 소켓
			// 130#Person1[듣기]
			String msg = (String) ois.readObject(); // 듣기
			talkServer.jta_log.append(msg + "\n"); // 서버에 출력
			StringTokenizer st = new StringTokenizer(msg, "#");
			st.nextToken();// 130
			chatName = st.nextToken(); //Person1
			talkServer.jta_log.append(chatName + "님이 입장하였습니다.\n");
			for (TalkServerThread talkServerThread : talkServer.globalList) { // 2명인경우 Person1 에게만 간다 | 130 #Person2
				// 이전에 입장해 있는 친구들 정보 받아내기
				// String currentName = tst.chatName;
				this.send(Protocol.ROOM_IN + "#" + talkServerThread.chatName);
			}
			// 현재 서버에 입장한 클라이언트 스레드 추가하기
			talkServer.globalList.add(this); // Person1 추가 , 앞에 for문은 타지않고 add Thread
			this.broadCasting(msg); // 방송 - 1명에게만 전송이 된다.
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	// 현재 입장해 있는 친구들 모두에게 메시지 전송하기 구현
	public void broadCasting(String msg) {
		for (TalkServerThread talkServerThread : talkServer.globalList) { //globalList.size() = 1==> 1바퀴 / 한명이 들어오면 2로 바뀜 
			                                                              //globalList -> 접속한 사용자리스트
			talkServerThread.send(msg); // talkserverThread == > 다른 사람들 // this 쓸경우 본인에게 
		}
	}

	// 클라이언트에게 말하기 구현
	public void send(String msg) {
		try {
			oos.writeObject(msg);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void run() {
		String msg = null;
		boolean isStop = false;
		try {
			// while(true) {//무한루프에 빠질 수 있다.
			run_start: // +run_start 와 세트로 사용하며 통채로 빠져나갈 수 있다.
			while (!isStop) {
				msg = (String) ois.readObject();
				talkServer.jta_log.append(msg + "\n");
				talkServer.jta_log.setCaretPosition(talkServer.jta_log.getDocument().getLength());
				StringTokenizer st = null;
				Calendar cal = Calendar.getInstance();
				int protocol = 0;// 100|200|201|202|500
				if (msg != null) {
					st = new StringTokenizer(msg, "#");
					protocol = Integer.parseInt(st.nextToken());// 100
				}
				switch (protocol) {
				case Protocol.MESSAGE: {
					System.out.println("TSTread 201 "+cal.get(Calendar.SECOND)+cal.get(Calendar.MILLISECOND));
					String nickName = st.nextToken();
					String message = st.nextToken();
					broadCasting(Protocol.MESSAGE 
							+ Protocol.seperator + nickName 
							+ Protocol.seperator + message 
							+ Protocol.seperator);
				}
					break;
				case Protocol.CHANGE: {//300#하하#하늘소
					String nickName = st.nextToken();
					String afterName = st.nextToken();
					String message = st.nextToken();
					this.chatName = afterName;
					broadCasting(Protocol.CHANGE 
							+ Protocol.seperator + nickName 
							+ Protocol.seperator + afterName 
							+ Protocol.seperator + message);
				}
					break;

				case Protocol.ROOM_OUT: {
					String nickName = st.nextToken();
					talkServer.globalList.remove(this);
					broadCasting(Protocol.ROOM_OUT 
							   + Protocol.seperator + nickName);
				}
					break run_start;
				}///////////// end of switch
			} ///////////////// end of while
		} catch (Exception e) {
			// TODO: handle exception
		}
	}///////////////////////// end of run
}