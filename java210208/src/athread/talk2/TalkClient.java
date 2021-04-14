package athread.talk2;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;

public class TalkClient extends JFrame implements ActionListener {
	////////////////통신과 관련한 전역변수 추가 시작//////////////
	Socket 				clientSocket 	= null;
	ObjectOutputStream 	oos 	= null;//말 하고 싶을 때
	ObjectInputStream 	ois		= null;//듣기 할 때
	String 				nickName= null;//닉네임 등록
	////////////////통신과 관련한 전역변수 추가  끝  //////////////
	JPanel jp_second	  = new JPanel();
	JPanel jp_second_south= new JPanel();
	JButton jbtn_one	  = new JButton("1:1");
	JButton jbtn_emoticon = new JButton("이모티콘");
	JButton jbtn_fontSize = new JButton("글자 크기");
	JButton jbtn_change	  = new JButton("대화명변경");
	JButton jbtn_font	  = new JButton("글자색");
	JButton jbtn_exit	  = new JButton("나가기");
	
	String cols[] 		  = {"대화명"};
	String data[][] 	  = new String[0][1];
	DefaultTableModel dtm = new DefaultTableModel(data,cols);
	JTable			  jtb = new JTable(dtm);
	JScrollPane       jsp = new JScrollPane(jtb);
	
	JPanel jp_first 		= new JPanel();
	JPanel jp_first_south 	= new JPanel();
	JTextField jtf_msg = new JTextField(20);//south속지 center
	JButton jbtn_send  = new JButton("전송");//south속지 east
	
	StyledDocument sd_display = 
			new DefaultStyledDocument(
					new StyleContext());
//	JTextArea jta_display = null;  // JTextArea에는 문자열을 그리는 개념이 아니라 출력하는 개념이라서 부분 색상 변경, 문자열 그리기 등이 안됨.
	JTextPane jtp_display = new JTextPane(sd_display);
	JScrollPane jsp_display = new JScrollPane(jtp_display,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, 
			                                                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	//배경 이미지에 사용될 객체 선언-JTextArea에 페인팅
	
	Image back = null;
	
	public TalkClient() {
		jtf_msg.addActionListener(this);
		jbtn_exit.addActionListener(this);
		jbtn_change.addActionListener(this);
	}
	
	public void initDisplay() {
		//사용자의 닉네임 받기
		nickName = JOptionPane.showInputDialog("닉네임을 입력하세요.");
		this.setLayout(new GridLayout(1,2));
		jp_second.setLayout(new BorderLayout());
		jp_second.add("Center",jsp);
		jp_second_south.setLayout(new GridLayout(3,2));
		jp_second_south.add(jbtn_one);
		jp_second_south.add(jbtn_change);
		jp_second_south.add(jbtn_font);
		jp_second_south.add(jbtn_exit);
		jp_second.add("South",jp_second_south);
		jp_first.setLayout(new BorderLayout());
		jp_first_south.setLayout(new BorderLayout());
		jp_first_south.add("Center",jtf_msg);
		jp_first_south.add("East",jbtn_send);
		
		back = getToolkit().getImage("src\\athread\\talk2\\back.jpg");
		
		jtp_display = new JTextPane() {
			private static final long serialVersionUID = 1L;
			public void paint(Graphics g) {
				g.drawImage(back, 0, 0, this);
				Point p = jsp_display.getViewport().getViewPosition();
				g.drawImage(back, p.x, p.y, null);
				paintComponent(g);
			}
		};
//		jtp_display.setLineWrap(true);
		jtp_display.setOpaque(false);
		Font font = new Font("돋움",Font.BOLD,25);
		jtp_display.setFont(font);
		jp_first.add("Center",jsp_display);
		jp_first.add("South",jp_first_south);
		this.add(jp_first);
		this.add(jp_second);
		this.setTitle(nickName);
		this.setSize(800, 550);
		this.setVisible(true);
	}
	public static void main(String args[]) {
		// swing skin 사용
		JFrame.setDefaultLookAndFeelDecorated(true);
		// 메인 스레드 우선원
		TalkClient talkClient = new TalkClient();
		// 화면 부름
		talkClient.initDisplay();
		// 소켓 생성- TS쪽 ServerSocket()감지 -> 일단 소켓 전달됨. - 서버측 run메소드 안에서 - TSThread생성
		// 생성자 호출(this) - 듣기 가능해짐.(전제조건 생성자안에서 oos(홀수), ois(짝수) 순으로 인스턴스화, 소켓객체가 잇어야 가능)
		talkClient.init();
	}
	//소켓 관련 초기화
	public void init() {
		try {
			//서버측의 ip주소 작성하기
			clientSocket = new Socket("127.0.0.1",3002);
			//TS ServerSocket 감지 -> Client = server.accept(); Client Socket에 대한 정보를 가짐.
			//홀수 소켓에서 처리
			oos = new ObjectOutputStream(clientSocket.getOutputStream());
			//짝수 소켓에서 처리
			ois = new ObjectInputStream(clientSocket.getInputStream());
			//initDisplay에서 닉네임이 결정된 후 init메소드가 호출되므로
			//서버에게 내가 입장한 사실을 알린다.(말하기)
			oos.writeObject(Protocol.ROOM_IN+Protocol.seperator+nickName); // 말하는 순간
			//TServerThread의 생성자가 듣기 
			//서버에 말을 한 후 들을 준비를 한다.  -- 대기를 한다 - 듣는다 - 프로토콜을 비교해야 한다.
			//프로토콜 설계하기 -- ERD를 그린다.  -- 데이터 클래스를 설계 - List, Map 단위 테스트
			TalkClientThread talkClientThread = new TalkClientThread(this);
			talkClientThread.start();
		} catch (Exception e) {
			//예외가 발생했을 때 직접적인 원인되는 클래스명 출력하기
			System.out.println(e.toString());
		}
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		Object obj = ae.getSource();
		String msg = jtf_msg.getText();
		if(jbtn_one == obj) {
			
		}
		else if(jtf_msg==obj) {
			try {
				oos.writeObject(
						   Protocol.seperator+nickName
						   +Protocol.seperator+msg);
				jtf_msg.setText("");
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		else if(jbtn_exit==obj) {
			try {
				oos.writeObject(500+"#"+this.nickName);
				//자바가상머신과 연결고리 끊기
				System.exit(0);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		else if(jbtn_change == obj) {
			String afterName = JOptionPane.showInputDialog("변경할 대화명을 입력하세요.");
			if(afterName == null || afterName.trim().length()<1) {
				JOptionPane.showMessageDialog(this
				, "변경할 대화명을 입력하세요"
				, "INFO", JOptionPane.INFORMATION_MESSAGE);
				return;
			}
			try {
				oos.writeObject(
						    Protocol.seperator+nickName
						   +Protocol.seperator+afterName
						   +Protocol.seperator+nickName+"의 대화명이 "+afterName+"으로 변경되었습니다.");
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}//////////////////////end of actionPerformed
}














