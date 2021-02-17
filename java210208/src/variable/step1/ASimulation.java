package variable.step1;

public class ASimulation {

	public static void main(String[] args) {
		A a = new A();
		System.out.println("전역변수=0;"+a.eng);  
		System.out.println("전역변수=0;"+a.math);
		System.out.println("전역변수=0;"+a.kor);
		System.out.println("==================");
		System.out.println("전역변수;"+a.eng1);  
		System.out.println("전역변수;"+a.math1);
		System.out.println("전역변수;"+a.kor1);
		System.out.println("==================");
		System.out.println(a.eng2);
		System.out.println(a.math2);
		System.out.println(a.kor2);
		A a2 = new A();
		a2.eng2 = 95;
		a2.math2 = 85;
		a2.kor2  = 75;
		System.out.println("==================");
		System.out.println(a2.eng2);
		System.out.println(a2.math2);
		System.out.println(a2.kor2);
		// 같은 타입이지만 서로 다른 내용과 메소드의 처리결과를 가질 수 있다.
		// 인스턴스화를 할때마다 복제본이 여러개 생긴다.
	}

}
