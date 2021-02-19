package practice01;

public class P0218N01 {

	public static void main(String[] args) {
		P0218N01 A = new P0218N01();
		int i;
		int sum = 0;
		for (i = 0; i <= 100; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		A.methodA();
		
	}

	public void methodA() {
		int i = 0;
		while (i <= 9) {
			int j = 1;
			while (j <= 9) {
				System.out.print(i + "*" + j + "=" + (i * j) + " ");
				j++;
			}
			System.out.println(" ");
			i++;
		}
	}

}
