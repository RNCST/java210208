package com.design.zipcode;

import java.util.List;
import java.util.Vector;

/**
 * 자료구조의 종류 1) List 계열 ArrayList - 싱글스레드 안전, 동기화 처리 생략, 속도 빠르다. Vector - 멀티스레드
 * 안전, 동기화 처리가 있어야 함, 속도는 느림. : 경합, 다중 접속자 처리, 순서, 동기화처리 
 * 
 * 2) Map계열(해시태그)
 * 
 * 3) Set계열(빈도 낮음)-집합
 *
 */
public class ZipCodeList {

	public static void main(String[] args) {

		// <> 제네릭이라고함. 생성부에는 타입 없디 다이아몬드 연산자만 붙임.
		Vector<ZipCodeVO> v = new Vector<>(); // 다형성을 누릴 수 없다.
		  List<ZipCodeVO> l = new Vector<>(); // 다형성을 누린다.
		String a[] = new String[3];

		ZipCodeVO zcVO    = null;
		ZipCodeVO zcVOs[] = null;
		int i = 0;
		while (i < 3) {
			zcVO = new ZipCodeVO();
			if(i==0) {
				zcVO.setADDRESS("일시");				
			}
			if(i==1) {
				zcVO.setADDRESS("이시");				
			}
			if(i==2) {
				zcVO.setADDRESS("삼시");				
			}
			System.out.println("zcVO주소번지 바뀐다. ===>" + zcVO);
			
			v.add(zcVO);
			System.out.println(v);
			zcVO.setADDRESS("44");
			i++;
		} // v= 제네릭 백터 0 1 2 
		System.out.println();
		for (int x = 0; x < v.size(); x++) {
			ZipCodeVO zVO = v.get(x); // 
			System.out.println(zVO);
		}
		
		System.out.println();
		zcVOs = new ZipCodeVO[v.size()];
		System.out.println("배열의 크기는 " + zcVOs.length);
		
		System.out.println();
		v.copyInto(zcVOs); // 벡터에 담긴 것을 배열에 담아준다.
		for (int y = 0; y < zcVOs.length; y++) {
			System.out.println(zcVOs[y]);
			System.out.println(zcVOs[y].getADDRESS());
		}
	}
	//25번에 VO안에 전역변수인 address에 서울시 금천구 가산동을 초기화 하였다.
	//40번 출력이 null일 것이다 
	//
}









