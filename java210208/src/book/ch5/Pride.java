package book.ch5;

/**
 * 싱글톤 패턴의 정의 해당 클래스의 인스턴스가 하나(정적)만 만들어지고 어디서든지(public) 그 인스턴스에 접근할 수 있도록 하기 위한
 * 패턴이다. 
 * 클래스변수 - 
 * 스태틱 인스턴스변수 - 
 * 방법 1 - 고전적인 싱글톤 패턴 구현법 
 * 방법 2 - 성능이나 병목현상을 고려하여 구현하기
 * 방법 3 -
 * 
 * @author OSH
 *
 */
public class Pride {
	// 클래스 변수 (static이 붙은 변수) == 공유 == 값을 하나만 가진다.
	static int wheelNum = 0;
	int speed = 0;

	// 생성자 캡슐화 (private)
	private Pride() {

	}

	public Pride(int speed) {
		this.speed = speed;
	}

	public Pride(int speed, int wheelNum) {
		this.wheelNum = wheelNum;
		this.speed    = speed;
	}
	
	void speedup() {
		speed = speed +1;
	}
	
	void speedu(int u) {
		speed = speed +u;
	}
	
	void speedd(int d) {
		speed = speed -d;
	}
	
	void speedstop(){
		speed = 0;
	}
	
	static void change() {
		wheelNum = 2;
	}

}








