package com.study;

import java.util.*;

class Rect{//�簢�� Ŭ����
	
	//�Ӽ�(�������), ���(��� �޼ҵ�)
	//��������(����/����)
	//��������(Ŭ��������,�ν��Ͻ�����)
	int w,h;
	
	//�޼ҵ� ����,���� - ����ü(���)�� ���� ���� ����, ����� ������ ����. �������̵��� ������.
	//void ��ȯ�� - ��ȯ ���� ������ �ǹ�.(������ ���� ����)
	//��ȯ - �޼ҵ� ������ ������� ȣ���Ѱ����� �����ִ°�.
	
	void input() {
		//�ν��Ͻ�(��ü,��������) ����
		Scanner sc = new Scanner(System.in);//system.in - �ְܼ� Ű���带 �����ϴ� Stream�� ���� in�� inputstream�� ����
		System.out.print("�����Է�:");
		w = sc.nextInt();
		System.out.print("�����Է�:");
		h = sc.nextInt();
	}
	
	/* ���� ���
	 * 
	 *  �޼ҵ� ���� �� ��� �ִ� ���(������ ����)
	 *  ���� �ڷ����� int���� �����.
	 */
	public int area() {
		
		int result = w * h;
		return result;
		/*
		 *   �޼ҵ�� ���Ϲ��� ���ؼ��� ������� ��ȯ�Ѵ�.
		 */
		
	}
	
	//�ѷ� ���
	int length() {
		
		int result = 2 * (w+h);
		return result;
	}
	
	//��� �޼ҵ�
	void print(int a, int b) {
		
		/*
		 * 	�Ű������� ���� �����͸� �Ѱ� ����(�������� �ʴ� ������)
		 *   
		 *   �Ű����� ?  a = area();
		 *   ���ڰ� ? b = length();
		 *   
		 */
		
		System.out.println("���� :"+w);
		System.out.println("���� :"+h);
		System.out.println("���� :"+a);
		System.out.println("�ѷ� :"+b);
		
		
	}
	
	
}



//����Ŭ����
public class Method_TestEx {
	
	public static void main(String[] args) {
		
		Rect r1 = new Rect(); // ��ü ����
		r1.input();//�޼ҵ� ȣ��
		int a = r1.area(); //���� ��� ����� ���Ϲ���.
		int b = r1.length();// �ѷ� ��� ��� ���Ϲ���.
		
		r1.print(a,b);
		
		
	}

}
