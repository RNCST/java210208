package practice;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class P0217N02_3 extends JFrame {

	public static void main(String[] args) {
		P0217N02_3 rgview = new P0217N02_3();
		JPanel jp_center = new JPanel();
		JPanel jp_east = new JPanel();
		JButton jbtn_new = new JButton("새게임");
		JButton jbtn_dap = new JButton("정답");
		JButton jbtn_clear = new JButton("지우기");
		JButton jbtn_exit = new JButton("나가기");
		
		jp_east.add(jbtn_new);    //  새 게임  버튼
		jp_east.add(jbtn_dap);    //  정답      버튼
		jp_east.add(jbtn_clear);  //  지우기   버튼
		jp_east.add(jbtn_exit);   //  나가기   버튼 디폴트 위치가 오른쪽인가??
		jp_east.setLayout(new GridLayout(4, 1)); // 버튼이 세로 4칸 가로 1칸
		JTextArea jta_display = new JTextArea(5, 30); // 입력 창 위에 결과가 나오는 곳 
		JTextField jtf_input = new JTextField();      // 입력창
		jp_center.setLayout(new BorderLayout());
		jp_center.add("Center", jta_display);         // 입력 창 위에 결과가 나오는 곳 
		jp_center.add("South", jtf_input);            // 입력 창
		rgview.add("Center", jp_center);			  // 왼쪽이 출력
		rgview.add("East", jp_east);				  // 오른쪽이 출력
		rgview.setTitle("난수 게임. Ver1.0");			  // 팝업 제목 설정
		rgview.setSize(400, 300);
		rgview.setVisible(true);					  // 화면 팝업의 활성화

	}

}
