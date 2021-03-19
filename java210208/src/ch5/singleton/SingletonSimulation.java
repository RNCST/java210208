package ch5.singleton;

public class SingletonSimulation {

	public static void main(String[] args) {
		Singleton1_1 A = Singleton1_1.getInstance();
		Singleton1_1 B = Singleton1_1.getInstance();
		Singleton1_1 C = Singleton1_1.getInstance();
		
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		
	}

}
