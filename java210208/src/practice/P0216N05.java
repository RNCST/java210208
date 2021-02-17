package practice;

import java.util.Scanner;

public class P0216N05 {
//등비수열은 각 항의 앞에 일정한 수를 곱해서 이루어지는 수열을 말합니다.
//첫번째 부터 7번째 까지의 수열을 출력하시오.
//등비수열 n=1 // ar  // ar r // ar r r // ar r r r//
// proof, ratio, common ratio
	public static void main(String[] args) {
		int i = 0;
		double r;
		double p;
		double cr;
		Scanner sc = new Scanner(System.in);
			p = sc.nextDouble();
			cr = sc.nextDouble();
			r= cr;
			for(i = 1; i<=7  ;i++ ) {
				System.out.println(p*r);
				r = r*cr;
			}
	}
}
