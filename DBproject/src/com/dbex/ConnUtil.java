package com.dbex;
//�˻���ƿ
import java.sql.*;
public class ConnUtil {
	
	static { // ����ƽ�� ��ü �ȸ��� �ǹǷ� Ŭ������ ȣ���ϸ� �޼ҵ� ��밡��
		
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
