package ch5.singleton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class EventHandler2 implements ActionListener {
	ViewApp2_1   viewApp = null;
	//ViewApp1_1 viewApp = new ViewApp1_1;
	//원본을 쓰는게 아닌 복사본을 만드는 행동
	public EventHandler2(ViewApp2_1 viewApp) {
		this.viewApp = viewApp;
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==viewApp.jbtn) {
			System.out.println("실행 성공");
		}
		// TODO Auto-generated method stub

	}

}
