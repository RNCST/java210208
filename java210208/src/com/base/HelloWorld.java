package com.base;

public class HelloWorld {
	int age = 20;//전역변수
	public static void main(String[] args) {
		HelloWorld hw = new HelloWorld();
		hw.age = 29;
		System.out.println("당신의 나이는 "+hw.age+"입니다.");
		System.out.println("2차 수정한 부분입니다.");

	}

}
