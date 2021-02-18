package book.ch7;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ObjectArray {

	public static void main(String[] args) {
		JFrame jf = new JFrame(); // 윈도우 운영체제에에서 바깥쪽 창을 띄울떄사용하는 클래스 
		jf.setLayout(new GridLayout(2,10));// 가장 바깥쪽 창안에 버튼을 배치하기위해선 Layout설정이 필요함.(row,column)
		JButton jbtns[] = new JButton[10]; // 버튼 갯수가 10개 이므로 객체 배열 크기를 10로함
		String jbtn_label[] = {"0","1","2","3","4","5","6","7","8","9"};// 버튼의 숫자값을 출력하는데 배열을 사용하면 배열사용
		JButton jbtn = null;
		for(int i = 0 ;i<jbtns.length;i++) {
			//14열에서 생성 및 초기화딘 문자열 배열을 JButton객체를 생성할 때 생성자의 파라미터로 사용하여 버튼의 라벨을 출력하였다.
			jbtn = new JButton(jbtn_label[i]);
			jbtns[i] = jbtn;
			jf.add(jbtn);
			System.out.println(jbtns+", "+jbtn+", "+jbtns[i].getText());  // jbtns 도 주소번지이고 jbtn도 주소번지
		}
		
		jf.setTitle("객체 배열 실습");
		jf.setSize(400, 300);
		jf.setVisible(true);
	}

}
