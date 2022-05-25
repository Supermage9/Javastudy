package com.test;


import java.io.*;

public class Test003 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a,b,c;
		
		System.out.print("정수 입력 :");
		a = Integer.parseInt(br.readLine());
		
		System.out.print("정수 입력 :");
		b = Integer.parseInt(br.readLine());
		
		System.out.print("정수 입력 :");
		c = Integer.parseInt(br.readLine());
		
		
		if (a > b) {
			a = a ^ b ;
			b = b ^ a ;
			a = a ^ b ;
		}
		if (a > c) {
			a = a ^ c ;
			c = c ^ a ;
			a = a ^ c ;
		}
		if (b > c) {
			b = b ^ c ;
			c = c ^ b ;
			b = b ^ c ;
		}
		
		
		System.out.printf("%d,%d,%d",a,b,c);
		
		
		
		
	}

}
