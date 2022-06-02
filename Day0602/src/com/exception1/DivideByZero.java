package com.exception1;

import java.util.*;

public class DivideByZero {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//나뉨수
		int dividend;
		//나눔수
		int divisor;
		
		System.out.print("나뉨수 입력 :");
		dividend = sc.nextInt();
		System.out.print("나눔수 입력 :");
		divisor = sc.nextInt();
		
		try {
		System.out.println(dividend+"를 "+divisor+"로 나누면 몫은 "+(dividend / divisor)+"다.");
		}catch (ArithmeticException ae) {
//			ae.printStackTrace();
//			ae.getMessage();
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
		
		
		
	}

}
