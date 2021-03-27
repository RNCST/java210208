package com.design.zipcode;

public class ZipCodeVO {
	
private	int     uID_NO   = 0;   // 유니크한 순번           
private	int     ZIPCODE  = 0;   // 우편번호
private	String  ZDO      = null;// 시도
private	String  BUNGI    = null;// 번지
private	String  SIGU     = null;// 시구
private	String  DONG     = null;// 동    - LIKE패턴으로 구간검색시 사용할 컬럼명임.
private	String  RI       = null;// 리
private	String  APTNAME  = null;// 아파트이름
private	String  UPD_DATE = null;// 수정날짜
private	String  ADDRESS  = null;// 주소


	public ZipCodeVO() {}
	
	ZipCodeVO(int uid_no, int zipcode, String zdo, String bungi, String sigu 
			 ,String dong, String ri, String aptname, String upd_date ,String address){
		
	}
public int getUID_NO() {
		
	return uID_NO;
}
public void setUID_NO(int uID_NO) {
	uID_NO = uID_NO;
}
public int getZIPCODE() {
	return ZIPCODE;
}
public void setZIPCODE(int zIPCODE) {
	ZIPCODE = zIPCODE;
}
public String getZDO() {
	return ZDO;
}
public void setZDO(String zDO) {
	ZDO = zDO;
}
public String getBUNGI() {
	return BUNGI;
}
public void setBUNGI(String bUNGI) {
	BUNGI = bUNGI;
}
public String getSIGU() {
	return SIGU;
}
public void setSIGU(String sIGU) {
	SIGU = sIGU;
}
public String getDONG() {
	return DONG;
}
public void setDONG(String dONG) {
	DONG = dONG;
}
public String getRI() {
	return RI;
}
public void setRI(String rI) {
	RI = rI;
}
public String getAPTNAME() {
	return APTNAME;
}
public void setAPTNAME(String aPTNAME) {
	APTNAME = aPTNAME;
}
public String getUPD_DATE() {
	return UPD_DATE;
}
public void setUPD_DATE(String uPD_DATE) {
	UPD_DATE = uPD_DATE;
}
public String getADDRESS() {
	return ADDRESS;
}
public void setADDRESS(String aDDRESS) {
	ADDRESS = aDDRESS;
}

}