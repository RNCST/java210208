package practice.p02;
//Question 39 : static으로 선언된 메소드
//Click the Exhibit button.
//1. public class A {
//2.
//3. private int counter = 0;
//4.
//5. public static int getInstanceCount() {
//6. return counter;
//7. }
//8.
//9. public A() {
//10. counter++;
//11. }
//12.
//13. }
//Given this code from Class B:
//25. A a1 =new A();
//26. A a2 =new A();
//27. A a3 =new A();
//28. System.out.printIn(A.getInstanceCount() );
//What is the result?
//A. Compilation of class A fails.						oo
//B. Line 28 prints the value 3 to System.out.
//C. Line 28 prints the value 1 to System.out.
//D. A runtime error occurs when line 25 executes.
//E. Compilation fails because of an error on line 28.
//
//9번라인에 counter가 static 안에 있는데 이 counter라는 변수는 non-static 이기 때문에 
//static 영역에서 쓸수 없기 떄문에 컴파일 에러가 발생한다.
//
public class Kquiz_39_staticmethod {

	public static void main(String[] args) {

	}

}
