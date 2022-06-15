package com.ioex;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputStreamEx {

	public static void main(String[] args) {
		DataInputStream dis = null; //2��
		FileInputStream fis = null; //1��
		
		try {
			//DataOutputStream�� ����� FileOutputStream
			fis = new FileInputStream("c:/ppp/data.sav");
			//�⺻�ڷ����� Ÿ���� ������ä ����� ���� �о����
			//���� �� �ݵ�� ����� ������� �о�;���.
			dis = new DataInputStream(fis);
			
			int i = dis.readInt();
			double d = dis.readDouble();
			String s = dis.readUTF();
			
			System.out.println("i�� :"+i);
			System.out.println("d�� :"+d);
			System.out.println("s�� :"+s);
			
			
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {if(fis!=null) {fis.close();}}catch(IOException e) { e.printStackTrace();}
			try {if(dis!=null) {dis.close();}}catch(IOException e) { e.printStackTrace();}
		}

	}

}
