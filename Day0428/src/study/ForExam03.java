package study;

import java.util.Scanner;

public class ForExam03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1,tot,odd,even;
		n1=tot=odd=even=0;
		System.out.print("정수 입력 :");
		n1 = sc.nextInt();
		
		for (int i = 1;i<=n1;i++) {
			
			if(i%2==0) {
				even = even + i;
			}
			else 
				odd = odd +i;
			tot = tot+i;
			System.out.printf("1~%d 까지의 전체의 합 :%d\n1~%d 까지의 짝수의 합 :%d\n1~%d 까지의 홀수의 합 :%d\n",i,tot,i,even,i,odd);
			
			
			if (i==n1) {
				System.out.printf("1~%d 까지의 전체의 합 :%d\n1~%d 까지의 짝수의 합 :%d\n1~%d 까지의 홀수의 합 :%d\n",i,tot,i,even,i,odd);
			}
			
			}
		}
	}
//		System.out.printf("1~%d 까지의 전체의 합 :%d\n1~%d 까지의 짝수의 합 :%d\n1~%d 까지의 홀수의 합 :%d\n",n1,tot,n1,even,n1,odd);

