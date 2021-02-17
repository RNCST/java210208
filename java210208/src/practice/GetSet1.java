package practice;

public class GetSet1 {
	int num1;
	String word1=null;
		
	GetSet1 plGetSet1(String word1) {
		return new GetSet1();
	}
	// new 클래스이름 ==> 생성자
	// 인스턴스화는 생성자를 통해서 하는것.
	// 프로그램을 만들때 두번 읽고나서 실행 
	// 이 과정을 통해서 아래에 있는것들도 실행할수 있게됨
	
	// 클래스 메소드 이름(타입 변수) 리턴 뉴 클래스(??) 
	public GetSet1(int num1, String word1) {
		super();
		//상속을 했을경우 부모클래스의 constructor를 부르는것.
		this.num1 = num1;
		this.word1 = word1;
	}

	plGetSet2(String word1){
	}
	// 반환형 타입(x) 메소드만(타입 변수) (??)
	void plGetSet3(String word1) {
		
	}
	// 반환형 타입(x) 메소드(타입 변수) 
	public static void main(String[] args) {
	GetSet1 a = new GetSet1(4,("4"));
//	a.plGetSet1("a");
//	a.num1 = 4; 
	System.out.println(a.num1);
//	a.word1 = "4";
	System.out.println(a.word1);
	GetSet1 b = new GetSet1(5,("5"));
	System.out.println(b.num1);
	System.out.println(b.word1);
		
	}
}
