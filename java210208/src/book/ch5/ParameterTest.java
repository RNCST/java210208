package book.ch5;

public class ParameterTest {
	String g_rdname = null;
	
	ParameterTest PT = null;
	EmpList sVO = null;
	
	static int methodA() {
		return 100;
	}
	static int methodA(int p_empno) {
		return p_empno;
	}
	void methodA(int p_empno, String rdname) {
		g_rdname = rdname;
	}
	
	public static void main(String[] args) {
		int x = ParameterTest.methodA();
		int y = ParameterTest.methodA(7566);
		System.out.println(x); //100
		System.out.println(y); //150
		String rdname = "개발2팀";
		ParameterTest pt = new ParameterTest();
		pt.methodA(7566, rdname); //
		System.out.println(new ParameterTest().g_rdname); //null
		System.out.println(pt.g_rdname);//개발2팀   
		System.out.println(pt.PT);
		pt.PT = new ParameterTest();
		pt.PT.sVO = null;
		pt.sVO = null;
		System.out.println(pt.PT.sVO);
	}

}
