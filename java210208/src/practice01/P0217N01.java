package practice01;

import java.util.Random;

public class P0217N01 {
	public static void main(String[] args) {
		int a = 10;
		Random r = new Random();
		for (int i = 1; i < 11; i++) {
			int b = r.nextInt(a);
			if (i % 3 == 0) {
				System.out.println(i + "번째" + ":" + b);
			}

		}
		int count = 1;
		int count2 = 0;
		for (int i = 1; i < 11; i=i+3) {
			int b = r.nextInt(a);
				System.out.println(count++ + "번째" + ":" + b);
				System.out.println(++count2 + "번째" + ":" + b);
			
		}
	}
}
