package study;

import java.util.Scanner;

public class For02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1=1,sum=1;
		System.out.print("���� �Է� :");
		n1=sc.nextInt();
		
		
		for (int i=1;i<=n1;i++) {
			sum = sum * i;
		}
		
		System.out.println(n1+"�� ���丮�� ���� :"+sum);
		
		
		
	}

}
