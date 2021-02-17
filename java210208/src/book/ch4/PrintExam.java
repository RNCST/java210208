package book.ch4;

import java.util.Random;
/*
	 * java.util에 있는 패키지들은 제공되는 API를 통해서 뭔가를 만들때 유용한 기능들을 모아둔 패키지임.
	 * java.lang이 아닌 패키지는 모두 import 대상입니다. java.lang의 물리적인 위치는 jdk가 이미 알고있음.
	 * 
	 */
import java.util.Scanner;

public class PrintExam {
	public static void main(String[] args) {
		// ex) new Scanner(); ==> 작동이 안됨.

		// local device-서버가 아니다=동기화불가능하다=예전의데이터를 가지고 있다.= 새로등록된 무언가에대한 정보가 없다.
		// =
		// Scanner sc 선언부 = new Scanner(System.in); 생성자
		// System ==> 현재 쓰고있는 장치 device --> 처리주체
		// 사용자 혹은 업무 담당자가 키보드를 입력한 값을 읽어온다. 입력장치를 나타내는 속성이 필요하다 -attribute ==>in

//		Scanner sc = new Scanner(System.in);
//		// 디폴트 생성자를 제공해주지 않는다.
//		Scanner sc2 = null;
//		sc2 = new Scanner(System.in);
//		System.out.println("Enter age");
//		System.out.println("====================");
//		System.out.println(sc.nextInt());
		
		
		Random r = new Random();// 채번하기, 난수 발생하기,
		// 디폴트 생성자를 제공해 준다
		for(int i=0;i<10;i++) {
			int b = r.nextInt(10);
			System.out.println(i+":"+b);
			
	}

}
}
