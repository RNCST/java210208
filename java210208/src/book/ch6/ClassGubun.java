package book.ch6;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ClassGubun extends JFrame {
	JButton jb_search = new JButton("조회");
	JButton jb_exit = new JButton("종료");

	public void start() {
//		jb_search.addActionListener(cg2.ClassGubun$1.class);
		jb_search.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("조회눌림");
			}

		});

		jb_exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("종료눌림");

			}

		});
	}

	public void initDisplay() {
		this.setLayout(new FlowLayout(FlowLayout.RIGHT));
		this.add(jb_search);
		this.add(jb_exit);
		this.setSize(400, 300);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		ClassGubun cg = new ClassGubun();
		cg.start();
		cg.initDisplay();
	}

}
