package ch5.singleton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ViewApp1_2 implements ActionListener {

	JFrame jf = new JFrame();
	JFrame jf2 = null;
	JButton jbtn = null;

	public void initDisplay() {
		jf2 = new JFrame();
		jbtn = new JButton();
		jbtn = new JButton("전송");
		// 이벤트 소스와 이벤트 처리를 담당하는 클래스를 연결해주어야 함.
		// 이벤트 처리를 담당하는 클래스를 이벤트 핸들러클래스라고 한다.
		// 이벤트처리를 담당하는 클래스는 반드시 actionPerformed라는
		// 메소드를 오버라이딩 해야한다.
		jbtn.addActionListener(this);

//		ViewAppEvent ve = new ViewAppEvent();
//		jbtn.addActionListener(ve);
		// 버튼을 북쪽에 배치

		jf2.add("North", jbtn);
		jf2.setSize(300, 200);
		jf2.setVisible(true);
	}

	public static void maind(String[] args) {
		ViewApp1_2 va = new ViewApp1_2();
		va.initDisplay();

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// ae.getSource()는 이벤트가 일어난 버튼의 주소번지를 반환해주는 메소드이다
		if (ae.getSource() == jbtn) {
			System.out.println("전송버튼 호출 성공");
		}
	}

}
