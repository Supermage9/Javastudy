package study;

/*
 * 1. �⵵�� 4�� ������ �������� �ش� �������� �Ѵ�.
 * 2. �� �߿��� 100���� ������ �������� �ش� ������� ��
 * 3. �ٸ� 400���� ������ �������� �ش� �ٽ� �������� ��
 * 
 * 1���� ��� ��¥�� 365.2425�Ϸ� ���Ͽ� ��
 * ���� 1�⺸�� 0.0003���� ���
 * 
 * ������ ��¥�� 28, 30, 31���̸� ���
 * 29���̸� ����
 */

import java.io.*;
public class Test03 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int year, month, day;
		System.out.print("�⵵ �Է� : ");
		year = Integer.parseInt(br.readLine());
		
		System.out.print("�� �Է� : ");
		month = Integer.parseInt(br.readLine());
		
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			day = 31;
			break;
		case 2:
			if(year%4==0 && year % 100 != 0 || year % 400 == 0) {
				day = 29;
			}else {
				day = 28;
			}break;
			
			default : 
				day=0; 
				break;
		}
		
		if(day !=0) {
			System.out.println(year + "�� " + month + "���� "+day+"�ϱ��� �Դϴ�.");
		}else {
			System.out.println("�Է� ����");
		}
		
		if (day == 29) {
			System.out.println("�����Դϴ�.");
		}else {
			System.out.println("����Դϴ�.");
		}
		
		
		
	}

}
