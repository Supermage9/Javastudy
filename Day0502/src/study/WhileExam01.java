package study;
/*
 * ��)
 * ����ڰ� �Է��ϴ� ������ ����ؼ� ���� ������.
 * ���� 0�� �ԷµǸ� ���ݱ��� �Էµ� ������ �հ踦 ����ϰ� �����ϴ� ���α׷� ����
 * ��,while�� �̿�
 */

import java.util.Scanner;

public class WhileExam01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i=0,sum=0;
		
		
		while(true) {
			System.out.print("���� �Է� :");
			i = sc.nextInt();
			sum+=i;
			if(i==0) {
				System.out.print("�հ� :"+sum);
				break;
			}
		}
		
		
		
		
		

	}

}
