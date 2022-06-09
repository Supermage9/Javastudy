package com.loginex;

import java.util.*;
public class LoginMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean isStop = false;
		
		LoginService loginSVC = new LoginService();
		
		do {
			
			System.out.println("�α��� ȭ���Դϴ�.");
			System.out.println("���̵�� ��й�ȣ�� �Է��ϼ���.");
			System.out.print("���̵� :");
			String id = sc.next();
			System.out.print("��й�ȣ :");
			String pswd = sc.next();
			
			UserVO user = loginSVC.login(id, pswd);
			
			if(user == null) {
				System.out.println("���̵�� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			}else {
				System.out.println("�α����� ����� �����Դϴ�.");
				System.out.println(user);
				isStop = true;
			}
			
		}while(!isStop);
		
		
		
		
	}

}
