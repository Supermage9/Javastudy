package com.methodex;

import java.io.*;

public class MethodEx06 {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	//Ŭ���� �޼ҵ�� �ν��Ͻ� �޼ҵ��� ���� = static
	public static int getInt(String str)throws IOException{
		//�ν��Ͻ� �޼ҵ�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.print(str+":");
		int imsi = Integer.parseInt(br.readLine());
		
		return imsi;
	}

	public static void main(String[] args)throws IOException{
		
		
//		int kor = 30;
		int kor = getInt("��������");
		System.out.println("����� ���� ������ "+kor+"�� �Դϴ�.");
		
		
		
		
		
		
	}

}
