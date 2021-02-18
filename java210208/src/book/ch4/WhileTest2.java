package book.ch4;

public class WhileTest2 {

	public static void main(String[] args) {
		int i=2;
		while (i<=9) 
		{ int j=1;
			while (j<=9) {
				System.out.print(i+"*"+j+"="+(i*j)+" ");
				j++;	
			}	
			System.out.println(" ");
			i++;
			}
	} // end of main  Method

} // end of WhileTest class
