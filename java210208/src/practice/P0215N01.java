package practice;

import java.util.Scanner;

public class P0215N01 {
	int input;
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		P0215N01 P = new P0215N01();
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		System.out.println(input*0.17);
		
		P.weight1();
		int input2 = s.nextInt(); 
		P.weight2(input2);
		P.sc.close();
	}
	
	void weight1() {
		int input = sc.nextInt();
		System.out.println(input*0.17);
	}
	void weight2(int weight) {
		System.out.println(weight*0.17);
		
	}
}
