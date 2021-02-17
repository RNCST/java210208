package practice;

public class Parameter {
	String a = "OK";

	public static void main(String[] args) {

		Parameter P = new Parameter();  // 이자리 파라미터가 채워진다면??
		P.methodA("NO");
		P.methodA("OK");
		P.methodA("a");
		
		P.methodB(1);
		P.methodB(2);
		P.methodB(3);

	}
// 같은 메소드 이름에 같은 파라미터는 안된다 
	void methodA(String a) {
		if (a == "OK") {
			System.out.println("OK!!!!");
		} else {
			System.out.println("ASDF");
		}
	}
	
	void methodA(String b) {
		System.out.println(1);
	}

	void methodB(int a) {
		if (a == 2) {
			System.out.println("ok");
		} else {
			System.out.println("int "+a);

		}
	}
}
