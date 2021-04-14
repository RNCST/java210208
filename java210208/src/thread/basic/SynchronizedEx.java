package thread.basic;

public class SynchronizedEx extends Thread implements Runnable{

	public static void main(String[] args) {
		ATM atm = new ATM();
		Thread person1 = new Thread(atm, "person1");
		Thread person2 = new Thread(atm, "person2");
		person1.start();
		person2.start();
		
	}

}
