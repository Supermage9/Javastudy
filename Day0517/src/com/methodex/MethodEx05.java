package com.methodex;

import java.io.*;

public class MethodEx05 {
	
	
	public static String getString(String str)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print(str+":");
		String imsi = br.readLine();
		
		return imsi;
		
	}
	

	public static void main(String[] args) throws IOException{
		String name = getString("�̸�");
		System.out.println(name+"�� �ȳ��ϼ���.");
		
		
		

	}

}
