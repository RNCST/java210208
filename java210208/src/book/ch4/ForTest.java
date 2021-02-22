package book.ch4;
//자바언어를 사용해서 코딩을 저낵하려면 보안문제로 반드시 package을 정의하도록 권장하고 있다.
//디폴트 패키지는 불가하다.
//그 다음에 클래스 선언문이 온다. - 형식이다.표준이다. 약속이다.
//모든 코딩은 class 선언에 좌중괄호와 우중괄호안에 와야 한다. -  자바는 기본 단위가 클래스이다.
//롤백 메소드이다 = 시스템이 호출하는 메소드이다. = 개발자는 죽어도 호출할 수 없다. -main메소드 안에 코딩하는 것은 나쁜 방법이다.
//메인메소드를 선언하려면 반드시 클래스 선언이 먼저이다. 처리 주체가 jvm 즉 가상머신이다., - 일꾼이 가상머신이다.
//모든 코딩의 기준은 자바가상 머신이 해석 할 수 있는 방식으로 코딩이 전개 되어야 한다.
//클래스 선언하기는 
//접근제한자 CLASS라는 예약어 그리고 클래스명 순서고 선언됩니다.
//public private protected 같은 패키지에 있는 클래스 끼리는 공유 가능하다.(friendley 상태) == class A();
//클래스 내부는 선언부와 메소드 선언부로 나누어서 코딩을 전개해본다.
//상속은 결합도가 높다 = 단위테스트가 힘들다  = 단독 테스트가 힘들다.
public class ForTest {
	//선언부
	int n = 0;
	int Esum;
	int a;
	//전역변수이며 초기화를 생략할 수 있다. 생성자가 있는데 역할이 전변의 초기화를 담당한다.
	//지역변수는 선언이 불가하다.
	//if문이나 for문은 사용이 불가하다. - 실행문을 가지고 있다. Esum = Esum + i;//실행문,공식,알고리즘
	//선언과 초기화를 분리할 수 없다. - 컴파일이 안되니까 실행할 수 없다.\''
	//int i; i=10; (x) int i =10; (o) 메소드 안에서는 된다. 선언부에서만 안된다.
	
	//메소드 안에서는 메소드 선언은 하지 않는다. 왜냐하면 호출할 수 없으니까.
	//예외를 많이 둔다.
	//일관성이 있다.일관성이 있어야 협업이 가능해진다.
	//반복되는 코드는 줄여야 한다.
	//이중으로 관리되지 않도록 해야 한다.ㅈ
	public ForTest() {
		System.out.println("디폴트 생성자 호출");
		
	}
	//// end of 선언부
	//메소드를 선언한 영역 - 구분 // 선언부에는 실행문을 적을 수 없다.
	void methodA() {}//friendly 상태이다.
	public static void main(String[] args) {
		ForTest instance = new ForTest();
		System.out.println(instance);
		ForTest instance1 = new ForTest();
		System.out.println(instance1);
		instance.a = 0;
		int n = 0;
//		int Esum = 0;
		int Osum = 0;
		for (int i = 1; i <= 10; i = i + 1) {
			if (i % 2 == 0) {
				instance.Esum = instance.Esum + i;
				System.out.println(n +"번째 짝수까지 합은" + instance.Esum);
				System.out.println(n +"번째 짝수까지 합은" + instance1.Esum);
			} else {
				Osum = Osum + i;
				n = n + 1;
				System.out.println(+ n +"번째 홀수까지 합은" + Osum);

			}

		}
		System.out.println(instance);

	}
		
		
	
	void method(){
		System.out.println(n+3);}
		
	
}
 


