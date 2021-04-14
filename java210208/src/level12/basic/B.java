package level12.basic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class B implements ActionListener{

	public B(A a) {
		System.out.println("B(A a)생성자 호출 성공");
	}

	@Override
	public void actionPerformed(ActionEvent e) { //콜백 메소드이며 자동호출
		Object obj = e.getSource();
		obj = e.getSource().getClass();
	}

}
