package com.test;

/*	��) �л� ���� �Է¹޾� �Է¹��� �ο�����ŭ �л��� �̸��� ��ȭ��ȣ�� �Է¹ް�
 *     �Է� ���� ������ ��ü�� ����ϴ� ���α׷� �ۼ�
 *     ��, �迭�� �̿��Ͽ� �ۼ�
 *     
 *     �̸��� ��ȭ��ȣ�� �������� ����
 *     
 *     �̸� ��ȭ��ȣ �Է�(1)[���鱸��] : ȫ�浿 010-1111-1111
 */
import java.util.*;
public class Test01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int stu;
		System.out.print("�л� �� �Է� :");
		stu = sc.nextInt();
		String[]name=new String[stu];
		String[]phone=new String[stu];
		System.out.println("-------------------------------");
		for(int i=0;i<name.length;i++) {
		System.out.printf("�̸��� ��ȭ��ȣ �Է�(%d)[���鱸��]:",i+1);
		name[i]=sc.next();
		phone[i]=sc.next();
		}
		
		System.out.println();
		System.out.println("-------------------------------");
		System.out.println("�Է¹��� �л� �� :"+stu+"��");
		System.out.println("-------------------------------");
		System.out.println("��  ��   ��ȭ��ȣ");
		
		for(int j=0;j<stu;j++) {
			System.out.println(name[j]+"\t"+phone[j]);
		}
		
		
		
	}

}
