package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBConnectionMgr {
	private final static String _DRIVER = "oracle.jdbc.driver.OracleDriver";
	private final static String _URL    = "jdbc:oracle:thin:@192.168.0.2:1521:orcl11";
	private final static String _USER   = "scott";
	private final static String _PW     = "tiger";
	// 캡슐화를 위한 final static 타입 선언 
	static DBConnectionMgr dbMgr = null;
	Connection con = null;
	public static DBConnectionMgr getInstance() {
		if(dbMgr==null) {
			dbMgr = new DBConnectionMgr();
		}
		return dbMgr;
	}
	public Connection getConnection() {
		try {
			Class.forName(_DRIVER);
			con = DriverManager.getConnection(_URL, _USER, _PW);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 클래스를 찾을수가 없습니다");
		} catch (Exception e) {
			System.out.println("오라클 서버에 접속 불가");
		}
		return con;
	}
	//사용한 자원 반납하기 
	//자원을 반납할 때는 생성된 객체의 역순으로 반납할것
	//이것을 하지 않으면 오라클 서버에 접속할 때 세션 수의 제한 떄문에 오라클서버를 재기동해야 할 수도 있음.
	public void freeConnection(Connection con, PreparedStatement pstmt, ResultSet rs) {
		try {
			if(rs !=null) rs.close();
			if(pstmt !=null) pstmt.close();
			if(con !=null) con.close();
		} catch (Exception e) {
		}
	}
	public void freeConnection(Connection con, PreparedStatement pstmt) {
		try {
			if(pstmt !=null) pstmt.close();
			if(con !=null) con.close();
		} catch (Exception e) {
		}
	}
}
