package com.dbex;

// DELETE

import java.sql.*;
public class JdbcEx03 {

	public static void main(String[] args) {
		
		StringBuffer sql = new StringBuffer();
		
		sql.append("delete from department ");
		sql.append("where dname = '컴퓨터공학과'");
		
		Connection con = null;
		Statement stmt = null;
				
		try {
			//드라이버 검색
			Class.forName("oracle.jdbc.driver.OracleDriver");
					
			String url="jdbc:oracle:thin:@localhost:1521:orcl";
			String id="scott";
			String password="tiger";
					
			//DB연결
			con = DriverManager.getConnection(url, id, password);
			stmt = con.createStatement();
			
			
		} catch (ClassNotFoundException cnfe) {
				cnfe.printStackTrace();
		} catch (SQLException ss){
				ss.printStackTrace();
		} finally {
			
			try {if(stmt!=null)stmt.close();
			} catch (SQLException s) {
			} try {if(con!=null)con.close();
		    } catch (SQLException s) {
		    }
		}

	}

}
