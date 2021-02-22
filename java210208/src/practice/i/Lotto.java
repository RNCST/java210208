package practice.i;

import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		Random r = new Random();
		int lottoNum[] = new int[6];

		for (int i = 0; i < lottoNum.length; i++) {
			lottoNum[i] = (r.nextInt(45) + 1);
		}
		for (int i = 0; i < lottoNum.length; i++) {
			for (int y = 0; y < i; y++) {
				if (lottoNum[i] == lottoNum[y]) {
					lottoNum[y] = (r.nextInt(45) + 1);
					i--;
				}
			}
		}
		for (int i = 0; i < lottoNum.length; i++) {
			System.out.println(lottoNum[i] + " ");
		}

		/*
		 * 배열 6개 랜덤숫자는 0~45 0인거 걸러내기 중복 걸러내기 printout
		 */
	}
}
