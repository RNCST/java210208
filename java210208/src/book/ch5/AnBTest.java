package book.ch5;

class A1 {
	int i = 0;
	void dPrint() {
		B1 b = new B1();
		double result = b.d;
		System.out.println("double result="+result);
	}
}
class B1 {
	double d = 0.00;
	void iPrint() {
		A1 a = new A1();
		int result = a.i;
		System.out.println("int result="+result);
	}
}
public class AnBTest {

	public static void main(String[] args) {
		A1 a = new A1();
		B1 b = new B1();
		a.dPrint();
		b.iPrint();
	}
}
