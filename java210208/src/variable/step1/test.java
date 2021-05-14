package variable.step1;

public class test {

	public static void main(String[] args) {
		Integer a = 10;
		int     b = 10;
		System.out.println("before: " + a);
		System.out.println("before: " + b);
		changeInteger(a);
		changeInt(b);
		System.out.println("After: " + a);
		System.out.println("After: " + b);
	}
	public static void changeInteger(Integer integer) {
		integer +=10;
	}
	public static void changeInt(int Int) {
		Int = Int + 10;
		System.out.println(Int);
	}

}
