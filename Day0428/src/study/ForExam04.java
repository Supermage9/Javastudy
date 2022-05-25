package study;

import java.util.Scanner;

public class ForExam04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n1=0,n2 = 0;
		double avg =0.0,sum=0.0;
		
		System.out.print("정수의 개수 입력:");
		n1 = sc.nextInt();
		
		for(int i=1;i<=n1;i++) {
			System.out.print("정수 입력 :");
			n2 = sc.nextInt();
			sum=sum+n2;
		}
		avg = sum / n1;
		System.out.printf("평균 :%.2f\n",avg);
		
		

	}

}
