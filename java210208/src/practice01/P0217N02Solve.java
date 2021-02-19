package practice01;

import java.util.Random;
import java.util.Scanner;

public class P0217N02Solve {

	public static void main(String[] args) {
		// 난수 발생지원하는 클래스 추가하기- 인스턴스화 하기
		Random r = new Random();
		int dap = r.nextInt(10);
		Scanner sc = new Scanner(System.in);
		// 그 클래스가 제공하는 메소드를 호출하여 채번하기
		// 정수 정답 = r.메소드이름();
		// 사용자로부터 입력한 값 받아오기

		// 사용자가 입력한 값 담기 - 선언하기 초기화

		// 0부터 9중에서 골라봐
		System.out.println("0~9중 고르기");
		int count = 0;
		String user = null;
		// 기회를 3번까지는 준다. - 1번 , 2번 , 3번 --- 반복문.
		for (; (user = sc.nextLine()) != null;) // 뭐야 이게
		{

			// 실행문 ---> 판별식이 있어야함
			if (count < 3) {
				if (Integer.parseInt(user) == dap) {
					System.out.println("정답");
					break;// for문을 탈출한다.
				} else if (Integer.parseInt(user) > dap) {
					System.out.println("답보다 입력한 값이 큼");
					count++;
				} else if (Integer.parseInt(user) < dap) {
					System.out.println("답보다 입력한 값이 작음");
					count++;
				}

			} else {
				System.out.println("탈락");
				break;
			}

		}

	}

}
