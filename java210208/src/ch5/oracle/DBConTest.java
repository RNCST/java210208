package ch5.oracle;

import java.sql.Connection;

import com.util.DBConnectionMgr;

/**
 * @author OSH
 * 오라클 단위테스트를 하는 방법
 *
 */
public class DBConTest {

	public static void main(String[] args) {
		DBConnectionMgr dbMgr = DBConnectionMgr.getInstance();
		Connection con = null;
		try {
			con = dbMgr.getConnection();
			
		} catch (Exception e) {
			System.out.println("Exception : " + e.toString());
			
		}
		System.out.println("con : " + con);
	}

}
