package study;

import java.util.Scanner;

public class For04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1=0,sum=0,even=0,odd=0;
		System.out.print("���� �Է� :");
		n1 = sc.nextInt();
		
		for(int i=1;i<=n1;i++) {
			sum = sum + i;
			if(i%2==0) {
				even=even+i;
			}else if(i%2!=0) {
				odd = odd+i;
			}
			if(i%10==0) {
				System.out.println("1���� "+i+"���� ��ü�� �հ� :"+sum);
				System.out.println("1���� "+i+"���� ¦���� �հ� :"+even);
				System.out.println("1���� "+i+"���� Ȧ���� �հ� :"+odd);
				System.out.println();
			}
			
			
		}
//		System.out.println("��ü�� �հ� :"+sum);
//		System.out.println("¦���� �հ� :"+even);
//		System.out.println("Ȧ���� �հ� :"+odd);

	}

}
