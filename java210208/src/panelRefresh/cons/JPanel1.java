package panelRefresh.cons;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JPanel1 extends JPanel {
	String cols[] = {"대화명"};
	String data[][] = new String[0][1];
	//이른 인스턴스화를 하면 변화요인이 발생했을 경우 대처하기가 어렵다.
	//중간에 다른정보로 변경이나 변화를 주기가 쉽지 않다.
	//이런 상황일때는 객체 생성으로 인한 생성자 호출에 주의가 필요하다
	DefaultTableModel dtm = new DefaultTableModel(data,cols);
	JTable            jtb = new JTable(dtm);
	JScrollPane       jsp = new JScrollPane(jtb
			                   ,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED
			                   ,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	public JPanel1() {
		initDisplay();
	}
	public void initDisplay() {
		this.setLayout(new BorderLayout());
		this.add("Center",jsp);
		this.setSize(400, 300);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new JPanel1();
	}
}
