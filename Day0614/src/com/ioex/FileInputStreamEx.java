package com.ioex;

import java.io.*;
public class FileInputStreamEx {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		byte _read[] = new byte[100];
		//파일을 읽기 위한 배열 선언
		byte _console[]= new byte[100];
		//키보드 입력한 값을 읽어서 console 배열에 저장
		
		try {
			System.out.println("파일명 :");
			System.in.read(_console);
			
			String file = new String(_console).trim();//공백 제거 메소드
			
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
