package practice.p02;

import java.util.Random;
import java.util.Scanner;

public class P0220N01 {

	
	/*
	 * 	CCC -- 함수 변수 만 있었음
	    -- 변수와 함수를 묶을수있는 개념이 클래스?
	    int a;
	    a도 객체
	    객체 (변수 
	    random r = new random();  
	    new random(); 인스턴스화, 이 행위 인스턴스의 주소를 return;
	    random r = r이라는 값에 return;받은 인스턴스의 주소가 들어감.
	    r = 변수이자 이 변수의 역할은 pointer라고함.
	        하지만 결국에 자바에서는 자바의 법에 따라야한다.
	    
	   
	    
	    
	    random 클래스 r 인스턴스 r이라는게 객체 
	    	r.nextint     메소드
	    	r.nextdouble  메소드
	    	r.next        메소드
	    	r. 
	 */

	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		      int x = sc.nextInt();
		        for (int i = 1 ; i < 10 ; i++) {
		            System.out.println(x+" * "+ i +" "+ "="+" "+(x*i));
		        }
		    }
		}
