package practice;
class Param {
	int ival;
}
public class P0216N02_1_2 {// Param.java
	void effectPram(Param p) {
		p = new Param();
		p.ival = 500;
		System.out.println("sub ival=" + p.ival);
	}

	public static void main(String[] args) {
		P0216N02_1_2 tp = new P0216N02_1_2();
		Param p = new Param();
		System.out.println(p.ival);
		p.ival = 100;
		tp.effectPram(p);
//		Param p2 = new Param();
//		p2.ival = 500;
//		System.out.println("sub ival=" + p2.ival);
		System.out.println("main ival=" + p.ival);
	}
}
