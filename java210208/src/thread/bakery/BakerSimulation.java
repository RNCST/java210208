package thread.bakery;

public class BakerSimulation {
	
	public static void main(String[] args) {
		BakerStack bs = new BakerStack();
		Baker b1 = new Baker(bs);
		b1.start();
		
		Customer c1 = new Customer(bs);
		c1.start();
	}
}
