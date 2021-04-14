package level12.basic;

import javax.swing.JButton;
import javax.swing.JFrame;

public class A extends JFrame{
	B b = null;
	JButton jb = null;
	public A() {
		initDisplay();
	}
	
	public void initDisplay() {
		b= new B(this);
		jb.addActionListener(b);
		setSize(500,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new A();
	}
}
