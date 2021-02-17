package com.vo;

import java.util.Scanner;

public class DeptVOSmulation {

	void methoA() {
		// 반환값이 전혀 역할을 못함.
	}

//==================================================================================================
	DeptVO methodB() {
		// 반환값이 3가지가 가능함.
		return new DeptVO();
	}

//==================================================================================================
	DeptVO[] methodC() {
		// 반환값이 3가지 종류에 대해서 n개 로우까지도 가능함.
		return new DeptVO[3];
	}
//==================================================================================================

	public static void main(String[] args) {
		DeptVO dvo = new DeptVO(30, "생성자", "연습");
		System.out.println(dvo.getDeptno());
		System.out.println(dvo.getDname());
		System.out.println(dvo.getLoc());
//		System.out.println(dvo.getDeptno());
//		dvo.setDeptno(40); // 생성자로 처리해 보시오. 1-2 API 활용 능력.
//		System.out.println(dvo.getDeptno());
//		dvo.setDeptno(130);
//		System.out.println(dvo.getDeptno());

	}

}
