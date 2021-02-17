package variable.step1;

public class Quiz1 {
	int x;

	// 메소드에서는 2가지 종류가 있다.
	// JVM에서 제공되는 메소드와 사용자 정의 메소드
	// 메소드 선언 순서는
	// 리턴타입 메소드이름(){ 실행문; } - > 기초가 있다.
	// 메소드 선언할 때 리턴타입과 반환타입을 결정할 수 있다. - > 기초가 아닌 코딩을 해봐야 안다.
	public static void main(String[] args) {

		Quiz1 q = new Quiz1();
		q.methodA(  );   // 선언이 아닌 ;로 끝났을때는.호출 
		q.methodA(5);
		q.methodA(3.14);
		q.methodA(6);
		q.methodA(5.5);
		q.methodA(5.5f);
	}

//methodA의 호출이 선언 앞에 오더라도 에러가 아님.
//자바는 절차지향의 프로그램 언어가 아니이기 때문.
//자바는 객체지향의 언어이므로 호출순서와는 상관이 없다.
//자바에서는 같은 이름의 메소드를 중복하여 선언할 수 있다.
//이것을 가능하게 하는 규칙은 메소드 오버로딩이다.
//메소드 오버로딩은 반드시 파라미터의 타입이 다르거나(합집합:둘 중의 하나만 만족해도 참) 파라미터의 갯수가 달라야한다.
//주의사항:리턴타입이 있고 없고는 영향을 주지 않는다.
	void methodA() {// private으로 하면 내 안에서만 사용할 수 있다. 외부의 클래스에서는 접근이 안됨
		System.out.println("methodA호출 성공");
	}

	void methodA(int x) {
		// 저장이 될때에 이클립스의 컴파일이 실행된다.
		System.out.println(x);
		System.out.println();
	}   // {} 를 메소드를 선언했다고 얘기한다. 

	int methodA(double x) {
		System.out.println(x);
		return 0; //
	}

	double methodA(float x) {
		System.out.println(x);
		return 6.6;
	}

}
