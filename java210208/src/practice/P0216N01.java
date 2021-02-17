package practice;

public class P0216N01 {

	public static class Test {

		public static void main(String[] args) {
			int x = 5;
			boolean b1 = true;
			boolean b2 = false;
			if ((x == 4) && (b2=!b2)) // false and true
				
			System.out.print("1 ");
			
			System.out.print("2 ");// if문에 종속되지않고 그냥 실행됨.
			
			System.out.println(b1+""+b2);
			if ((b2 = true) && b1) // true and true
								   // b2 == true 와 b2 = true의 차이
				
			System.out.print("3 ");
			System.out.println(b1+""+b2);
			if (1!=7) { //EX) 1! == 1이 아닌모든 경우 1외에 모두
				System.out.println("Y");
			}else {
				System.out.println("N");
				
			}
		}
	}
//		What is the result?  
//		A. 2
//		B. 3
//		C. 1 2
//		D. 2 3
//		E. 1 2 3
//		F. Compilation fails.
//		G. Au exceptional is thrown at runtime.

}
