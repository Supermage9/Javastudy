package study;

import java.util.Scanner;

public class For03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1=0,n2=0,sum=0;
		
		for (;;) {
			System.out.print("정수 입력 :");
			n1 = sc.nextInt();
			System.out.print("정수 입력 :");
			n2 = sc.nextInt();
			sum=n1+n2;
			System.out.println("합계 :"+sum);
		}
		
		
		
		
		

	}

}
