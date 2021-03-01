package com.ocjp;
//Question 36 : static메서드와 메서드의 차이점
//Given:
//10. class Foo {
//11. static void alpha() { /* more code here */ }
//12. void beta() { /* more code here */ }
//13. }
//Which two are true? (Choose two.)
//A. Foo.beta() is a valid invocation of beta().      
//B. Foo.alpha() is a valid invocation of alpha().    oo
//C. Method beta() can directly call method alpha().  oo
//D. Method alpha() can directly call method beta().  
//
//
//

class other{
	void methodC() {
	Kquiz_36_staticmethod.methodB(); 
	//다른 클래스의 스태틱 메소드를 호출할때는 클래스.메소드 
	Kquiz_36_staticmethod a = new Kquiz_36_staticmethod();
	a.methodA();
	}
}
public class Kquiz_36_staticmethod {

	static {
		System.out.println("static block");		
	} // static 블럭
	void methodA() {
		System.out.println("non static method");
	}
	static void methodB() {
		System.out.println("static method");
	}
	//메인메소드도 static이다.
	//main thread라고 한다. 우선순위가 높다.
	//JS는 싱글스레드이다.
	public static void main(String[] args) {
		System.out.println("static main");		
		methodB();
		
		
	}
	
	//static 메소드안에서 non static 메소드를 그대로 쓰는 것은 불가능 하며 인스턴스화를해야함.
	//non-static메소드안에서 static 메소르를 그대로 쓰는 것이 가능.

}
