//Question 52 : switch문
//Given:
//11. public class Test {
//12. public enum Dogs {collie, harrier, shepherd};
//13. public static void main(String [] args) {
//14. Dogs myDog = Dogs.shepherd;
//15. switch (myDog) {
//16. case collie:
//17. System.out.print(”collie “);
//18. case default:  
//19. System.out.print(”retriever “);
//20. case harrier:
//21. System.out.print(”harrier “);
//22. }
//23. }
//24. }
//‘What is the result?
//A. harrier
//B. shepherd
//C. retriever
//D. Compilation fails.
//E. retriever harrier
//F. An exception is thrown at runtime.
//일찍 입장한 사람들 한 번 풀어보세요
package com.ocjp;

public class Kquiz_52_switch {
	public enum Dogs {
		collie, harrier, shepherd
	};

	void m() {
		System.out.println("===");
		System.out.println(Dogs.collie);
		System.out.println(Dogs.harrier);
		System.out.println(Dogs.shepherd);
		String name = "이순신";
		switch (name) {
		case "collie":
			System.out.println("collie");
		case "이순신":
			System.out.println("이순신");
		default:
			System.out.println("default");
		}
	}

	public static void main(String[] args) {
		Dogs myDog = Dogs.shepherd;
		switch (myDog) {
		case collie:
			System.out.println("collie");
		default:
			System.out.println("default");
		case harrier:
			System.out.println("harrier");
//		case shepherd:	
//			System.out.println("shepherd");
		}
		Kquiz_52_switch a = new Kquiz_52_switch();
//		a.m();
	}

}

//‘What is the result?
//A. harrier
//B. shepherd
//C. retriever
//D. Compilation fails.
//E. retriever harrier
//F. An exception is thrown at runtime.
