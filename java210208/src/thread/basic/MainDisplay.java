package thread.basic;

import javax.swing.JFrame;

/**
 * Thread Scheduler -- JVM이 관리 main Thread와 사용자 정의 Thread 관리
 * 
 * @author OSH
 *
 */
public class MainDisplay extends Thread {
	JFrame jf = null;

	public void initDisplay() {
		System.out.println("===run initDisplay()");
		jf = new JFrame();
		jf.setTitle("화면 출력");
		jf.setSize(500, 300);
		jf.setVisible(true);
	}

	public void run() {
		System.out.println("===run run()");
		try {
			sleep(5000);
			for (double d = 0; d < 100; d++) {
				System.out.println("=== d =" + d);
				if (jf != null) {
					jf.setTitle("화면 출력 => run()");
					jf.revalidate();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		MainDisplay mainDisplay = new MainDisplay();
		mainDisplay.initDisplay();
		mainDisplay.run();
	}

}
