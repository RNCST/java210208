package com.pattern;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutView {

	public static void main(String[] args) {
			//버튼 객체를 5개 선언 및 초기화 하기 - 메모리에 로딩이 일어남.
			JButton jbtn_north  = new JButton("북쪽");
			JButton jbtn_south  = new JButton("남쪽");
			JButton jbtn_center = new JButton("중앙");
			JButton jbtn_east   = new JButton("동쪽");
			JButton jbtn_west   = new JButton("서쪽");
			//윈도우에서 독립된 창을 띄울떄 사용함.
			JFrame jf = new JFrame();
			//JFrame의 배치 레이아웃을 정함.
			jf.setLayout(new BorderLayout());
			//@param1: 위치정보, @param2 : 주소번지
			//jf.add("North",  jbtn_north);
			jf.add("South",  jbtn_south);
			jf.add("Center", jbtn_center);
			//jf.add("East",   jbtn_east);
			//jf.add("West",   jbtn_west);
			jf.setSize(500, 400);
			jf.setVisible(true);
			
	}

}
