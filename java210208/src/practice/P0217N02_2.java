package practice;

import java.util.Random;
import java.util.Scanner;

class method {

	int maxChance() {// 기회정하기
		System.out.println("몇번 안에 맞추겠습니까?");
		Scanner sc = new Scanner(System.in);
		int maxChance = sc.nextInt();
		System.out.println("최대" + maxChance + "회의 기회가 있습니다.");
		return maxChance;
	}

	int fixTopInt() {// n번까지의 정수 정해주기
		System.out.println("범위의 최대정수의 값을 입력?");
		Scanner sc = new Scanner(System.in);
		int topInt = sc.nextInt();
		System.out.println("0부터 " + topInt + "까지의 정수중 랜덤으로 정해집니다.");
		return topInt;

	}

	int randomInt() { // 랜덤값 출력
		method random = new method();
		Random r = new Random();
		int max = random.fixTopInt();
		int i1 = r.nextInt(max);
		return i1;
	}

	void run() {
		method P = new method();
		Scanner sc = new Scanner(System.in);
		int maxChance = P.maxChance();
//		int topInt = P.fixTopInt();
		int count;
		int randomInt = P.randomInt();
		for (count = 0; count <= maxChance; count = count + 1) {
			System.out.println("맞출수 있는 기회가" + (maxChance - count) + "회 남았습니다");
			if (count < maxChance) {
				System.out.println("값을 입력하세요");
				int input = sc.nextInt();

				if (input == randomInt) {
					System.out.println("정답입니다.");
					return;
				} else if (input > randomInt) {
					System.out.println("입력값이 더 큽니다.");
				} else {
					System.out.println("입력값이 더 작습니다.");
				}

			} else {
				System.out.println("횟수초과로 실패했습니다");

			}
		}
	}

}

public class P0217N02_2 {
	public static void main(String[] args) {
		method P = new method();
		P.run();
	}

}