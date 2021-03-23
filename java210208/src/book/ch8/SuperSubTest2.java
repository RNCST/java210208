package book.ch8;

public class SuperSubTest2 {

	//자녀 클래스의 인스턴스화 시 어떻게 부모의 메소드우너형을 알고 있는 것인가?
	public static void main(String[] args) {
		Super a = new Super(); System.out.println("7");
		Super b = new Sub();   System.out.println("8");
//		Sub   c = new Super();
		Sub   d = new Sub();   System.out.println("10");
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(d);
		a=b;
		System.out.println(a);
		a=d;
		System.out.println(a);
	}
}
