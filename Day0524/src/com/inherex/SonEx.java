package com.inherex;

/*	������
 * 	 �� Ÿ���� ���������� ���� Ÿ���� ��ü�� ������ �� �ֵ��� �ϴ� ���� �ǹ���.
 *   �θ�Ŭ������ Ÿ���� ���������� �ڽ� Ŭ������ �ν��Ͻ��� ������ �� �ֵ��� ��.
 *   �θ�Ŭ���� = �ڽ�
 *   
 *   ������ ����� ����
 *   Super super = new Super();
 *   Sub sub = new Sub();
 *   
 *   ������ ���� �� ����
 *   Super super = new Sub();
 *   
 *    Super s1 = new Police(); ����
 *    Super s2 = new Boss(); ���� 
 *    Super s3 = new Fire(); �ҹ��
 *    
 *    ����������
 *    �޼ҵ�� �ڽİ��� ���
 *    ��������� �θ���� ���
 */


class ParentEx{
	
	int foo = 5; // �θ��� �������
	
	public int getNumber(int a) { // �θ��� �޼ҵ�
		return a+1;
	}
	
}

public class SonEx extends ParentEx{
	
	int foo = 7; // �ڽ��� �������
	
	@Override
	public int getNumber(int a) { //�ڽ� �޼ҵ�
		return a+2;
	}
	
	public static void main(String[] args) {
		
		ParentEx pe = new SonEx();
		System.out.println(pe.getNumber(0));
		System.out.println(pe.foo);
	}
	
}