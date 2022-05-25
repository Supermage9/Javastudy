package study;

import java.util.Scanner;

public class For04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1=0,sum=0,even=0,odd=0;
		System.out.print("정수 입력 :");
		n1 = sc.nextInt();
		
		for(int i=1;i<=n1;i++) {
			sum = sum + i;
			if(i%2==0) {
				even=even+i;
			}else if(i%2!=0) {
				odd = odd+i;
			}
			if(i%10==0) {
				System.out.println("1부터 "+i+"까지 전체의 합계 :"+sum);
				System.out.println("1부터 "+i+"까지 짝수의 합계 :"+even);
				System.out.println("1부터 "+i+"까지 홀수의 합계 :"+odd);
				System.out.println();
			}
			
			
		}
//		System.out.println("전체의 합계 :"+sum);
//		System.out.println("짝수의 합계 :"+even);
//		System.out.println("홀수의 합계 :"+odd);

	}

}
