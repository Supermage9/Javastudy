package com.dbex;

import java.sql.*;
import java.io.*;
import java.util.*;

public class JdbcEx09 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
			Properties pro = new Properties();
			pro.load(new FileInputStream("src/department.properties"));
		
				
				Connection con = null;
				PreparedStatement pstmt = null; //동적 객체 선언
						
				try {
					//데이터베이스 연결
					con = ConnUtil.getConnection();
					
					/*  department.properties에 정의된 sql을 가져와서
					 *  preparedStatement 만듬
					 */
					
					pstmt = con.prepareStatement(pro.getProperty("department_insert"));
					
					// 쿼리의 파라미터 세팅(날짜 제외 7개)
					// 쿼리의 ?(바인딩 변수)에 대체될 실제값을 지정함
					pstmt.setInt(1, 100); 
					pstmt.setString(2, "산업공학과");
					pstmt.setInt(3, 200);
					pstmt.setString(4, "5호관");
					
					
					// 쿼리 실행
					int i = pstmt.executeUpdate();
					System.out.println(i+"개의 행이 추가 되었습니다.");
					
					
					
					
				} catch(SQLException ss){
				    ss.printStackTrace();
				} finally {
					try {if(pstmt!=null)pstmt.close();} catch (SQLException s) {}
					try {if(con!=null)con.close();} catch (SQLException s) {}
				}
	}

}
