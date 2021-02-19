package practice.p01;

// 배열이 크기가 10인 int 정수속에서 0~r 까지의 랜덤한 정수중 가장 큰 값이 출력되도록.
import java.util.Random;
import java.util.Scanner;

public class P0219N02 {
	Random r = new Random();
	int Array[] = null; // = new int[10]; // 배열의 크기가 10개
	int area;


	void setArray(int inputX) {
		area = inputX;
		Array = new int[area];
		System.out.println("이 배열속 공간갯수는 " + Array.length + "개");
	}
	// int x (inputArea) 값만큼 배열방갯수가 정해짐.
	// x를 입력하면 x개의 방이 생김.

	void outputInt(int inputY) {
//		int inputArea2 = inputArea-1;
		System.out.println("랜덤으로 출력되는 " + 
        "정수의 범위는 0~" + (inputY) + "입니다.");
		for (int x = 0; x < Array.length; x++) {
			Array[x] = r.nextInt(inputY);
		}
		Array[area - 1] = r.nextInt(inputY - 1);
	} // int y (inputArea) 만큼의 정수 범위 인데 0을 포함함

	int pickMaxInt(int inputZ) {
		int i;
		int maxInt = Array[0];
		for (i = 1; i <= Array.length; i++) {
			if (Array[i] > maxInt) { // 에러
				maxInt = Array[i];
			}
		}
		return maxInt;
	}

	void print(int inputMax) {
		P0219N02 A = new P0219N02();
		System.out.println(inputMax);
	}

	public static void main(String[] args) {
		P0219N02 A = new P0219N02();
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		A.setArray(x);
		int y = sc.nextInt();
		A.outputInt(y);
		int max = A.pickMaxInt(0);
		A.print(max);
//		A.print();
	}

}
