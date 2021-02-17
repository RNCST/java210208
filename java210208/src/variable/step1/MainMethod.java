package variable.step1;

public class MainMethod {
	/******************************
	 * 
	 * @param args - 파라미터의 타입은 배열입니다. String args[] = new String[3]; main메소드는 좀 특별한
	 *             경우라서 따로 설명 오늘의 학습 목표 main메소드에 대해서 설명할 수 있다.
	 */
	public static void main(String[] args) {
		System.out.println(args[0] + 10);
		// args[]의 타입은 String
		// 타입을 체크할 수 있는 연산자가 있다.
		// 왜냐하면 자바는 컴파일 할때 타입을 따지기 때문
		if (args[0] instanceof String) {
			System.out.println("문자열");
		} else {
			System.out.println("문자열이 아님");
		}
		if (true) { // else가 실행할 경우는 죽어도 없다. true는 변수가 아닌 상수이기 때문
			System.out.println("참");
		} else {
			System.out.println("거짓");
		}
		
		
		for (int i = 0; i < 5; i = i + 1) { // 5회 실행
			if (true) { // else가 실행할 경우는 죽어도 없다. true는 변수가 아닌 상수이기 때문
				System.out.println("for참");
			}
		}
	}
}
