package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test004 {

	public static void main(String[] args) throws IOException{
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int don, oman, man, chon, obak, bak, osip, sip, il;
		
		System.out.print("금액 입력 :");
		don = Integer.parseInt(br.readLine());
		
		oman = (don / 50000) ;

		don = don % 50000;
		
		System.out.println(don);
	}

}
