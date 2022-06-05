package study;

import java.util.*;
public class Test08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수입력 :");
		int n = sc.nextInt();
		int value = 0;
		int sum = 0;
		
//		n / 100 = 9
//		n / 10 = 93
//		n / 1 = 931
//		
//		n % 100 = 32
//		n % 10 = 2
//		n % 1 = 0
		while(n!=0) {
			value = value + n%10;
			n/=10;
		}
		System.out.println("각 자리수의 합 :"+value);
		
		
		
		
	}

}
