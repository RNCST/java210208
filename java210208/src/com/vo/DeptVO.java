package com.vo;

// 오라클과 자바의 만남
// 이어야 됨.
// VO패턴 (ValueOut) = 데이터의 연속성을 유지해주는 오라클 서버 제품과 연결하기.
// Data관리 목적으로 만든 클래스 - 모든 집합의 이름 뒤에 접미어로 VO를 붙임.
// 메인메소드는 필요가 없다. 단독으로 실행하지 않는다.
/*
 *  Toad 내에서 Number(2byte) - 정수형, 담을 수 있는 최대 크기는 99까지 임계값  
 *  JAVA 내에서 int(4byte), long(8byte)
 *  
 *  vardchar2(4000byte) - String
 *  VO패턴을 사용하면 한꺼번에 3가지 종류의 값을 관리가 가능함.			
 *  				->>3가지 종류 ex) (부서번호, 부서명, 지역)
 *  여러가지의 종류의 값을 관리가 가능하다 (= 여러개의 변수 관리가 가능하다)
 *  로우는 한개의 로우밖에 관리 하지 못한다.
 *  
 *  서버자체는 항상 동시에 여러사람이 접속할 수 있다.
 *  이 여러사람을 따로 관리할 수 있어야 한다. - Thread공부 - 
 *  직접 서버를 운영할 수 있는 코딩을 보여줌.
 *  인스턴스화 하는 이유
 *  DeptVO dvo = new DeptVo();
 *  dvo = DeptVO();
 *  dvo = DeptVO();
 *  
 */
public class DeptVO {
//변수의 접근제한자는 왜 private인가??? (private은 class 안에서밖에 접근할수없다.) ---> 
//          타입          이름         = 초기화;
	private int    deptno = 0;    // 원시형 타입 부르면 값이 나온다, 4byte이니까 (ex 100000 100004 100008 ...)
	private String dname  = null; // 레퍼런스 타입 클래스 급, 부르면 값이 아닌 주소번지가 나온다. 
	private String loc    = null; //  --> 캡슐레이션 --> 외부에서 바꾸지 -
	//getter메소드 - Read
	//setter메소드 = Write , Save 느낌으로 접근해보기.
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
		//deptno = 30;// --> 상수, 재사용성이 떨어짐 
		//this는 나 자신을 가리키는 수정자이다.
		//지변과의 식별을 위해 사용하였다. 생략할 수 있다. 
	}
//==================================================================================================
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
//==================================================================================================
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
//==================================================================================================
	public DeptVO(int deptno, String dname, String loc) {
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}


}
