package practice.p01;

import java.util.Random;

public class P0219N01 {

	void run() {
		Random r = new Random();
		int a[] = new int[3]; // 배열의 크기가 3개
		a[0] = r.nextInt(3); // 0번 배열의 값은 0~3중하나
		a[1] = r.nextInt(3); // 1번 배열의 값은 0~3중하나
		a[2] = r.nextInt(3); // 2번 배열의 값은 0~3중하나
		int b;
		for (b = a[0]; (b == 0); b = a[0]) {// for 처음 초기화는 for 실행될때 딱한번.

			a[0] = r.nextInt(3);

		}
		for (b = a[1]; (b == 0); b = a[1]) {

			a[1] = r.nextInt(3);

		}
		for (b = a[2]; (b == 0); b = a[2]) {

			a[2] = r.nextInt(3);

		}
		System.out.print(a[0]);
		System.out.print(a[1]);
		System.out.println(a[2]);
	}

	public static void main(String[] args) {
		P0219N01 LV1 = new P0219N01();
		LV1.run();
		P0219N01 LV2 = new P0219N01();
		LV2.run();
		P0219N01 LV3 = new P0219N01();
		LV3.run();
		P0219N01 LV4 = new P0219N01();
		LV4.run();
	}
}
