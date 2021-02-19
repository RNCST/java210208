package practice.p01;

// 배열이 크기가 10인 int 정수속에서 0~r 까지의 랜덤한 정수중 가장 큰 값이 출력되도록.
import java.util.Random;
import java.util.Scanner;

public class P0219N02_rev01 {
	Random r = new Random();
	int Array[] = null; // = new int[10]; // 배열의 크기가 10개
	int area;

	int outputInt;
	int maxInt;

	void setArray(int inputArea) {
		Array = new int[inputArea];
		System.out.println("이 배열속 공간갯수는 " + Array.length + "개");
		for (int x = 0; x <Array.length; x++) {
			Array[x] = r.nextInt(50);
		}
	}

//	void outputInt(int inputIntArea) {
//		System.out.println("정수의 범위는 0~"+inputIntArea+"입니다.");
//		Array[area]=r.nextInt(inputIntArea);
//		System.out.println(Array[area]);
//	}

	int pickMaxInt(int inputArea) {
		int i;
		int maxInt = Array[0];
		for (i = 0; i <=Array.length-1; i++) {
			if (Array[i] > maxInt) {
				maxInt = Array[i];
			}
		}return maxInt;
	}

	void print(int inputArea) {
		System.out.println("배열 : ");
		if(Array!=null) {
			for(int x=0;x<Array.length;x++) {
				System.out.printf("%3d", Array[x]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		P0219N02_rev01 A = new P0219N02_rev01();
		Scanner sc = new Scanner(System.in);
		for(int a=0;a<5;a++) {
			int x = sc.nextInt();
			A.setArray(x);
			A.print(0);
			int max = A.pickMaxInt(0);
			System.out.println("최대값은"+max);
			
		}
//		int y = sc.nextInt();
//		A.outputInt(y);
	}

}
