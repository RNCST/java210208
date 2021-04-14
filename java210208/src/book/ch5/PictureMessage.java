package book.ch5;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;

public class PictureMessage extends JDialog{
	
	String imgPath = "C:\\KOSMO80\\workspace\\java210208\\java210208\\src\\images\\";
	JPanel jp_emoticon = new JPanel();
	GridLayout gl_emoticon = new GridLayout(1,5,2,2);
	JButton pic0 = new JButton();
	JButton pic1 = new JButton();
	JButton pic2 = new JButton();
	JButton pic3 = new JButton();
	JButton pic4 = new JButton();
	String imgFile[] = {"lion11.png","lion22.png","lion33.png","lion44.png","lion155png"};
	JButton imgButton[] = {pic0,pic1,pic2,pic3,pic4};
	ImageIcon img[] = new ImageIcon[imgButton.length];
	
	public PictureMessage() {
		
		
	}
	
	public void initDisplay() {
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
		for(int i=0 ; i<imgButton.length; i++) {
			img[i] = new ImageIcon(imgPath+imgFile);
			imgButton[i].setIcon(img[i]);
		}
		jp_emoticon.setLayout(gl_emoticon);
		jp_emoticon.add(pic0);
		jp_emoticon.add(pic1);
		jp_emoticon.add(pic2);
		jp_emoticon.add(pic3);
		jp_emoticon.add(pic4);
		this.add("Center",jp_emoticon);
		setSize(500, 200);
		setVisible(true);
		
	}
	
	
	

	public static void main(String[] args) {
		PictureMessage pm = new PictureMessage();
		pm.initDisplay();
	}

}
