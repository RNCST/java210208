package com.vo;

public class Member89VO {
	
	
	private String mem_id = null; // 아이디 담기
	private String mem_pw = null; // 비번 담기
	private boolean gender = false; // 성별 담기
	 // private class 안에서밖에 접근할 수 없다.

	public String getMem_id() {
		return mem_id;
	}

	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}

	public String getMem_pw() {
		return mem_pw;
	}

	public void setMem_pw(String mem_pw) {
		this.mem_pw = mem_pw;
	}

	public boolean isGender() { // booleabn은 get이 아닌 is가 기본인데 get써도됨
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

}
