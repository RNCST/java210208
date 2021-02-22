package practice.i;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[9];
		int i = 0;
		while (i < array.length) {
			int n = sc.nextInt();
			array[i] = n;
			i++;
		}
		i = 0;
		int maxi = 0;
		int max = array[0];
		while (i < array.length) {
			if (max < array[i]) {
				max = array[i];
				maxi = i;
			}
			i++;
		}
		System.out.println(max);
		System.out.println(maxi+1);

	}

}

//		Scanner sc = new Scanner(System.in);
//		Random r = new Random();
//		int length = sc.nextInt();
//		int array[] = new int[length];
//		int max;
//		int min;
//		
//		for (int i=1 ;i<array.length;i++) {
//			array[i] = r.nextInt(30);
//		}
//		max = array[0]; 
//		for (int i=1 ;i<array.length;i++) {
//			if(max<array[i]) {
//				max=array[i]; 
//			}
//		}
//		min = array[0];
//		for (int i=1 ;i<array.length;i++) {
//			if(min>array[i]) {
//				min=array[i];
//			}
//		}
//		System.out.println(min+" "+max+" ");
//		sc.close();
//	} 
//}