package book.ch8;

public class Super {
	String title = null;
	public Super() {
		System.out.println("super() default constructor call");
	}public Super(String title) {
		System.out.println("super(title) default constructor call");
		this.title = title;
		
	}
	public void methodA() {
		System.out.println("Super methodA call");
	}
}
