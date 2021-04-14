package thread.bakery;

public class Customer extends Thread{
	BakerStack bakerStack = null;
	
	public Customer(BakerStack bakerStack) {
		System.out.println("===run Customer(BakerStack bakerStack)");
		this.bakerStack = bakerStack;
		// TODO Auto-generated constructor stub
	}
	
	
	public void run() {
		System.out.println("===run Customer.start() and Customer.run()");
		String bread = null;
		bread = bakerStack.pickBread();
		try {
			sleep((int)(Math.random()*1000));
		} catch (InterruptedException e) {
			System.out.println("WHO? Exception");

		}
	}

}
