package athread.talk1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
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
import javax.swing.table.DefaultTableModel;

public class TalkClient extends JFrame implements ActionListener{
	
	JPanel      jp_first        = new JPanel();
	JPanel      jp_second       = new JPanel();
	JPanel      jp_second_south = new JPanel();
	
	Socket 		           socket    = null;//통신과 관련된 전역 변수 추가 
	ObjectOutputStream     oos       = null;//직렬화를 누릴 수 있다.  홀수
	ObjectInputStream      ois       = null;//직렬화를 누릴 수 있다.  짝수
	
	String                 nickName  = null;//닉네임 저장, 
	
	
	JTextArea   jta_display = new JTextArea();
	JScrollPane jsp_display = new JScrollPane(jta_display);
	JPanel      jp_south    = new JPanel();
	JTextField  jtf_msg     = new JTextField(20);
	JButton     jb_send     = new JButton("전송");
	
	String cols[]           = {"대화명"};
	String data[][]         = new String[0][1];
	DefaultTableModel dtm_nick = new DefaultTableModel(data,cols);
	JTable jtb_nick         = new JTable(dtm_nick);
	JScrollPane jsp_nick    = new JScrollPane(jtb_nick);
	JButton    jb_one       = new JButton("1:1대화");
	JButton    jb_change    = new JButton("대화명 변경");
	JButton    jb_emoticon  = new JButton("이모티콘");
	JButton    jb_out       = new JButton("나가기");
	
	public void init() {//소켓 관련 초기화
		try {
			socket = new Socket("127.0.0.1", 3000);
			oos    = new ObjectOutputStream(socket.getOutputStream()); //홀수먼저
			ois    = new ObjectInputStream(socket.getInputStream()); 
			oos.writeObject(100+"#"+nickName);
			TalkClientThread tct = new TalkClientThread(this);     //스레드와연결
			tct.start();  //run()호출
			//소켓 생성하기 - ip, port 서버측 ServerSocket연결
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	public void initDisplay() {
	
		
		nickName = JOptionPane.showInputDialog("닉네임을 입력하세요.");
		System.out.println("initDisplay 호출 성공");
		jtf_msg.addActionListener(this);
		jta_display.setEditable(false);
		jp_south.setLayout(new BorderLayout());
		jp_south.add("Center",jtf_msg);
		jp_south.add("East",jb_send);
		jp_first.setLayout(new BorderLayout());
		jp_first.add("Center",jsp_display);
		jp_first.add("South",jp_south);
		jp_first.setBackground(Color.green);
		jp_second_south.setLayout(new GridLayout(2,2));
		jp_second_south.add(jb_one);
		jp_second_south.add(jb_change);
		jp_second_south.add(jb_emoticon);
		jp_second_south.add(jb_out);
		jp_second.setBackground(Color.red);
		jp_second.setLayout(new BorderLayout());
		jp_second.add("Center", jsp_nick);
		jp_second.add("South", jp_second_south);
		this.setLayout(new GridLayout(1,2));
		this.add(jp_first);
		this.add(jp_second);
		
		this.setTitle(nickName+"님의 창");
		this.setSize(500,400);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		TalkClient tc = new TalkClient();
		tc.initDisplay();
		tc.init(); // 소켓처리
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		String msg = jtf_msg.getText();
		if(jtf_msg == obj) {
			try {
				oos.writeObject(Protocol.MESSAGE+
						    "#"+nickName
						   +"#"+msg);
				jtf_msg.setText("");
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
