package com.methodex;

/*	�޼ҵ� ���ǽ� ���ϵ� ������ �ڷ����� '...'��� �����ϹǷ� �̸� ���� �޼ҵ带 �����ϴµ�
 *  �ʿ��� ������ ���� ����(���������� �迭ȭ �۾��� �ڵ����� ����)�ϰ� ������ �� �ִ�.
 *  
 */


public class VariableEx {
	
	public void argTest(String...n) {
		for(int i=0;i<n.length;i++) {
			System.out.println("n["+i+"]:"+n[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		VariableEx ve = new VariableEx();
		ve.argTest("a","b","c");
		ve.argTest("100","600","1000","10000");
		
	}

}