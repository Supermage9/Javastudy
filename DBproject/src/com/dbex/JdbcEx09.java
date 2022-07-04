package com.dbex;

import java.sql.*;
import java.io.*;
import java.util.*;

public class JdbcEx09 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
			Properties pro = new Properties();
			pro.load(new FileInputStream("src/department.properties"));
		
				
				Connection con = null;
				PreparedStatement pstmt = null; //���� ��ü ����
						
				try {
					//�����ͺ��̽� ����
					con = ConnUtil.getConnection();
					
					/*  department.properties�� ���ǵ� sql�� �����ͼ�
					 *  preparedStatement ����
					 */
					
					pstmt = con.prepareStatement(pro.getProperty("department_insert"));
					
					// ������ �Ķ���� ����(��¥ ���� 7��)
					// ������ ?(���ε� ����)�� ��ü�� �������� ������
					pstmt.setInt(1, 100); 
					pstmt.setString(2, "������а�");
					pstmt.setInt(3, 200);
					pstmt.setString(4, "5ȣ��");
					
					
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
