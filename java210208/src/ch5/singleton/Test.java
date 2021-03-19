package ch5.singleton;

public class Test {

	public static void main(String[] args) {
		Singleton1_1 s1 = new Singleton1_1();
		System.out.println(s1);
		
		s1 = null; // Candidate 상태로 빠진다.
		s1 = new Singleton1_1();
		System.out.println(s1);
		
		s1 = null;
		s1 = new Singleton1_1();
		System.out.println(s1);
		
		
		Singleton1_1 uniqueInstance = Singleton1_1.getInstance();
		System.out.println(uniqueInstance);
		Singleton1_1 uniqueInstance2 = Singleton1_1.getInstance();
		System.out.println(uniqueInstance2);
		Singleton1_1 uniqueInstance3 = Singleton1_1.getInstance();
		System.out.println(uniqueInstance3);
	}

}
