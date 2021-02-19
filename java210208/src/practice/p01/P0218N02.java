package practice.p01;

import java.util.Random;
import java.util.Scanner;

public class P0218N02 {
	int com[] = new int[3]; // com이라는 정수만 담을수 있고 컬럼값이 총 3개인 배열을 생성.

	void baseballgamewhile() {
		Random r = new Random();
		com[0] = r.nextInt(10);
		do { // do 는 실행문이 조건문 앞에 두기 위해 필요한것.
			com[1] = r.nextInt(10);
		} while (com[0] == com[1]);
		do {
			com[2] = r.nextInt(10);
		} while (com[2] == com[0] || com[2] == com[1]);
	}

	void baseballgamefor() {
		Random r = new Random();
		int count;
		for (count = 1; count < 11; count++) {
			com[0] = r.nextInt(10);
			if(com[0]==0) {
				com[0] = r.nextInt(10);
			}
			com[1] = r.nextInt(10);
			if (com[1] == com[0]) {
				com[1] = r.nextInt(10);
			}
			com[2] = r.nextInt(10);
			if (com[2] == com[0] || com[2] == com[1]) {
				com[2] = r.nextInt(10);
			}
//			int b0 = com[0];
//			int b1 = com[1];
//			int b2 = com[2];
//			System.out.println(b0 + "" + b1 + "" + b2);
			System.out.print(count+"회차 :"+com[0] + "" + com[1] + "" + com[2]+" || ");
		}

	}

	public static void main(String[] args) {
		P0218N02 cb = new P0218N02();
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		if (input.contentEquals("for")) {
			System.out.println("for반복 실행");
			cb.baseballgamefor();
		} else if (input.contentEquals("while")) {
			System.out.println("while반복 실행");
			int count = 0;
			for (int i = 0; i < 10; i++) {
				cb.baseballgamewhile();
				System.out.print(++count + "회차 : " + cb.com[0] + "" + cb.com[1] + "" + cb.com[2] +" || ");
			}
		} else {
			System.out.println("for 또는 while 만 입력하세요.");
			return;
		}
	}

}
