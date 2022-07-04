package com.dbex;
// 동적 수정
import java.sql.*;

public class JdbcEx06 {

	public static void main(String[] args) {
		StringBuffer sql = new StringBuffer();
		
		sql.append("update professor ");
		sql.append("set sal =? ");
		sql.append("where name =?");
		
		Connection con = null;
		PreparedStatement pstmt = null; //동적 객체 선언
				
		try {
			//데이터베이스 연결
			con = ConnUtil.getConnection();
			
			pstmt = con.prepareStatement(sql.toString());
	
			pstmt.setInt(1, 500);
			pstmt.setString(2, "홍길동");
			
			// 쿼리 실행
			int i = pstmt.executeUpdate();
			System.out.println(i+"개의 행이 수정 되었습니다.");
			
			
			
			
		} catch(SQLException ss){
				ss.printStackTrace();
		} finally {
			try {if(pstmt!=null)pstmt.close();} catch (SQLException s) {}
			try {if(con!=null)con.close();} catch (SQLException s) {}
		}

	}

}
