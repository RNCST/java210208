package ch5.singleton;

/**
 * @author OSH
 * 싱글톤 패턴의 정의
 * 해당 클래스의 인스턴스가 하나만 만들어지고 어디서든지 그 인스턴스에 
 * 접근할 수 있도록 하기위한 패턴이다.
 * 고전적인 싱글톤 패턴 구현법
 */
public class Singleton1_1 {
	//싱글톤은 동시성을 고려한 설계이어야 한다 서버에서 두사람이 거의 동시에 요청할 수 있다.
	//2개만들어지면 안전하지 않다.
	private static Singleton1_1 uniqueInstance = null;
	int speed = 0;
	public void stop() {
		System.out.println("stop 메소드 호출");
		speed = speed -1;
		
	}
	private        Singleton1_1() {
		
	}
	
	//동기화된 메소드이다. 절대로 동시에 입장할 수 없다.
	//0.1초라도 늦으면 기다렸다가 입장이 된다 == 2개가 만들어질수없다.
	public  static synchronized Singleton1_1 getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new Singleton1_1();
		}
		return uniqueInstance;
	}
}
