package com.dbex;


import java.sql.*;//DB쓰려면 임포트해야함.
/*
 *  JDBC(Java DataBase Connection)를 이용한 데이터베이스 연결 방법
 *  
 *    총 6단계로 이루어진다.
 *    
 *    1단계
 *      - import java.sql.*;
 *    
 *    2단계
 *      - Driver 검색단계
 *        oracle : oracle.jdbc.driver.OracleDriver
 *    
 *    3단계
 *      - DataBase 연결
 *        Connection con = DriverManager.getConnection(url,id,password);
 *        
 *          oracle url --> jdbc:oracle:thin:@localhost:1521:SID(orcl)
 *                  id : 오라클 사용자 계정
 *                  password : 오라클 사용자 계정의 비밀번호
 *    --------------------  무조건 해야한다  ---------------------              
 *    4단계
 *      - 쿼리문 작성              
 *      
 *      정적
 *      Statement Class(정적)
 *       - Statement stmt = con.createStatement();
 *       
 *      동적
 *      PreparedStatement(동적)
 *       - PreparedStatement pstmt = con.PreparedStatement();
 *      
 *      
 *    5단계
 *      - 쿼리 결과 저장
 *      
 *      -정적일때
 *      ResultSet rs = stmt.executeQuery(query); // select일때
 *      ResultSet rs = stmt.executeUpdate(query); // insert,update,delete일때
 *      
 *      -동적일때
 *      ResultSet rs = pstmt.executeQuery(query); // select일때
 *      ResultSet rs = pstmt.executeUpdate(query); // insert,update,delete일때
 *      
 *     
 *   -------------------------- 6단계 무조건 실행해야함 --------------------------     
 *    6단계
 *      - 사용후 반드시 close() 메소드를 실행한다.
 *      연결 해제   
 *        
 *      
 */

public class JdbcEx01 {

	public static void main(String[] args) {
		//DB연결객체선언
		Connection con = null;
		Statement stmt = null;
		
		try {
			
			//jdbc 드라이브 메모리에 로드하기
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:orcl",
					//로컬호스트 포트번호 127.0.0.1 가능
					"scott", "tiger");
			//System.out.println("데이터베이스 연결성공");//
			//Statement 객체 얻기
			stmt = con.createStatement();
			//sql문 작성
			StringBuffer sql = new StringBuffer();
			
			sql.append("insert into department ");
			sql.append("values(203,'제어계측공학과',200,'7호관')");
			//쿼리 실행
			int result = stmt.executeUpdate(sql.toString());
			
			// insert,update,delete일때 : executeUpdate(sql.toString());
			// select일때 : executeQuery(sql.toString()); 메소드로 활용
			
			System.out.println(result + "개의 행이 추가되었습니다.");
			
			
			
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		} catch(SQLException se) {
			se.printStackTrace();
		} finally {
			try {if (stmt!=null)stmt.close();} catch (SQLException s) {}
			try {if (con!=null)con.close();} catch (SQLException s) {}
		}
		
		
		
		
		
		
		
	}

}
