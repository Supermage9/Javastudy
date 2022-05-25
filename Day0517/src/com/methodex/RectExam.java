package com.methodex;

/*	�簢���� ���̿� �ѷ��� ����ϴ� ���α׷� (Ŭ������ ǥ��)
 * 	
 *   Ŭ������ �Ӽ� : ����,����,����,�ѷ�,����,����,����
 *   Ŭ������ ��� : ���̰��, �ѷ����, ����/���� �Է±��, �����±��
 *   
 *   ��ü�� ���� : ������(�Ӽ�,����)+���(����)
 *   Ŭ������ ���� : ������� + �޼ҵ�
 */

import java.util.*;

class Rect {
	/*	 ��� ���� ����
	 * 
	 *    ���� ���� : Ŭ���� ��ü �ȿ��� Ȱ�������� ����(static)
	 *    ���(����) ���� : Ŭ������ �ҼӵǾ� �ִ� ����
	 *    �ν��Ͻ� ���� : �ν��Ͻ��� ������ ���� �ǹ�
	 *      rect re = new Rect();
	 *     
	 */
	//����, ���� ������� ����
	int w,h;
	
	//�޼ҵ� ����(����/���� �Է�)
	//void : �޼ҵ� ���� �� �޼ҵ带 ȣ���� ���� ����� ������ �ʿ䰡 ���� �� ���
	
	void input() {
		Scanner sc = new Scanner(System.in); // ��ĳ�� �ν��Ͻ� ����
		
		System.out.print("���� �Է� :");
		w=sc.nextInt();
		System.out.print("���� �Է� :");
		h=sc.nextInt();
		
	}
	//���� ��� ���(�޼ҵ� ����)
	int area() {
		int result;
		result = w*h;
		
		return result;
		
		/*
		 *   �޼ҵ�� return���� ���ؼ��� ����� �����ְ� �ȴ�.
		 */
	
	}
	int legnth() {
		int result;
		result = 2*(w+h);
		
		return result;
	}
	/*
	 *   ��� �޼ҵ� ����
	 *   
	 *   �Ű������� ���� �����͸� �Ѱ� ����(���� ���� ���� ������)
	 *   �޼ҵ��� �Ű� ������ �޼ҵ� ���ּ��� Ȱ�� ����
	 *   �Ű����� ����� ������ �������� �ڷ����� ���� �����ؾ���.
	 */
	void print(int a,int i) {
		
		System.out.println("���� :"+w);
		System.out.println("���� :"+h);
		System.out.println("���� :"+a);
		System.out.println("�ѷ� :"+i);
	}
	
}



public class RectExam {

	public static void main(String[] args) {
		
		//1.�ν��Ͻ� ����
		Rect r =new Rect();
		
		//�Է� �޼ҵ� ȣ��
		r.input();
		
		//���̿� �ѷ� �޼ҵ� ȣ��
		int a = r.area();//����
		int b = r.legnth();//�ѷ�
		
		//��� �޼ҵ� ȣ��
		r.print(a, b);
		
		
	}

}
