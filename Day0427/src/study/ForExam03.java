package study;

import java.util.Scanner;

public class ForExam03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int su1=0,su2=0,n=0,sum=0;
		
		System.out.print("ù��° ���� �Է� :");
		su1 = sc.nextInt();
		System.out.print("�ι�° ���� �Է� :");
		su2 = sc.nextInt();
		System.out.print("��� �Է� :");
		n = sc.nextInt();
		
		
		if(su1> su2) { // ù��° ������ ū ��쿡�� ����
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
