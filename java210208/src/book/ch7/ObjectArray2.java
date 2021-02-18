package book.ch7;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ObjectArray2 {

	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setLayout(new GridLayout(1,3));
		JButton jbtn_first = new JButton();
		jbtn_first.setText("0");
		jf.add(jbtn_first);
		jf.setSize(300, 200);
		jf.setVisible(true);
		
	}

}
