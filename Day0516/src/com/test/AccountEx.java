package com.test;

public class AccountEx {

	public static void main(String[] args) {
		
		//�ν��Ͻ�(��ü) ����
		Account ac= new Account();
		
		
		ac.setMoney(10000, "1234"); //set�� ����, get�� �������� ( �ҽ� - getter setter)
		
		
		int myPay = ac.getMoney();
		System.out.println("���� ���� �ܾ� : "+myPay);
		
	}

}
