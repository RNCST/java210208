package practice;

import java.util.Scanner;

public class P0215N01_1 {

	boolean methodA() {
		double input;
		boolean isDouble;
		boolean reload;
		Scanner s = new Scanner(System.in);

//		try {
//			input = s.nextInt();
//		} catch (Exception e) {
//			System.out.println("Exception : " +e.toString());
//			return;
//		}
		isDouble = s.hasNextDouble();
		if (isDouble) {
			input = s.nextInt();
			System.out.println(input* 0.17);
			reload = true;
		} else {

			System.out.println("정수를 입력해주세요");
			reload = false;
		}
		return reload;
	}

	void methodB() {
		for (;!methodA();) {

		}

	}

	public static void main(String[] args) {
		P0215N01_1 run = new P0215N01_1();
		run.methodB();
	}

}
