package study;

import java.util.Scanner;

public class For05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1=0,n2=0,sum=0;
		double avg = 0.0;
		System.out.print("������ ���� �Է� :");
		n1 = sc.nextInt();
		
		for (int i=0;i<n1;i++) {
			System.out.print("���� �Է� :");
			n2 = sc.nextInt();
			sum = sum + n2;
		}
		avg = sum / n1;
		System.out.printf("�հ谪 : %d\n��հ� :%.2f",sum,avg);
		
		

	}

}
