package athread.talk2;

import java.util.Calendar;
import java.util.StringTokenizer;
import java.util.Vector;

import javax.swing.text.MutableAttributeSet;
import javax.swing.text.SimpleAttributeSet;

/**
 * 이벤트 핸들러의 역할은 말하기 이고 클라이언트 스레드의 역한을 듣기이다,
 *
 */
public class TalkClientThread extends Thread {
	TalkClient talkClient = null;

	public TalkClientThread(TalkClient talkClient) {
		this.talkClient = talkClient;
	}

	/*
	 * 서버에서 말한 내용을 들어봅시다.
	 */
	@Override
	public void run() {
		boolean isStop = false;
		while (!isStop) {
			try {
				String msg = "";// 100#apple
				msg = (String) talkClient.ois.readObject();
				StringTokenizer st = null;
				Calendar cal = Calendar.getInstance();
				int protocol = 0;
				if (msg != null) {
					st = new StringTokenizer(msg, "#");
					protocol = Integer.parseInt(st.nextToken());// 100
				}
				switch (protocol) {

				case Protocol.ROOM_IN: {// 100#apple
					String nickName = st.nextToken();
					MutableAttributeSet attr = new SimpleAttributeSet();
					try {
						talkClient.sd_display.insertString(talkClient.sd_display.getLength(),
								nickName + "님이 입장하였습니다.\n", attr);
					} catch (Exception e) {
						e.printStackTrace();
					}
					Vector<String> v = new Vector<>();
					v.add(nickName);
					talkClient.dtm.addRow(v);
				}
					break;
				case Protocol.MESSAGE: {
					System.out.println(Protocol.MESSAGE + cal.get(Calendar.SECOND) + cal.get(Calendar.MILLISECOND));
					String nickName = st.nextToken();
					String message = st.nextToken();
					MutableAttributeSet attr = new SimpleAttributeSet();
					try {
						talkClient.sd_display.insertString(talkClient.sd_display.getLength(),
								"[" + nickName + "]" + message + "\n", attr);
					} catch (Exception e) {
						e.printStackTrace();
					}
					talkClient.jtp_display.setCaretPosition(talkClient.sd_display.getLength());
					// 메세지가 올라올때마다 메세지 처리
				}
					break;

				case Protocol.CHANGE: {
					String nickName = st.nextToken();
					String afterName = st.nextToken();
					String message = st.nextToken();

					// 테이블에 대화명 변경하기
					for (int i = 0; i < talkClient.dtm.getRowCount(); i++) {
						String currentName = (String) talkClient.dtm.getValueAt(i, 0);
						if (currentName.equals(nickName)) {
							talkClient.dtm.setValueAt(afterName, i, 0);
						}
						break;
					}
					MutableAttributeSet attr = new SimpleAttributeSet();
					try {
						talkClient.sd_display.insertString(talkClient.sd_display.getLength(), message + "\n", null);
					} catch (Exception e) {
						e.printStackTrace();
					}
					talkClient.jtp_display.setCaretPosition(talkClient.sd_display.getLength());
					System.out.println(nickName + talkClient.nickName + afterName);
					if (nickName.equals(talkClient.nickName)) {
						talkClient.setTitle(afterName + "님의 대화창");
						talkClient.nickName = afterName;

					}
				}
					break;

				case Protocol.ROOM_OUT: {
					String nickName = st.nextToken();
					MutableAttributeSet attr = new SimpleAttributeSet();
					try {
						talkClient.sd_display.insertString(talkClient.sd_display.getLength(),
								nickName + "님이 퇴장 하였습니다.\n", attr);
					} catch (Exception e) {
						e.printStackTrace();
					}
					talkClient.jtp_display.setCaretPosition(talkClient.sd_display.getLength());
					for (int i = 0; i < talkClient.dtm.getRowCount(); i++) {
						String n = (String) talkClient.dtm.getValueAt(i, 0);
						if (n.equals(nickName)) {
							talkClient.dtm.removeRow(i);
						}
					}
				}
					break;
				}//////////// end of switch
			} catch (Exception e) {
				// TODO: handle exception
			}
		} //////////////////// end of while
	}//////////////////////// end of run
}
