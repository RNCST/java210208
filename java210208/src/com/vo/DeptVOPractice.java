package com.vo;

public class DeptVOPractice {

	private int deptno = 0; 
	private String dname = null; 
	private String loc = null; 

	public int getDeptno() {return deptno;}
	public void setDeptno(int deptno) {this.deptno = deptno;}
	
	
	public String getDname() {return dname;}
	public void setDname(String dname) {this.dname = dname;}
	
	
	public String getLoc() {return loc;}
	public void setLoc(String loc) {this.loc = loc;}
	
	
	void methoA() {}
	DeptVO methodB() {return new DeptVO();}
	DeptVO[] methodC() {return new DeptVO[3];}

	public static void main(String[] args) {
		DeptVOPractice dvo = new DeptVOPractice();
		System.out.println(dvo.getDeptno());
		
		dvo.setDeptno(30); 
		System.out.println(dvo.getDeptno());
		
		dvo.setDeptno(130);
		System.out.println(dvo.getDeptno());

	}

}
