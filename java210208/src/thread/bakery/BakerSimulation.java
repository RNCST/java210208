package thread.bakery;

public class BakerSimulation {
	
	public static void main(String[] args) {
		BakerStack bakerStack = new BakerStack();
		
		Baker baker1 = new Baker(bakerStack);
		
		baker1.start();
		
		Customer customer1 = new Customer(bakerStack);
		
		customer1.start();
		
		Baker baker2 = new Baker(bakerStack);
		baker2.start();
		
		Customer customer2 = new Customer(bakerStack);
		customer2.start();
		
	}
}
