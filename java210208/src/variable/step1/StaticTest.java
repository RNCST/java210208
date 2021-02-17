package variable.step1;

public class StaticTest {
	void arg() { /// 사용자 정의 메소드
		/*
		 * non-static타입은 static영역에서 접근 호출 사용 불가
		 */
 		}
	static void avg() {
		System.out.println("avg호출 성공");
	}

	public static void main(String[] args) {
		if(args[0]==null | args.length==0) {
			//아래문장은 조건에 따라 한번도 실행기회를 못 가질 수도 있다.
			System.out.println("입력해야함");
		return; // main메소드 탈출하기
    	}
		System.out.println(args[0] + 10);
		int imsi = Integer.parseInt(args[0]);//Integer클래스 안의 parseInt메소드
		System.out.println(imsi + 10);
		System.out.println("======"+imsi+10);
		//주소번지 없이도 호출할 수 잇는 메소드가 있다. 메소드 이름 앞에 static이 있다면.....
		// main메소드는 자바가 제공하는 메소드입니다. -- O
		// 사용자 정의 메소드도 가능하다.
		// 내가 필요한 메소드는 문자열을(파라미터로 넣었을떄)집어 넣으면 
		//int타입으로 변환하여서 반환(리턴,돌려주는, 대입연산자로 받을수있는)해주는 메소드
		// ==parseInt();
		StaticTest.avg();
	}

}


// Integer 클래스안에 static으로 선언된 메소드 이기 때문에 주소번지 대신에 "클래스타입명:메소드()"로 호출이 가능한 것입니다.
// avg()의 경우 메소드 앞에 static이 있어서 동일한 클래스 내에서 주소번지 없이도 호출할 수 있는 것이고
// Integer에 정의된 메소드 이므로 그러한 메소드들은(static int parseInt(String s)) 클래스타입명.메소드()로 호출
// static이 있는것은 하나를 공유하는 것이다 == 정적이다.
// 모든 사람(동시에 접속한 모든 게이머가 ) 같은 값, 즉 하나를 공유하는 개념이다.
// 클래스 내부에 정의가 되지만 다른 클래스들도 같이 사용할 수 있다.--->static
// 이런 것들은 자바 가상머신에서 다로 메모리 관리를 하겠다 ---- > static
// Integerㅏ는 것이 다른 클래스가 아닌 클래스가 가지고 있는 타입 중에 하나 입니다.
// 한 변수안의 값은 한번에 하나만 담을 수 잇지만 인스턴스를 생성하면 각 인스턴스마다 변수가 독립적으로 값이 변하며, 인스턴스마다 각각 값을 닮을 수 있다.

// String args[]= new String[3];
// args[0] = null;, args[1] = null;
// args==null == 배열을 가리키는 주소번지이다.
// args주소번지를 가지고 방의 갯수를 비교한다.