package com.dbex;

import java.sql.*;

public class JdbcEx04 {


	public static void main(String[] args) {
				
		StringBuffer sql = new StringBuffer();
				
		sql.append("select * from department");
		
		Connection con = null;
		Statement stmt = null;
		
		ResultSet rs = null;
		//
		
		try {
			//드라이버 검색
			Class.forName("oracle.jdbc.driver.OracleDriver");
					
			String url="jdbc:oracle:thin:@localhost:1521:orcl";
			String id="scott";
			String password="tiger";
					
			//DB연결
			con = DriverManager.getConnection(url, id, password);
			stmt = con.createStatement();
			/*
			 * 실행하고자 하는 sql이 select일 경우
			 *  쿼리 실행의 결과집합을 리턴 받을수 있는
			 *  executeQuery() 메소드를 사용함
			 */
			rs = stmt.executeQuery(sql.toString());
			/*
			 *  resultSet 객체로부터 데이터 추출
			 *  resultSet의 메소드 next()는 커서를 다음행으로 이동시킴
			 *  이동된 위치에 row(행)가 존재하면 true, 존재하지 않으면 false를 반환
			 *  
			 *  rs.next()가 참인 동안, 즉 결과 집합에 행이 존재하는동안 ResultSet으로부터
			 *  데이터를 추출함
			 *  while(rs.next()){
			 *  
			 *  }
			 */
			while(rs.next()){
				// 커서가 위치한 row의 각각의 column에서 값을 추출하기
				// resultSet의 getXXX(컬럼의 위치),getXXX("컬럼의 이름")
				// 메소드를 이용해서 column값을 추출함
				int i = rs.getInt(1);//rs.getInt("deptno");
				String s1 = rs.getString(2);
				int j = rs.getInt("college");
				String s2 = rs.getString("loc");
				System.out.println(i+"\t"+s1+"\t"+j+"\t"+s2);
			}
			
			
		} catch (ClassNotFoundException cnfe) {
				cnfe.printStackTrace();
		} catch(SQLException ss){
				ss.printStackTrace();
		} finally {
			  try {if(stmt!=null)stmt.close();
			} catch (SQLException s) {
			} try {if(con!=null)con.close();
		    } catch (SQLException s) {
		    } try {if(rs!=null)rs.close();
			} catch (SQLException s) {
			}
		}
				
	}

}