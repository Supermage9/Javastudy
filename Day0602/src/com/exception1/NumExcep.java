package com.exception1;

public class NumExcep {

	public static void main(String[] args) {
		
		String[]stringNumber = {"23","12","3.141592","998"};
		
		int i=0;
		
		
		for(i=0;i<stringNumber.length;i++) {
			try {
			int n=Integer.parseInt(stringNumber[i]);
				System.out.println("������ȯ�� ���� "+n);
			}catch(NumberFormatException ne) {
				System.out.println(stringNumber[i]+"�� ������ ��ȯ�� �� �����ϴ�.");
			}
		}
		
		
	}

}