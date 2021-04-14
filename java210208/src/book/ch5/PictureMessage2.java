package book.ch5;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;

public class PictureMessage2 extends JDialog{
	
	String imgPath = "C:\\KOSMO80\\workspace\\java210208\\java210208\\src\\images\\";
	JPanel jp_emoticon = new JPanel();
	GridLayout gl_emoticon = new GridLayout(1,5,2,2);
	JButton pic0 = new JButton();
	JButton pic1 = new JButton();
	JButton pic2 = new JButton();
	JButton pic3 = new JButton();
	JButton pic4 = new JButton();
	String imgFile[] = {"lion11.png","lion22.png","lion33.png","lion44.png","lion55png"};
	JButton imgButton[] = {pic0,pic1,pic2,pic3,pic4};
	ImageIcon img[] = new ImageIcon[imgButton.length];
	
	public PictureMessage2() {
		
		
	}
	
	public void initDisplay() {
		jp_emoticon.setLayout(gl_emoticon);

		for(int i = 0 ; i<imgButton.length;i++) {
			imgButton[i].setIcon(new ImageIcon(imgPath+imgFile[i]));
			imgButton[i].setBorderPainted(false);
			imgButton[i].setFocusPainted(false);
			imgButton[i].setContentAreaFilled(false);
		}
		
		
		jp_emoticon.add(pic0);
		jp_emoticon.add(pic1);
		jp_emoticon.add(pic2);
		jp_emoticon.add(pic3);
		jp_emoticon.add(pic4);
		add(jp_emoticon);
//		this.add("Center",jp_emoticon);
		setSize(500, 200);
		setVisible(true);
		
	}
	
	
	

	public static void main(String[] args) {
		PictureMessage2 pm = new PictureMessage2();
		pm.initDisplay();
	}

}
