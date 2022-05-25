package com.classex;

public class Account {
	
	private String name;  //������
	private long balance; //�ܰ�
	
	public Account() {
		
	}
	
	public Account(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public long getBalance() {
		return balance;
	}
	
	
	//�Աݱ��
	public void deposit(long amount) {
		balance += amount;
	}
	
	
	
	//��ݱ��
	public void withdraw(long amount){
		if(balance<amount) {
			System.out.println("�ܾ��� �����մϴ�.");
		}else {
			balance -=amount;	
		}
		
	}
	
	
	
}
