package practice;

public class P0216N01_1 {

	public static void main(String[] args) {

		int i = 1;
		int j = 2;
		if ((++i > j--)/*2>2*/ && (++i > j))/*3>1*/ { // False ~ True
			System.out.println("y"+i+""+j);
		} else {
			System.out.println("n"+i+""+j);
		}
		i = 1;
		j = 2;
		if ((++i > --j)/*2>1*/ & (++i > j))/*3>1*/ {  // True ~ True
			System.out.println("y"+i+""+j);
		} else {
			System.out.println("n"+i+""+j);
		}
		i = 1;
		j = 2;
		if ((++i == j--)/*2=2*/ || (++i < j))/*3<1*/ { // True ~ False
			System.out.println("y"+i+""+j);
		} else {
			System.out.println("n"+i+""+j);
		}
		i = 1;
		j = 2;
		if ((++i == j--)/*2=2*/ | (++i < j))/*3<1*/ { // True ~ False
			System.out.println("y"+i+""+j);
		} else {
			System.out.println("n"+i+""+j);
		}

//		int a = 5;
//		int b = 5;
//		System.out.println("==");
//		if (a == 5 && b == 5)
//			System.out.print("y");
//		System.out.println("n");
//		if (a == 5 & b == 5)
//			System.out.print("y");
//		System.out.println("n");
//		System.out.println("==");
//		if (a == 5 && b == 6)
//			System.out.print("y");
//		System.out.println("n");
//		if (a == 5 & b == 6)
//			System.out.print("y");
//		System.out.println("n");
//		System.out.println("==");
//		if (a == 6 && b == 5)
//			System.out.print("y");
//		System.out.println("n");
//		if (a == 6 & b == 5)
//			System.out.print("y");
//		System.out.println("n");
//		System.out.println("==");
//		if (a == 6 && b == 6)
//			System.out.print("y");
//		System.out.println("n");
//		if (a == 6 & b == 6)
//			System.out.print("y");
//		System.out.println("n");
//		System.out.println("==");

	}

}
