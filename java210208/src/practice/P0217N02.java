package practice;

import java.util.Random;
import java.util.Scanner;

public class P0217N02 {
	// 0~9사이 임의의 수를 채번해서 스캐너로 입력받은 값과 UP DOWN 비교를 해서 X번까지
	public static void main(String[] args) {
		P0217N02 P = new P0217N02(); 
		Scanner sc = new Scanner(System.in); 
		int maxChance = P.maxChance(); 
//		int topInt = P.fixTopInt();
		int count;
		int randomInt = P.randomInt(); 
		//randomInt 메소드안에서 fixTopInt 메소드의 리턴값을 이용하는데 이때 randomInt메소드를 실행시
		//fixTopInt 메소드도 같이 실행이 됨.
		for (count = 0; count <= maxChance;count = count+1 ) {
			int remainChance = maxChance-count;
			System.out.println("맞출수 있는 기회가"+remainChance+"회 남았습니다");
			// 굳이 remainChance 라는 변수가 필요한지? String+int+int+String시 오류
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
				return;
			}
		}
	}

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
		P0217N02 random = new P0217N02();
		Random r = new Random();
		int max = random.fixTopInt();
		int i1 = r.nextInt(max);
		return i1;
	}
}