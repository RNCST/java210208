package athread.talk1;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.StringTokenizer;

import athread.talk2.TServer;

public class TalkServerThread extends Thread {
	TalkServer ts = null;
	TServer ts1 = null;
	Socket client = null;
	ObjectOutputStream oos = null;// 직렬화를 누릴 수 있다. 홀수
	ObjectInputStream ois = null;// 직렬화를 누릴 수 있다. 짝수

	String nickName = null;// 닉네임 저장,

	/*
	 * 클라이언트측에서 서버소켓에 접속하고 나면 생성자를 통해서 Talkserver의 주소번지를 받게 되고 이것으로 소켓에 접근이 가능함. 이
	 * 소켓으로 ois와 oos를 생성하고 접속해온 사용자의 정보를 청취함. 청취한 내용을 TalkServer의 jta_log에 출력해 봄.
	 */
	public TalkServerThread(TalkServer talkServer) {
		this.ts = talkServer;
		this.client = ts.client;
		try {
			oos = new ObjectOutputStream(client.getOutputStream());// 홀수자리 소켓 - 쓰기역할이여서 ois보다 먼저 씀
			ois = new ObjectInputStream(client.getInputStream()); // 짝수자리 소켓 - 듣기역할
			String msg = (String) ois.readObject();
			ts.jta_log.append(msg + "\n");
			StringTokenizer st = new StringTokenizer(msg, "#");
			st.nextToken();// 100
			nickName = st.nextToken();
			ts.jta_log.append(nickName + "님이 입장하였습니다.\n");
			for (TalkServerThread tst : ts.globalList) {
				// 재훈이 입장하기 전에 있는 친구들의 정보를 받기.
				this.send(100 + "#" + tst.nickName);

			}
			ts.globalList.add(this); // 현재스레드는 재훈 스레드.
			this.broadCasting(msg);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public TalkServerThread(TServer talkServer) {
		this.ts1 = talkServer;
		this.client = ts.client;
		try {
			oos = new ObjectOutputStream(client.getOutputStream());// 홀수자리 소켓 - 쓰기역할이여서 ois보다 먼저 씀
			ois = new ObjectInputStream(client.getInputStream()); // 짝수자리 소켓 - 듣기역할
			String msg = (String) ois.readObject();
			ts1.jta_log.append(msg + "\n");
			StringTokenizer st = new StringTokenizer(msg, "#");
			st.nextToken();// 100
			nickName = st.nextToken();
			ts1.jta_log.append(nickName + "님이 입장하였습니다.\n");
			for (TalkServerThread tst : ts.globalList) {
				// 재훈이 입장하기 전에 있는 친구들의 정보를 받기.
				this.send(100 + "#" + tst.nickName);
				
			}
			ts1.globalList.add(this); // 현재스레드는 재훈 스레드.
			this.broadCasting(msg);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 현재 입장해 잇는 친구들 모두에게 메시지 전송하기 구현
	// globalList에는 서버에 접속해온 클라이언트에 댛나 스레드 객체가 담겨 있음.
	public void broadCasting(String msg) {
		for (TalkServerThread tst : ts.globalList) {
			// 그 스레드에 send메소드 호출하여 메시지 전송함.
			tst.send(msg);

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

	@Override
	public void run() {
		System.out.println("tct.run 호출 성공");
		boolean isStop = false;
		try {
			run_start: while (!isStop) {
				try {
					String msg = "";
					msg = (String) ois.readObject();
					ts.jta_log.append(msg + "\n");
					StringTokenizer st = null;
					int protocol = 0;
					if (msg != null) {// 100#재훈#오늘 스터디 할까?
						st = new StringTokenizer(msg, "#");
						protocol = Integer.parseInt(st.nextToken());// 100
					}
					switch (protocol) {
					case 200: {
						String nickName = st.nextToken();
						String msg2 = st.nextToken();
						broadCasting(200 + "#" + nickName + "#" + msg2);
					}
						;
					}
				} catch (Exception e) {
					System.out.println("wheil inner " + e.toString());
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
