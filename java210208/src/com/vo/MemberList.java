package com.vo;
import com.google.gson.Gson;
public class MemberList {

	public static void main(String[] args) {
		Member89VO mvo = new Member89VO();
		mvo.setMem_id("apple");
		mvo.setMem_pw("123");
		mvo.setGender(true);
		
		Gson gson = new Gson();
		String imsi = gson.toJson(mvo); // son.toJson(~~)타입에 상관없이 콘솔창 그대로 출력이됨.
		System.out.println(imsi);
		
		mvo = new Member89VO("tomato","123",true); // 생성자를 이용한 전역변수의 초기화.
		
		
		
		String imsi2 = gson.toJson(mvo);
		System.out.println(imsi2);
	}

}
