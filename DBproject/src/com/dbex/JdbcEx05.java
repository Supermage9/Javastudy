package com.dbex;

import java.sql.*;
/*
 *  ����Ŭ�� ���۵� SQL���� Parsing(��ȯ) -> execute plan -> fetch(����) �� �۾��� �� ����
 *  SQL�� �������� Data Buffer Cache�� ������
 *  
 *  �Ȱ��� SQL�� ���۵Ǹ� Library cache�� ����� SQL�� Parsing �����
 *  execute plan�� �״�� ����ϰ� �����ν� �ӵ� ��� ������ ��
 *  
 *  PreparedStatement�� SQL�� ���´� �����ϳ� �����̳� �������� �ٸ� ������
 *  ���ε� ������ ����ؼ� ����ó�������ν� �׻� ������ SQL���� �����ϰ� ó���� �� �ִ�.
 *  
 *  -- PreparedStatement ��ü�� ������ ���ε� ������ ���
 *  
 *     ���ε� ������ ���������� ��ü�� �κп� �����
 *                                        deptno,dname,college,loc
 *                                          203 ��ǻ�Ͱ���   200  7ȣ��                       
 *     String sql = "insert into department values(?,?,?,?)";
 *     PreparedStatement pstmt = con.preparedStatement(sql);
 *     
 *     ���ε� ������ ������ŭ ������� �ش� ������ ��ü�� ���� ������ �ش�.
 *     pstmt.setInt(1,203);
 *     pstmt.setString(2,"��ǻ�Ͱ���");
 *     pstmt.setInt(3,200);
 *     pstmt.setString(4,"7ȣ��");
 *     
 *     �ءءءء� ���ε� ������ ����! �÷����� ����� �� ����.�ءءءء�
 *     
 *     PreparedStatement�� PreparedStatement �� ���ε� ������ ����
 *     �������ִ� setXXX()�޼ҵ带 �����Ѵ�.
 */


public class JdbcEx05 {

	public static void main(String[] args) {
		
		//PreparedStatement�� ����ϴ� ��� sql�������� ���������� ��ü�� �κ��� ?�� ó���Ѵ�.
		// ?�� DataBase���� sql ����ÿ� ���� ������ ��ü��.
		StringBuffer sql = new StringBuffer();
		
		sql.append("insert into professor ");
		sql.append("values(?,?,?,?,?,sysdate,?,?) ");
		
		
		
		Connection con = null;
		PreparedStatement pstmt = null; //���� ��ü ����
				
		try {
			//�����ͺ��̽� ����
			con = ConnUtil.getConnection();
			
			pstmt = con.prepareStatement(sql.toString());
			
			// ������ �Ķ���� ����(��¥ ���� 7��)
			// ������ ?(���ε� ����)�� ��ü�� �������� ������
			pstmt.setInt(1, 9920); 
			pstmt.setString(2, "ȫ�浿");
			pstmt.setString(3, "gildongHong");
			pstmt.setString(4, "���ӱ���");
			pstmt.setInt(5, 250);
			pstmt.setInt(6, 32);
			pstmt.setInt(7, 203);
			
			// ���� ����
			int i = pstmt.executeUpdate();
			System.out.println(i+"���� ���� �߰� �Ǿ����ϴ�.");
			
			
			
			
		} catch(SQLException ss){
				ss.printStackTrace();
		} finally {
			try {if(pstmt!=null)pstmt.close();} catch (SQLException s) {}
			try {if(con!=null)con.close();} catch (SQLException s) {}
		}
		
		
	}

}
