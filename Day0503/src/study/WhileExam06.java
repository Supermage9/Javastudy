package study;

import java.util.Scanner;

/*
 * �ݶ�,���̴�,����ƾ,���ڼ���,���̽�,���Ͻ��� ������ ���Ǳ�
���α׷� ����
 */


public class WhileExam06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i=0,j=0,k=0;
		String s ="";
		
		
		while(true) {
			System.out.print("��ǰ�� ����ּ���.(1.�ݶ� 2.���̴� 3.����ƾ�� 4.���ڼ��� 5.���̽� 6.���Ͻ�):");
			i=sc.nextInt();
			
			if(i==1) {
				System.out.println("�ݶ� ���Խ��ϴ�.");
			}else if(i==2) {
				System.out.println("���̴ٰ� ���Խ��ϴ�.");
			}else if(i==3) {
				System.out.println("����ƾ�డ ���Խ��ϴ�.");
			}else if(i==4) {
				System.out.println("���ڼ��̰� ���Խ��ϴ�.");
			}else if(i==5) {
				System.out.println("���̽��� ���Խ��ϴ�.");
			}else if(i==6) {
				System.out.println("���Ͻ��� ���Խ��ϴ�.");
			}else {
				System.out.println("�Է¿���");
			}
			System.out.println("�ٸ� ��ǰ�� ���ðڽ��ϱ�?(y/n):");
			s = sc.next();
			if(s.equals("y")||s.equals("Y")) {
				continue;
			}else {
				break;
			}
			
			
		}
		
		
		
		

	}

}
