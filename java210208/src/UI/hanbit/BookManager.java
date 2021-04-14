package UI.hanbit;

import javax.swing.JFrame;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BookManager extends JFrame{
	Logger logger = LogManager.getLogger(BookManager.class);
	//선언
	JFrame jf = new JFrame();       //new Window(); 클래스 자체 인스턴스화
	static JFrame bm = new BookManager();  //new JFrame(); 클래스 상속
	static BookManager bm2 = new BookManager();  //new JFrame(); 클래스 상속
	static BookManager bm3 = null;
	
	//생성자
	public BookManager() {
//		initDisplay();
//		this.setSize(300,400); //BookManager.setSize
//		super.setSize(600,700);//     JFrame.setSize
//		bm.setVisible(true);   //setvisible에 대해 오버라이딩 하지 않음. 부모의 메소드가 호출
		this.setSize(400,600);
		this.setVisible(true);
	}
	
	//화면처리부
	public void initDisplay(){
		logger.info("===run initDisplay()");
		
	}
    //메인메소드
	public static void main(String[] args) {
//		BookManager bookManager = new BookManager();
//		bookManager.initDisplay();
		bm3 = new BookManager();
		bm3.initDisplay();
	}
}
/*
 *   1. static BookManager bm3 = null;
 *   2. bm3 = new BookManager();
 *   3. public BookManager() {
 *   4. this.setSize(~~)          ==> bm3 이 아직 null; 이고 초기화가 되지 않았기에..
 *   
 * 
 */