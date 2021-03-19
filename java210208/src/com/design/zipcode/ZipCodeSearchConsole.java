package com.design.zipcode;
import java.util.ArrayList;
import java.util.Scanner;

public class ZipCodeSearchConsole {
	//선언부
	String zdo = null;

	//생성자
	public ZipCodeSearchConsole() {
		
		
	}
	public void printZipCode(ArrayList<ZipCodeVO> zipCode) {
		for(ZipCodeVO zcVO:zipCode) {
			System.out.println(zcVO.getADDRESS()+", "+zcVO.getZIPCODE());
		}
		
		
	}
	public String userInput() {
		Scanner sc = new Scanner(System.in);
		String userDong = sc.nextLine();
		System.out.println(userDong);
		return userDong;
	}
	//메인메소드
	public static void main(String[] args) {
		ZipCodeSearchConsole zcs = new ZipCodeSearchConsole();
		String userDong = null;
		userDong = zcs.userInput();
		ZipCodeDao zcDao = new ZipCodeDao();
		ArrayList<ZipCodeVO> al = zcDao.getZipCodeList(userDong);
		zcs.printZipCode(al);
	}

	
	public void refreshData(String zdo, String dong) {
		System.out.println("zdo:"+zdo+", dong:"+dong);
		try {	
			
			
		} catch (Exception e) {
			System.out.println(e.toString());			
		}
		
	}


}