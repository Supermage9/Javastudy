package study;

import java.util.Scanner;

public class ForExam01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n=1, sum=1;
		System.out.print("팩토리얼 입력 :");
		n = sc.nextInt();
		
//		for(;n>0;n--) {
//			sum = sum * n;
//		}
		
		for (int i = 1;i<=n;i++) 
			sum *=i;
		
		
		System.out.println(sum);
		
		
		
		
	}

}
