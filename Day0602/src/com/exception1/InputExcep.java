package com.exception1;

import java.util.*;


public class InputExcep {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 3개 입력하세요.");
		
		int sum = 0,n=0;
		
		
		for(int i=0;i<3;i++) {
			System.out.print(i+1+"번째 정수 입력 :");
			try {
			n = sc.nextInt();
			}catch(InputMismatchException ie) {
				System.out.println("숫자를 입력하세요");
				//현재 입력스트림에 남아있는 토큰을 지운다.
				sc.nextLine();
				i--;//인덱스가 증가하지 않도록 미리 감소시킴
				continue;
			}
			sum += n;
		}
		
		
		System.out.println("정수 3개의 합 :"+sum);
		
	}

}
