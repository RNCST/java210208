package book.ch4;

import java.util.Scanner;

public class frStar {
	Scanner sc = new Scanner(System.in);

	void forA() {
		int input = sc.nextInt();
		for (int cycle = 0; cycle < input; cycle++) {
			for (int z = 0; z <= cycle; z++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

	void forB() {
		int input = sc.nextInt();
		for (int cycle = 0; cycle < input; cycle++) {
			for (int rcycle = cycle + 1; rcycle < input; rcycle++) {
				System.out.print(" ");
			}

			for (int z = 0; z <= cycle; z++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

	void forC() {
		int input = sc.nextInt() - 1;
		{
			for (int cycle = 0; cycle < input; cycle++) {
				System.out.print(" ");

			}
			System.out.println("*");
			for (int cycle = 0; cycle < input; cycle++) {
				for (int rcycle = cycle + 1; rcycle < input; rcycle++) {
					System.out.print(" ");
				}
				System.out.print("*");
				for (int cycle2 = 0; cycle2 <= cycle; cycle2++) {
					System.out.print("*");
				}

				for (int cycle2 = 0; cycle2 <= cycle; cycle2++) {
					System.out.print("*");
				}

				for (int rcycle = cycle + 1; rcycle < input; rcycle++) {
					System.out.print(" ");
				}
				System.out.println(" ");
			}
		}
	}

	void forD() {
		int input = (sc.nextInt() - 1);
		{
			for (int cycle = 0; cycle < input; cycle++) {
				System.out.print(" ");

			}
			System.out.println("*");
			for (int cycle = 0; cycle < input; cycle++) {
				for (int rcycle = cycle + 1; rcycle < input; rcycle++) {
					System.out.print(" ");
				}
				for (int cycle2 = 0; cycle2 <= cycle; cycle2++) {
					System.out.print("*");
				}

				System.out.print("*");
				for (int cycle2 = 0; cycle2 <= cycle; cycle2++) {
					System.out.print("*");
				}

				for (int rcycle = cycle + 1; rcycle < input; rcycle++) {
					System.out.print(" ");
				}
				System.out.println(" ");
			}
		}
		for (int cycle = 0; cycle < input - 1; cycle++) {

			for (int rcycle = cycle + 1; rcycle != 0; rcycle--) {
				System.out.print(" ");
			}
			for (int cycle2 = input - cycle - 1; cycle2 != 0; cycle2--) {
				System.out.print("*");
			}
			System.out.print("*");
			for (int cycle2 = input - cycle - 1; cycle2 != 0; cycle2--) {
				System.out.print("*");
			}
			for (int rcycle = cycle + 1; rcycle != 0; rcycle--) {
				System.out.print(" ");
			}
			System.out.println(" ");
		}

		for (int cycle = 0; cycle < input; cycle++) {
			System.out.print(" ");

		}
		System.out.println("*");
	}

	public static void main(String[] args) {
		frStar f = new frStar();
		f.forA(); // 별
		f.forB(); // 역별
		f.forC(); // 피라미드
		f.forD(); // 모래시계
	}

}