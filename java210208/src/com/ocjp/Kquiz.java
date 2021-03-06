package com.ocjp;

public class Kquiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

///*
//Question 36 : static메서드와 메서드의 차이점
//Given:
//10. class Foo {
//11. static void alpha() { /* more code here */ }
//12. void beta() { /* more code here */ }
//13. }
//Which two are true? (Choose two.)
//A. Foo.beta() is a valid invocation of beta().      oo
//B. Foo.alpha() is a valid invocation of alpha().    
//C. Method beta() can directly call method alpha().  
//D. Method alpha() can directly call method beta().  oo
//
//
//
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
//A. Compilation of class A fails.
//B. Line 28 prints the value 3 to System.out.
//C. Line 28 prints the value 1 to System.out.
//D. A runtime error occurs when line 25 executes.
//E. Compilation fails because of an error on line 28.
//
//
//
//Question 40 : private 멤버필드 접근방법(set,get의 형식)
//A JavaBeans component has the following field:
//11. private boolean enabled;  //boolean형 멤버필드
//Which two pairs of method declarations follow the JavaBeans standard for accessing this field? (Choose two.) 
//
//A. public void setEnabled( boolean enabled)
//public boolean getEnabled()
//B. public void setEnabled( boolean enabled)
//public void isEnabled()
//C. public void setEnabled( boolean enabled)
//public boolean isEnabled()
//D. public boolean setEnabled( boolean enabled)
//public boolean getEnabled()
//
//
//
//Question 44 : 오버로딩
//Click the Exhibit button.
//1. public class A {
//2. public String doit(int x, int y) {
//3. return “a”;
//4. }
//5.
//6. public String doit(int... vals) {  //비정형인자
//7. return “b”;
//8. }
//9. }
//Given:
//25. A a=new A();
//26. System.out.println(a.doit(4, 5));
//What is the result?
//A. Line 26 prints “a” to System.out.
//B. Line 26 prints ‘b” to System.out.
//C. An exception is thrown at line 26 at runtime.
//D. Compilation of class A will fail due to an error in line 6.
//
//Question 45 : 오버로딩
//Given:
//1. public class A {
//2. public void doit() {
//3. }
//4. public String doit() {  
//5. return “a”;
//6. }
//7. public double doit(int x) {
//8. return 1.0;
//9. }
//10.}
//What is the result?
//A. An exception is thrown at runtime.
//B. Compilation fails because of an error in line 7.
//C. Compilation fails because of an error in line 4.
//D. Compilation succeeds and no runtime errors with class A occur.
//
//
//Question 52 : switch문
//Given:
//11. public class Test {
//12. public enum Dogs {collie, harrier, shepherd};
//13. public static void main(String [] args) {
//14. Dogs myDog = Dogs.shepherd;
//15. switch (myDog) {
//16. case collie:
//17. System.out.print(”collie “);
//18. case default:  
//19. System.out.print(”retriever “);
//20. case harrier:
//21. System.out.print(”harrier “);
//22. }
//23. }
//24. }
//‘What is the result?
//A. harrier
//B. shepherd
//C. retriever
//D. Compilation fails.
//E. retriever harrier
//F. An exception is thrown at runtime.
//
//
//Question 53 : switch문
//Given:
//12. public class Test {
//13. public enum Dogs {collie, harrier};
//14. public static void main(String [] args) {
//15. Dogs myDog = Dogs.collie;
//16. switch (myDog) {
//17. case collie:
//18. System.out.print(”collie “);
//19. case harrier:
//20. System.out.print(”harrier “);
//21. }
//22. }
//23. }
//What is the result?
//A. collie  
//B. harrier
//C. Compilation fails.
//D. collie harrier  
//E. An exception is thrown at runtime.
//
//
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
//Answer: A
//
//Question 55 : 오토박싱과 switch문
//Given:
//11. public static void main(String[] args) {
//12. Integer i = new Integer(1) + new Integer(2);
//13. switch(i) {
//14. case 3: System.out.println(”three”); break;
//15. default: System.out.println(”other”); break;
//16. }
//17. }
//‘What is the result?
//A. three
//B. other
//C. An exception is thrown at runtime.
//D. Compilation fails because of an error on line 12.
//E. Compilation fails because of an error on line 13.
//F. Compilation fails because of an error on line 15.
//
//
//Question 56 : if문과 else if문
//Given:
//11. public static void main(String[] args) {
//12. String str = “null”;
//13. if (str == null) {
//14. System.out.println(”null”);
//15. } else (str.length() == 0) {  //else if
//16. System.out.println(”zero”);
//17. } else {
//18. System.out.println(”some”);
//19. }
//20. }
//‘What is the result?
//A. null
//B. zero
//C. some
//D. Compilation fails.
//E. An exception is thrown at runtime.
//
//
//Question 57 : if문
//Given:
//11. Float pi = new Float(3.14f);
//12. if(pi>3) {
//13. System.out.print(”pi is bigger than 3. “);
//14. }
//15. else {
//16. System.out.print(”pi is not bigger than 3. “);
//17. }
//18. finally {
//19. System.out.println(”Have a nice day.”);
//20. }
//‘What is the result?
//A. Compilation fails.
//B. pi is bigger than 3.
//C. An exception occurs at runtime.
//D. pi is bigger than 3. Have a nice day.
//E. pi is not bigger than 3. Have a nice day.
//
//
//Question 58 : do while문
//Given:
//10. int x=0;
//11. int y 10;
//12. do {
//13. y--;
//14. ++x;
//15. } while (x < 5);
//16. System.out.print(x + “,“ + y);
//What is the result?
//A. 5,6
//B. 5,5
//C. 6,5
//D. 6,6
//
//
//Question 59 : while문
//Given:
//25. int x=12;
//26. while (x < 10) {
//27. x--;
//28. }
//29. System.out.print(x);
//What is the result?
//A. 0
//B. 10
//C. 12
//D. Line 29 will never be reached.
//
//
//Question 60 : do while문
//Given:
//35. int x= 10;
//36. do {
//37. x--;
//38. } while(x< 10);
//How many times will line 37 be executed?  
//A. ten times
//B. zero times
//C. one to me times  //1번
//D. more than ten times  //10번이상(무한적)
//
//
//
//Question 63 : for문
//Given:
//11. public static void main(String[] args) {
//12. for (int i=0;i<= 10;i++){
//13. if( i>6) break;
//14. }
//15. System.out.println(i);  //오류
//16. }
//What is the result?
//A. 6
//B. 7
//C. 10
//D. 11
//E. Compilation fails.
//F. An exception is thrown at runtime.
///
	}

}
