package ch5.singleton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandler implements ActionListener {
	ViewApp1_1   viewApp1_1 = null;
	//ViewApp1_1 viewApp = new ViewApp1_1;
	//원본을 쓰는게 아닌 복사본을 만드는 행동
	public EventHandler(ViewApp1_1 viewApp1_1) {
		this.viewApp1_1 = viewApp1_1;
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==viewApp1_1.jbtn) {
			System.out.println("전송 버튼이 눌림");
		}
		// TODO Auto-generated method stub

	}

}
