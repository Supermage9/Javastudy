package com.methodex;

public class OverloadingEx02 {

	public void getLength(int n) {
		String s = String.valueOf(n);
		getLength(s);
		
	}
	
	void getLength(float n1) { // ���ڰ��� ������ �ٸ�
	
		
	}
	
	private int getLength(String str) { // �ڷ����� �ٸ�
		
		System.out.println("�Է��� ���� ���� :"+str.length());
	
		return 0;
	}
	
	public static void main(String[] args) {
		
		OverloadingEx02 oe2 = new OverloadingEx02();
		oe2.getLength(1000);
		oe2.getLength(3.14f);
		oe2.getLength("1000000");
		
		
		
		
		
	}

}