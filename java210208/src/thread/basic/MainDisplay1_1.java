package thread.basic;

public class MainDisplay1_1 extends Thread {
	public static void main(String[] args) {
		System.out.println("===run main()");
		Runnable r1 = new MyRunningOne();
		Thread thread = new Thread(r1);
		thread.start();
		System.out.println("===end main()");
	}
}

class MyRunningOne implements Runnable{

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
