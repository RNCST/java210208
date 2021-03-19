package com.design.zipcode;

public class StringTest {
	
	public static void main(String[] args) {
		String sql= "select ";
		sql=sql + "empno, ename ";
		sql=sql + "FROM emp ";
		sql=sql + "WHERE empno > 7000";
		System.out.println(sql);
		
		String sql2= "JAVA";
		sql2.replace('J', 'H');
		System.out.println(sql2);
		sql2 = sql2.replace('J', 'H');
		System.out.println(sql2);
		
		StringBuffer sb = new StringBuffer();
		sb.append("select ");
		sb.append("empno, ename ");
		sb.append("FROM emp ");
		sb.append("WHERE empno > 7000 ");
		
		System.out.println(sb);
		
		//String은 변경할때마다 대입연산자로 초기화를 해줘야한다 == > 그때마다 객체가 메모리에 생성된다 ==> 메모리 누수가 발생됨.
	}

}
