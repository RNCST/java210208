package variable.step1;

public class Variable {
	// 선언부
	// 메소드 선언
	void methodA(int x) {
	}

	String methodB(String x) {
		return "x";
	}

	// 메소드선언 - 메소드가 선언되어야 exe파일로 만들수 있음.
	/**********************************
	 * 문제해결능력 키움
	 * 
	 * @return void이다 - 비어있다, 돌려 받을 수 있는 값이 없다. - 이것 때문에 에러가 날 수 있다.
	 * @param args
	 */
	public static void main(String[] args) {
		// 컴퓨터.출력장치(하드웨어).
		System.out.println(5);// 줄바꿈이 안됨, 메소드호출-->주소번지.methoA();
		// 메소드 선언할 때는 좌중괄호 우중괄호를 사용
		// 메소드 호출할때는 ;
		// API, XXX.jar, 이 안에 있는 것을 꺼내쓴다.이 안==(클래스안에 , 객체[결정되지 않았다.] 안에)
		// 클래스는 구체적이다(코딩을 하는 목적에선)
		// print메소드는 여러개다. = 같은 이름의 메소드를 여러개 만들 수 있다.
		// System.out.print(); 줄바꿈이 안됨 빈상태로 치면(파라미터=사용자가 입력한값) 컴파일이 안됨.
		// System.out.print(); 반환값이 없어서 에러가 나는것, 반환값 == 출력결과물
		Variable v = new Variable();
		// v = 주소.번지 정의
		System.out.println(v.methodB("y")); // double(반환값이 있음)로 있어서 에러가 아닌것.
		// System.out.println(v.methodA(1)); //void(반환값이 없음) 에러가 난것.
		// input - process - output, 반환값==output
		System.out.println(10 + 10); // 20
		System.out.print(10 + "10"); // 1010
		System.out.println(); // 줄바꿈 추가된 메소드

	}

}
