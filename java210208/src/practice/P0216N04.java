package practice;

import java.util.Scanner;

public class P0216N04 {
//두 개의 정수 사이에 3의 배수의 갯수는 몇개일까요
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i1;
		int i2;
		boolean isInt;
		boolean isInt2;
		isInt = sc.hasNextInt();
		if (isInt) {
			i1 = sc.nextInt();
		} else {
			System.out.println("정수를 입력해주세요");
			return;
		}

		isInt2 = sc.hasNextInt();
		if (isInt2) {
			i2 = sc.nextInt();
		} else {
			System.out.println("정수를 입력해주세요");
			return;
		}
		int o;
		if (i1 > i2) {
			o = i1;
			i1 = i2;
			i2 = o;
		}
		int i;
		int z = i1;
		int count = 0;
		for (i = i1; i <= i2; i = i + 1) {
			if (z % 3 == 0)
				count++;
			z = z + 1;
		}

		System.out.println(count);
		sc.close();
	}

}
