package practice.i;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		String ar[] = new String[count];

		for (int i = 0; i < count; i++) {
			ar[i] = sc.next();
		}

		for (int i = 0; i < count; i++) {

		}
		int score = 0;
		int ps    = 1;
		for (int i = 0; i < ar.length; i++) {
			char arc[] = ar[i].toCharArray();
			for (int y = 0; y < arc.length; y++) {
				if (arc[y] == 'O') {
					score = score + ps++;
				}if (arc[y] == 'X') {
					ps = 1;
				}
			}
			System.out.println(score);
			
			score = 0;
			ps = 1;
		}
	}

}

/*
 * 5 OOXXOXXOOO 10 OOXXOOXXOO 9 OXOXOXOXOXOXOX 7 OOOOOOOOOO 55 OOOOXOOOOXOOOOX
 * 30
 *
 *
 */