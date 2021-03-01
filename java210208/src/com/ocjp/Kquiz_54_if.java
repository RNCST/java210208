package com.ocjp;

public class Kquiz_54_if {

	public void testIFa() {
		if (testIfB("True")) {
			System.out.println("True"); //12
		} else {
			System.out.println("Not true");
		}
	}

	public Boolean testIfB(String str) {
		return Boolean.valueOf(str);  //19
	}

}

//Question 54 : if문
//Given:
//11. public void testIfA() {
//12. if(testIfB(”True”)) {
//13. System.out.println(”True”);
//14. } else {
//15. System.out.println(”Not true”);
//16. }
//17. }
//18. public Boolean testIfB(String str) {
//19. return Boolean.valueOf(str);
//20. }
//What is the result when method testIfA is invoked?  //메서드 testIfA가 호출될 때 결과는 무엇인가?
//A. True
//B. Not true
//C. An exception is thrown at runtime.
//D. Compilation fails because of an error at line 12.
//E. Compilation fails because of an error at line 19.
