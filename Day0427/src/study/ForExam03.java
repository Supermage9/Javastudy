package study;

import java.util.Scanner;

public class ForExam03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int su1=0,su2=0,n=0,sum=0;
		
		System.out.print("첫번째 정수 입력 :");
		su1 = sc.nextInt();
		System.out.print("두번째 정수 입력 :");
		su2 = sc.nextInt();
		System.out.print("배수 입력 :");
		n = sc.nextInt();
		
		
		if(su1> su2) { // 첫번째 정수가 큰 경우에만 수행
			su1 = su1 ^ su2;
			su2 = su2 ^ su1;
			su1 = su1 ^ su2;
		}
		
		
		for (int i = su1;i<=su2;i++) {
			if(i % n == 0) {
				sum += i;
			}
		
		}
		
		System.out.println(sum);
		
		
		
		
	}

}
