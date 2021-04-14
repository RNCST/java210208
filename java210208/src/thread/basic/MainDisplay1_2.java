package thread.basic;

public class MainDisplay1_2 extends Thread {
	public static void main(String[] args) {
		System.out.println("===run main()");
		Runnable r1 = new MyRunningTwo();
		Thread thread = new Thread(r1);
		thread.start();
		try {
			thread.join();
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
//		System.out.println("===end main()");
		System.out.println("==="+Thread.currentThread().getName()+" end");
	}
}

class MyRunningTwo implements Runnable{

	@Override
	public void run() {
		System.out.println("===run run()");
		first();
	}
	public void first() {
		System.out.println("===run first()");
		second();
	}
	public void second() {
		System.out.println("===run second()");
		
	}
	public void third() {
		System.out.println("===run third()");
	}
}
