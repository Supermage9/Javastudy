package com.test;



import java.util.*;

public class Test002 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i;
		
		System.out.print("정수 입력 :");
		i = sc.nextInt();
		
		
		if(i % 2 == 0 && i % 3 == 0) {
			System.out.print("2와 3의 배수입니다.");
		}else if (i % 2 == 0) {
			System.out.print("2의 배수입니다.");
		}else if (i % 3 == 0) {
			System.out.print("3의 배수입니다.");
		}else {
			System.out.print("2와 3의 배수가 아닙니다.");
		}
		
		sc.close();
		
		
		
	}

}
