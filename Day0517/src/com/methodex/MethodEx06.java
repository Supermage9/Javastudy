package com.methodex;

import java.io.*;

public class MethodEx06 {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	//클래스 메소드와 인스턴스 메소드의 차이 = static
	public static int getInt(String str)throws IOException{
		//인스턴스 메소드
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.print(str+":");
		int imsi = Integer.parseInt(br.readLine());
		
		return imsi;
	}

	public static void main(String[] args)throws IOException{
		
		
//		int kor = 30;
		int kor = getInt("국어점수");
		System.out.println("당신의 국어 점수는 "+kor+"점 입니다.");
		
		
		
		
		
		
	}

}
