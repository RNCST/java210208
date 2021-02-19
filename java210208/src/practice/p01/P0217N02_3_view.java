package practice.p01;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class P0217N02_3_view extends JFrame implements ActionListener{
	//선언부 
	//속지(밑장을 만드는)를 생성하는 클래스 인스턴스화
	JPanel jp_center = new JPanel(); // 중앙에 있는 속지 인스턴스화
	JPanel jp_east = new JPanel(); // 오른편에 있고 버튼 4개를 만들 속지 인스턴스화 
	JButton jbtn_new = new JButton("새게임");
	JButton jbtn_dap = new JButton("정답");
	JButton jbtn_clear = new JButton("지우기");
	JButton jbtn_exit = new JButton("나가기");
	
	JTextArea jta_display = new JTextArea(5, 30); // 입력 창 위에 결과가 나오는 곳 
	JTextField jtf_input = new JTextField();      // 입력창
	//생성자
	public P0217N02_3_view() {
		initDisplay();                            // 창이 뜨도록 해주는곳
	}
	//화면처리부
	public void initDisplay() {
		jp_east.setLayout(new GridLayout(4, 1)); // row가 4개 컬러이 1개로 화면을 4빵
		jp_east.add(jbtn_new);    //  새 게임  버튼
		jp_east.add(jbtn_dap);    //  정답      버튼
		jp_east.add(jbtn_clear);  //  지우기   버튼
		jp_east.add(jbtn_exit);   //  나가기   버튼 디폴트 위치가 오른쪽인가??
		
		jbtn_new.addActionListener(this);
		jbtn_dap.addActionListener(this);
		jbtn_clear.addActionListener(this);
		jbtn_exit.addActionListener(this);
		
		jp_center.setLayout(new BorderLayout());
		jp_center.add("Center", jta_display);         // 입력 창 위에 결과가 나오는 곳 
		jp_center.add("South", jtf_input);            // 입력 창
		this.add("Center", jp_center);			  // 왼쪽이 출력
		this.add("East", jp_east);				  // 오른쪽이 출력
		this.setTitle("난수 게임. Ver1.0");			  // 팝업 제목 설정
		this.setSize(400, 300);
		this.setVisible(true);					  // 화면 팝업의 활성화
		
	}
	//메인메소드
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true); // 디자인
		P0217N02_3_view rgview = new P0217N02_3_view();
		

	}
	
	@Override
	
	public void actionPerformed(ActionEvent e) {
		if (jbtn_new == e.getSource()) {
			System.out.println("1");
		}
		if (jbtn_dap == e.getSource()) {
			System.out.println("2");
		}
		if (jbtn_clear == e.getSource()) {
			System.out.println("3");
		}
		if (jbtn_exit == e.getSource()) {
			System.exit(0);
		}
		
		
	}

}
