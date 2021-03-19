package thread.bakery;

public class Customer extends Thread{
	BakerStack bs = null;
	public Customer(BakerStack bs) {
		this.bs = bs;
		// TODO Auto-generated constructor stub
	}
	public void run() {
		String bread = null;
		bread = bs.pop();
		try {
			sleep((int)(Math.random()*1000));
		} catch (InterruptedException e) {
			System.out.println("WHO?.....");

		}
	}

}
