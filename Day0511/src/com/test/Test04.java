package com.test;


/*
 *  ��]
 *     ��ǻ�Ϳ� ����� ������ ���������� ������ ����ÿ�
 *     ����ڰ� ���� 3������ �ϳ��� �Է��ϰ� ������
 *     ��ǻ�ʹ� �������� �ϳ��� �����Ͽ� ����ڿ� ��
 *     ���� �̰���� �Ǵ��ϰ� ����ڰ� �׸��� �Է��ϸ� ���� ����
 *     
 *     ���ڿ� �迭 ����
 *     
 *     ��ǻ�Ͱ� ���� ���� �����ϰ� �����ϱ� ���ؼ���
 *     int n = (int)(Math.random()*3);
 *     
 *     ��ǻ�Ͱ� �� �Ͱ� ��
 *     
 *     if(str[n].equals("����"))
 * 
 */
import java.util.*;
public class Test04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		String[]str= {"����","����","��"};
//		String com,user;
		
//		while(true) {
//			System.out.print("���� ���� �� :");
//			user=sc.next();
//			int ran = (int)(Math.random()*3);
//			
//			if(user.equals("����")) {
//				if(str[ran].equals(user)) {
//					System.out.println("��ǻ�� : "+str[ran]+" ���� :"+user);	
//					System.out.print("�����ϴ�\n");		
//				}
//				if(str[ran].equals("����")) {
//					System.out.println("��ǻ�� : "+str[ran]+" ���� :"+user);
//					System.out.print("�����ϴ�\n");
//				}
//				if(str[ran].equals("��")) {
//					System.out.println("��ǻ�� : "+str[ran]+" ���� :"+user);
//					System.out.print("�̰���ϴ�\n");
//				}
//			}else if(user.equals("����")) {
//				if(str[ran].equals("����")) { 
//					System.out.println("��ǻ�� : "+str[ran]+" ���� :"+user);
//					System.out.print("�̰���ϴ�\n");
//				}
//				if(str[ran].equals("����")) {
//					System.out.println("��ǻ�� : "+str[ran]+" ���� :"+user);
//					System.out.print("�����ϴ�\n");
//				}
//				if(str[ran].equals("��")) {
//					System.out.println("��ǻ�� : "+str[ran]+" ���� :"+user);
//					System.out.print("�����ϴ�\n");
//				}
//			}else if(user.equals("��")) {
//				if(str[ran].equals("����")) {
//					System.out.println("��ǻ�� : "+str[ran]+" ���� :"+user);
//					System.out.print("�����ϴ�\n");
//				}
//				if(str[ran].equals("����")) {
//					System.out.println("��ǻ�� : "+str[ran]+" ���� :"+user);
//					System.out.print("�̰���ϴ�\n");
//				}
//				if(str[ran].equals("��")) {
//					System.out.println("��ǻ�� : "+str[ran]+" ���� :"+user);
//					System.out.print("�����ϴ�\n");
//				}
//			}else {
//				break;
//			}
//			
//			
//		}
		
		String[]com= {"����","����","��"};
		
		System.out.println("����������?");
		while(true) {
			System.out.print("���������� :");
			String a = sc.next();
			if(a.equals("�׸�")) {
				System.out.println("������ �����մϴ�.");
				break;
			}
			int n = (int)(Math.random()*3);
			//0 1 2 �߿��� ������ ������ ����
			String b=com[n];
			System.out.print("����� : "+a+"��ǻ�� : "+b);
			if(a.equals("����")) {
				if(b.equals("����")) {
					System.out.println("�����ϴ�.");
				}else if(b.equals("����")){
					System.out.println("�����ϴ�.");
				}else {
					System.out.println("�̰���ϴ�.");
				}
			}
			if(a.equals("����")) {
				if(b.equals("����")) {
					System.out.println("�̰���ϴ�.");
				}else if(b.equals("����")){
					System.out.println("�����ϴ�.");
				}else {
					System.out.println("�����ϴ�.");
			    }
			}
			if(a.equals("��")) {
				if(b.equals("����")) {
					System.out.println("�����ϴ�.");
				}else if(b.equals("����")){
					System.out.println("�̰���ϴ�.");
				}else {
					System.out.println("�����ϴ�.");
				}
		    }
			
			
			
			
	
		}

	}

}
