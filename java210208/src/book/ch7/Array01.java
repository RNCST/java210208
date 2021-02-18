package book.ch7;
/*
 * 배열은 한 번 선언하면 원소의 수를 조정 불가하다
 * 끼우넣기가 안된다.
 */
public class Array01 {

	public void printArray(int empnos[]) {
			int cnt = 0;
			for(int i=0;i<empnos.length;i++) { // 배열의주번.length - 원소의 갯수.  "hello".length() - 문자열 길이
			System.out.println(++cnt+"번쨰"+empnos[i]);
		}
	}

	public static void main(String[] args) {
		int empnos[] = new int[111111111];
		//저 14개 방에는 어떤 값이 들어 있을까 --> 0이 14개 들어있음.
		Array01 a1 = new Array01();
		a1.printArray(empnos);
	}

}
