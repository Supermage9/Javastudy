package study;
/*	��)
 * ���� ���� ���������� �Է¹޾� ������ ��� �׸��� ������ ���ϴ� ���α׷��� �ۼ�
 * ���� : 100~90:A, ~~~ 60���ϴ� F�� ó��
 * ����� �Ҽ������� 2�ڸ����� ǥ��,
 * ��, �� ������ ������ 0~100�� ����� ����.
 * do while�� Ȱ��
 */

import java.util.Scanner;

public class DowhileExam01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int kor=0,eng=0,mat=0,tot=0;
		double avg=0.0;
		char hak=0;
		
		do {
			System.out.print("�������� :");
			kor=sc.nextInt();
			}while(kor<0||kor>100);
		do {
			System.out.print("�������� :");
			eng=sc.nextInt();
			}while(eng<0||eng>100);
		
		do {
			System.out.print("�������� :");
			mat=sc.nextInt();
			}while(mat<0||mat>100);
	
		tot=kor+eng+mat;
		avg=tot/3.0f;
		
		switch((int)(avg/10)){
			case 10:
			case 9:
				hak='A';
				break;
			case 8:
				hak='B';
				break;
			case 7:
				hak='C';
				break;
			case 6:
				hak='D';
				break;
				default:
				hak='F';
				break;
				
		}
		
	
		System.out.printf("����: %d%n���: %.2f%n���� :%c",tot,avg,hak);
		
		
		
		
		
		
	}

}
