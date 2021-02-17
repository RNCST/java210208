package practice;

public class P0216N02 {
	int x;

// Question 12 : 변수의 적용범위
	public static void main(String[] args) {
		P0216N02 p = new P0216N02();
		int y = 5;
		p.doStuff(y);
		p.doStuff(p.x);
		
		int x = p.doStuff(p.x); //
		int z = p.doStuff(y);
		System.out.println(" main x = " +x);
		System.out.println(" main x = " +p.x);
		System.out.println(" main x = " +y);
		System.out.println(" main x = " +z);
	}

	int doStuff(int x) {
		System.out.println(" doStuff x = " + x++);
		System.out.println(" doStuff2 x = " + x++);
	return x;
	}
}
//		What is the result?  //결과는 무엇인가?
//		A. Compilation fails.
//		B. An exception is thrown at runtime.
//		C. doStuffx = 6 main x = 6
//		D. doStuffx = 5 main x = 5   
//		E. doStuffx = 5 main x = 6  ;;
//		F. doStuffx = 6 main x = 5
