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
			//����̹� �˻�
			Class.forName("oracle.jdbc.driver.OracleDriver");
					
			String url="jdbc:oracle:thin:@localhost:1521:orcl";
			String id="scott";
			String password="tiger";
					
			//DB����
			con = DriverManager.getConnection(url, id, password);
			stmt = con.createStatement();
			/*
			 * �����ϰ��� �ϴ� sql�� select�� ���
			 *  ���� ������ ��������� ���� ������ �ִ�
			 *  executeQuery() �޼ҵ带 �����
			 */
			rs = stmt.executeQuery(sql.toString());
			/*
			 *  resultSet ��ü�κ��� ������ ����
			 *  resultSet�� �޼ҵ� next()�� Ŀ���� ���������� �̵���Ŵ
			 *  �̵��� ��ġ�� row(��)�� �����ϸ� true, �������� ������ false�� ��ȯ
			 *  
			 *  rs.next()�� ���� ����, �� ��� ���տ� ���� �����ϴµ��� ResultSet���κ���
			 *  �����͸� ������
			 *  while(rs.next()){
			 *  
			 *  }
			 */
			while(rs.next()){
				// Ŀ���� ��ġ�� row�� ������ column���� ���� �����ϱ�
				// resultSet�� getXXX(�÷��� ��ġ),getXXX("�÷��� �̸�")
				// �޼ҵ带 �̿��ؼ� column���� ������
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