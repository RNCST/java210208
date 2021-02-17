package practice;

import java.util.Scanner;

public class Push {
	int OutButton;
	int InButton;
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Push A = new Push();
		Elivator B = new Elivator();
		A.getInput();
		B.Elivator = A.move1();
		System.out.println("현재 엘레베이터의 위치는 " + B.Elivator + "층입니다.");
		A.getInput2();
		B.Elivator = A.move2();
		System.out.println("현재 엘레베이터의 위치는 " + B.Elivator + "층입니다.");
		A.sc.close();
	}

	public void getInput() {

		int FloorButton = sc.nextInt();

		OutButton = FloorButton;

	}

	public void getInput2() {

		int ElivatorButton = sc.nextInt();

		InButton = ElivatorButton;

	}

	public int move1() {
		Elivator B = new Elivator();

		if (OutButton > B.Elivator) {
			System.out.println("엘리베이터가 올라옵니다.");
			System.out.println("문이 열립니다.");
			B.elivatordown();
			B.Elivator = OutButton;
		} else if (OutButton == B.Elivator) {
			System.out.println("문이 열립니다.");
			B.Elivator = OutButton;
		} else {
			System.out.println("엘리베이터가 내려갑니다.");
			System.out.println("문이 열립니다.");
			B.elivatorup();
			B.Elivator = OutButton;
		}
		return B.Elivator;
	}

	public int move2() {
		Elivator B = new Elivator();

		if (InButton > B.Elivator) {
			System.out.println("엘리베이터가 올라갑니다.");
			System.out.println("문이 열립니다.");
			B.elivatordown();
			B.Elivator = InButton;
		} else if (InButton == B.Elivator) {
			System.out.println("문이 열립니다.");
			B.Elivator = InButton;
		} else {
			System.out.println("엘리베이터가 내려갑니다.");
			System.out.println("문이 열립니다.");
			B.elivatorup();
			B.Elivator = InButton;
		}
		return B.Elivator;
	}

}
