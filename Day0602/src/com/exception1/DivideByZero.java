package com.exception1;

import java.util.*;

public class DivideByZero {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//������
		int dividend;
		//������
		int divisor;
		
		System.out.print("������ �Է� :");
		dividend = sc.nextInt();
		System.out.print("������ �Է� :");
		divisor = sc.nextInt();
		
		try {
		System.out.println(dividend+"�� "+divisor+"�� ������ ���� "+(dividend / divisor)+"��.");
		}catch (ArithmeticException ae) {
//			ae.printStackTrace();
//			ae.getMessage();
			System.out.println("0���� ���� �� �����ϴ�.");
		}
		
		
		
		
	}

}
