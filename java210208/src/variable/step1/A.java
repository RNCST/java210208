package variable.step1;

public class A {
	
	double kor = 0;
	double math = 0;
	public double eng = 0;
	double kor1;  //전역변수의 경우 초기화를 생략할 수 있다.
	double math1; //
	double eng1;  //

	double kor2  = 70;
	double math2 = 80;
	double eng2  = 90;

	void methodA() {
//		double kor =  70;
//		double math = 80;
//		double eng =  90;  -->지역변수
		
		kor = 70;
		math= 80;
		eng = 90;
	}

	

}
