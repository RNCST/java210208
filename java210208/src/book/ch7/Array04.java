package book.ch7;

import java.util.Scanner;

/*
 * 배열과 메소드 오버로딩 확인
 * 메소드 오버로딩 규칙
 * 1.반드시 파라미터의 갯수가 달라야한다.
 * 2. 반드시 파라미터의 타입이 달라야 한다.
 * 
 * 주의사항
 * 1. 리턴타입이 있고 없고는 영향이 없다.
 * 2. 접근제한자가 있고 없고 또는 다른 것은 영향이 없다.
 *  public > 
 *  protected[패키지가 다르더라도 상속관계에 있다면 가능] > 
 *  friendly[같은 패키지안에서만 접근이 가능] > 
 *  private
 */
public class Array04 {
	double ds[], d2;
	double[] d3, d4;
	void methodA() {
		Scanner sc = new Scanner(System.in);
		ds = new double[3];
//		ds = 3.14;3.
		ds[1] = 3.14;
		d2 = 3.14;
		d3 = new double[3];
		d4[1] = 3.14;
//		d4 = 3.14; // d4는 이미 더블배열으로 선언 되었기에 더블형으로 초기화가 불가능하다.
		int a = sc.nextInt();
		d4 = new double[a]; // 배열의 갯수를 정해주는 작업.
		a = d4.length;
		d4[0] = 3.14;
		d4[1] = 4.14;
		d4[2] = 5.14;
		d4[3] = 6.14;
		System.out.println(d4.length); // array.length = > 배열의 갯수 
		sc.close();
	}

	public static void main(String[] args) {
		Array04 a4 = new Array04();
		a4.methodA();
	}

}
