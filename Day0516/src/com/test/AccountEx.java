package com.test;

public class AccountEx {

	public static void main(String[] args) {
		
		//인스턴스(객체) 생성
		Account ac= new Account();
		
		
		ac.setMoney(10000, "1234"); //set은 접근, get은 가져오기 ( 소스 - getter setter)
		
		
		int myPay = ac.getMoney();
		System.out.println("현재 나의 잔액 : "+myPay);
		
	}

}
