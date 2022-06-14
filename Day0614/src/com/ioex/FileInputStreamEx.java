package com.ioex;

import java.io.*;
public class FileInputStreamEx {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		byte _read[] = new byte[100];
		//������ �б� ���� �迭 ����
		byte _console[]= new byte[100];
		//Ű���� �Է��� ���� �о console �迭�� ����
		
		try {
			System.out.println("���ϸ� :");
			System.in.read(_console);
			
			String file = new String(_console).trim();//���� ���� �޼ҵ�
			
			fis = new FileInputStream(file);
			fis.read(_read,0,_read.length);
			System.out.println(new String(_read).trim());
			
		}catch(FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}catch(IOException ie) {
			ie.printStackTrace();
		}finally {
			try {
				if(fis!=null)
				fis.close();
			}catch(IOException ii) {
				ii.printStackTrace();
			}
		}
		
	}

}
