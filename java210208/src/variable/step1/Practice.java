package variable.step1;

public class Practice {

	public static void main(String[] args) {
		Practice x = new Practice();
		x.methodX();
		x.methodX(5);
		//리턴타입 메소드이름(){ 실행문; }  - > 기초가 있다.
	}

	void methodX() {
		System.out.println(1);
	}
	
	void methodX(int y) {
		System.out.println();
	}

}
