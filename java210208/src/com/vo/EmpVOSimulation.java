package com.vo;

public class EmpVOSimulation {

	public static void main(String[] args) {
		int a = 1;
		DeptVO dVO = new DeptVO();
		dVO.setDeptno(30);
		dVO.setDname("리서치");
		dVO.setLoc("부산");
		
		EmpVO eVO = new EmpVO(7566,"이순신","세일즈"
				             ,7800,"2000-10-26",1000
				             ,200,30,dVO);
		
//		eVO.setDVO(null);
				
		System.out.println(eVO+"||first evo");
		System.out.println(dVO+"||first dvo");
		System.out.println(eVO.getDVO().getDname());
		System.out.println(eVO.getDVO()); //==
		System.out.println(dVO.getDname());
		
		dVO = new DeptVO();     // second dvo
		dVO.setDeptno(40);
		dVO.setDname("개발부");
		dVO.setLoc("제주");
		
		System.out.println(eVO+"||second evo");
		System.out.println(dVO+"||second dvo");
		System.out.println(eVO.getDVO().getDname());
		System.out.println(eVO.getDVO()); //==
		System.out.println(dVO.getDname());
		
		
		
		
		
		
		
		
	}

}
