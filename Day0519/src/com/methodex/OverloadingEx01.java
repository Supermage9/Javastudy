package com.methodex;

/*  �޼ҵ� �����ε�
 *   
 *   ������(�ϳ���) Ŭ�������� ���� �̸��� ���� �޼ҵ尡 ������ ���ǵǴ� ���� �ǹ���
 *   ���� �̸��� �޼ҵ��� ����(�Ű�����)�� �ٸ� ���
 *   ���ڰ� �ٸ��ٴ� ���� ������ ������ �ٸ��ų�, �ڷ����� �ٸ��ų�, ������ ���� �ٸ� ���� �ǹ���
 *   ���� �������� ����� ������ �����ϴ� �޼ҵ���� ��� �̸��� ���� ����� �ϰ����� �����ϱ� ����.
 *   
 *   ���� ������	��ȯ��	�޼ҵ��(�ڷ��� ����, �ڷ��� ����, ...)
 *      1. ���� �����ڿ� ��ȯ���� �������
 *      2. �޼ҵ� �̸��� �ݵ�� ���ƾ� �Ѵ�.
 *      3. �ڷ����̳� ������ ������ �ݵ�� �ٸ��� �ؾ���
 */
public class OverloadingEx01 {
	
	public void intLength(int a) {
		String s = String.valueOf(a);
		System.out.println("�Է��� ���� ���� :"+s.length());
	}
	public void floatLength(float a) {
		String s = String.valueOf(a);
		System.out.println("�Է��� ���� ���� :"+s.length());
	}
	public void stringLength(String str) {
		
		System.out.println("�Է��� ���� ���� :"+str.length());
	}

	public static void main(String[] args) {
		
		OverloadingEx01 oe1 = new OverloadingEx01();
		oe1.intLength(1000);
		oe1.floatLength(314f);
		oe1.stringLength(null);
		
		
		// ������ε�
		
		
	}

}
