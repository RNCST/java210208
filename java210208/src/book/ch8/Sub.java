package book.ch8;

public class Sub extends Super {
	
	public Sub() {
		System.out.println("sub() default constructor call");
	}public Sub(String title) {
		System.out.println("sub(title) default constructor call");
		this.title = title;
		
	}
	@Override
	public void methodA() { // 메소드 오버라이딩 == 상위클래스에 있는 메소드를 끌어다가 쓰는것?
		System.out.println("sub methodA call");
	}
	public void methodA(int x) { // 메소드 오버로딩 == 같은 메소드에 파라미터값만 바뀌는것?
		System.out.println("sub methodA(int) call");
	}
	public void methodB() {
		System.out.println("sub methodB call");
	}

}
