package practice01;
/*
 * 1부터 input까지 의 정수의 총합 SUM을 구하시오
 * -- 크게 input이란변수와 SUM이란 변수 2개가 '일단' 필요함.
 */
import java.util.Scanner;

public class P0215N02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y = 0;
		int i;
		int input = sc.nextInt();
		if (input < 0) {
			System.out.println("0과 100사이의 값을 입력해주세요");
			return;
		}
		if (input > 100) {
			System.out.println("0과 100사이의 값을 입력해주세요");
			return;
		}
		for (i = 1; i <= input; i = i + 1) {
		//  (start = 1;start<=end;start++)
		//  
			y = y + i;
		}
		System.out.println(y);

		sc.close();
	}

}