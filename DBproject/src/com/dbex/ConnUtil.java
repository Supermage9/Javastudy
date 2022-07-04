package com.dbex;
//검색유틸
import java.sql.*;
public class ConnUtil {
	
	static { // 스태틱은 객체 안만들어도 되므로 클래스명만 호출하면 메소드 사용가능
		
		try {
		  Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
		
		
	}
	
	public static Connection getConnection()throws SQLException{
		return DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:orcl", 
				"scott", 
				"tiger"
				);
	}
	
	

}
