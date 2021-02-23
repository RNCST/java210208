
package com.vo;


public class EmpVO {  //crtl shift y 일괄 소문자
	
	public DeptVO getDVO() {
		return dVO;
	}
	public void setDVO(DeptVO dVO) {
		this.dVO = dVO;
	}
	private DeptVO  dVO      =null;
	
	
	private int     empno    =0   ;   //사원코드
	private String  ename    =""  ;  //사원이름
	private String  job      =""  ;  //
	private int     mgr      =0;     //그룹코드
	private String  hiredate =""  ;  //입사일자
	private double  sal      =0.00;//급여
	private double  comm     =0.00;//인센티브
	private int     deptno   =0   ;    //부서번호(FK)-외래키,조인시에 사용되는 커럼=릴레이션이다.
									 //릴레이션은 부모로부터 내려받은 속성이다.
	public EmpVO() {}
	//생성자의 경우 생략할수 있고 생략되엇을때 JVM이 대신 제공해줌
	//그러나 한개라도 생성자 정의되어 있다면 제공안됨.(디폴트 생성자 포함= 파라미터를 가지지 않는 생성자)
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	public String getHiredate() {
		return hiredate;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public double getComm() {
		return comm;
	}
	public void setComm(double comm) {
		this.comm = comm;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
				   
}
