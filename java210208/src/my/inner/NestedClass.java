package my.inner;

public class NestedClass {

	public static void main(String[] args) {
		OuterClass outObj = new OuterClass();
		outObj.link(1);
		OuterClass.InnerClass inObj = outObj.new InnerClass(2);
		inObj.print();
	}

}