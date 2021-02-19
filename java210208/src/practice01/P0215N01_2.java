package practice01;

import java.util.Scanner;

class Common {
	Scanner sc = new Scanner(System.in);

	void weight1() {
		int input = sc.nextInt();
		System.out.println(input * 0.17);
	}

	void weight2(int weight) {
		System.out.println(weight * 0.17);
	}
}

public class P0215N01_2 {

	public static void main(String[] args) {
		Common cm = new Common();
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		System.out.println(input * 0.17);

		cm.weight1();
		int input2 = s.nextInt();
		cm.weight2(input2);
		cm.sc.close();
	}

} // try catch 함수 // 무한루프??
