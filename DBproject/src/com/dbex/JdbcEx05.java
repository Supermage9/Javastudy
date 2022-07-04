package com.dbex;

import java.sql.*;
/*
 *  오라클로 전송된 SQL문은 Parsing(변환) -> execute plan -> fetch(인출) 의 작업을 한 이후
 *  SQL문 수행결과를 Data Buffer Cache에 저장함
 *  
 *  똑같은 SQL이 전송되면 Library cache에 저장된 SQL의 Parsing 결과와
 *  execute plan의 그대로 사용하게 됨으로써 속도 향상에 도움을 줌
 *  
 *  PreparedStatement는 SQL의 형태는 동일하나 조건이나 변수값이 다른 문장을
 *  바인딩 변수를 사용해서 변수처리함으로써 항상 동일한 SQL문을 동일하게 처리할 수 있다.
 *  
 *  -- PreparedStatement 객체의 생성과 바인딩 변수의 사용
 *  
 *     바인딩 변수는 실제값으로 대체될 부분에 사용함
 *                                        deptno,dname,college,loc
 *                                          203 컴퓨터공학   200  7호관                       
 *     String sql = "insert into department values(?,?,?,?)";
 *     PreparedStatement pstmt = con.preparedStatement(sql);
 *     
 *     바인딩 변수의 개수만큼 순서대로 해당 변수와 대체될 값을 지정해 준다.
 *     pstmt.setInt(1,203);
 *     pstmt.setString(2,"컴퓨터공학");
 *     pstmt.setInt(3,200);
 *     pstmt.setString(4,"7호관");
 *     
 *     ※※※※※ 바인딩 변수는 절대! 컬럼명에는 사용할 수 없다.※※※※※
 *     
 *     PreparedStatement는 PreparedStatement 의 바인딩 변수에 값을
 *     지정해주는 setXXX()메소드를 제공한다.
 */


public class JdbcEx05 {

	public static void main(String[] args) {
		
		//PreparedStatement를 사용하는 경우 sql쿼리에서 실제값으로 대체될 부분을 ?로 처리한다.
		// ?는 DataBase에서 sql 실행시에 실제 값으로 대체됨.
		StringBuffer sql = new StringBuffer();
		
		sql.append("insert into professor ");
		sql.append("values(?,?,?,?,?,sysdate,?,?) ");
		
		
		
		Connection con = null;
		PreparedStatement pstmt = null; //동적 객체 선언
				
		try {
			//데이터베이스 연결
			con = ConnUtil.getConnection();
			
			pstmt = con.prepareStatement(sql.toString());
			
			// 쿼리의 파라미터 세팅(날짜 제외 7개)
			// 쿼리의 ?(바인딩 변수)에 대체될 실제값을 지정함
			pstmt.setInt(1, 9920); 
			pstmt.setString(2, "홍길동");
			pstmt.setString(3, "gildongHong");
			pstmt.setString(4, "전임교수");
			pstmt.setInt(5, 250);
			pstmt.setInt(6, 32);
			pstmt.setInt(7, 203);
			
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
