package my.inner;

public class OuterClass {
	class InnerClass{
		private int value;
//		static int x;
		InnerClass(int i){
			value = i;
		}
		void print(){
			System.out.println("value of Inner class = "+value);
		}
	}//end of InnerClass
	public void link(int i)
	{
		InnerClass inObj = new InnerClass(i);
		inObj.print();
	}
}//end of OuterClass