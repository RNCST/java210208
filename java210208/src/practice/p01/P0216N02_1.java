package practice.p01;

public class P0216N02_1 {// Param Test.java

	int effectParam(int p) /* hot spot */ {
		P0216N02_1_1 OtherClass = new P0216N02_1_1();
		OtherClass.ival = 500;
		System.out.println(OtherClass.ival);
		return OtherClass.ival;
	}

	public static void main(String[] args) {
		P0216N02_1 MainClass = new P0216N02_1();
		P0216N02_1_1 OtherClass = new P0216N02_1_1();
		System.out.println(OtherClass.ival);
		OtherClass.ival = 100;
		System.out.println(OtherClass.ival);
		MainClass.effectParam(OtherClass.ival);
		System.out.println(OtherClass.ival);
		OtherClass.ival = MainClass.effectParam(OtherClass.ival); 
		System.out.println(OtherClass.ival);
	}

}