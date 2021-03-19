package com.design.zipcode;

import java.util.ArrayList;

public class A {
	
	/* <>제네릭
	 * 컬렉션 프레임워크에서 제공하는 클래스 중에 하나
	 * 담을 수 있는 것들은 기본적으로 obj 급
	 * 원시형 타입은 담을 수 없다.
	 * 
	 * 배열과 다른점
	 * 
	 * 늘었다가 줄었다가함
	 * 객체타입이라면 무엇이든 담을 수 있다.
	 * 끼워넣기가 가능하다.
	 * 
	 */

	public static void main(String[] args) {
		ArrayList f1 = new ArrayList();
		f1.add("수박");
		f1.add("딸기");
		f1.add("키위");
//		제네릭이 없는 경우이므로 타입을 확인할 수 없다. Obj인것까지만 확인.
//		for(String str:f1) {
//			System.out.println(str);
//		}
//		타입을 정확히 맞추지 않는 것은 요즘 트렌드에 맞지않다.
//		var i = 10 ; var j = "HI";
//		타입스크립트(SSR, CSR-안전한 처리)
		for(Object str:f1) {
			System.out.println(str);
		}
		String my = (String) f1.get(0);
		Object obj = f1.get(2);
		
		System.out.println(my);
		System.out.println(obj);
		
		//<> 내 안에 어떤 타입이 있는지를 명시하는 것
		//
		ArrayList<String> f2 = new ArrayList<String>();
		f2.add("수박");
		f2.add("딸기");
		f2.add("키위");
		f2.add(1, "바나나");  // 끼워넣기.
		for(String str:f2) {
			System.out.println(str);
		}
		String my2  = f2.get(0);
		Object obj2 = f2.get(2);
		
		System.out.println(my2);
		System.out.println(obj2);
		ArrayList<ZipCodeVO> f3 = new ArrayList<>();
		ZipCodeVO zVO = new ZipCodeVO();
		zVO.setZIPCODE(31356);
		zVO.setADDRESS("서울시 마포구 공덕동 246번지");
		f3.add(zVO);
		zVO = new ZipCodeVO();
		zVO.setZIPCODE(21357);
		zVO.setADDRESS("서울시 영등포구 영등포동");
		f3.add(zVO);
		zVO = new ZipCodeVO();
		zVO.setZIPCODE(21358);
		zVO.setADDRESS("서울시 구로구 고척동");
		f3.add(zVO);
		for(ZipCodeVO rzVO:f3) {
			String addr = rzVO.getADDRESS();
		System.out.println(addr);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
