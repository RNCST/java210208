package book.ch4;

// 1부터 100까지 세면서 5의 배수이면 fizz를 출력하고 7의 배수이면 buzz를 출력하고
//5와 7의 공배수이면 fizzbuzz를 출력하고 나머지는 숫자를 출력하는 프로그램을 작성하시오.
public class switchFor3x5x35x {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			int num = i;
			int num35 = num % 35;
			int num5 = num % 5;
			int num7 = num % 7;
			switch (num % 35) {
			case 0:
				System.out.println("FizzBuzz");
				break;
			default:
				switch (num % 5) {
				case 0:
					System.out.println(("Fizz"));
					break;
				default:
					switch (num % 7) {
					case 0:
						System.out.println("Buzz");
						break;
						default:
						System.out.println(num);
					}
				}
			}

		}
		System.out.println("switch end");
	}
}
