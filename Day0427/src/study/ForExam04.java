package study;

import java.util.Scanner;

/*
 * ���� �Ǽ��� �Է¹޾� �Է¹��� ���� ����� ���ϴ�
      ���α׷� ����. ��, ���� ������ �ԷµǸ� ����Ͻÿ�.
 */


public class ForExam04 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		float a=0.0f,sum=0.0f,avg=0.0f, i=0.0f;
		
		for (a=1;;a++) {
		System.out.print("���� �Ǽ��� �Է��ϼ��� :");
		i = sc.nextFloat();
		if(i>0)
		sum = sum + i;
		if(i<0) { 
			break;}
		
		}
		avg=sum/a; 
		System.out.printf("���ݱ����� ��� : %.2f",avg);
		
		
		
	}

}
