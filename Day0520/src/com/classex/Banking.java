package com.classex;


import java.io.*;

public class Banking {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Account na = new Account("ȫ�浿");
		
		String strWork;
		
		do {
			System.out.println("\n�۾��� �����ϼ���");
			System.out.println("=============================");
			System.out.println("��      �� =================> 1");
			System.out.println("��      �� =================> 2");
			System.out.println("�� �� �� ȸ =================> 3");
			System.out.println("��      �� =================> 0");
			System.out.println("=============================");
			
			System.out.print("�۾� ������ �����ϼ��� :");
			strWork = br.readLine();
		
			int switchInt = 0;
			
			if(strWork != null) { // �޴��� ���� �Ǿ��� ���
				switchInt = Integer.parseInt(strWork);
				}else {
				System.out.println("�۾� ������ �Է����� �����̽��ϴ�.");
				System.exit(0);
			}
			
			switch(switchInt) {
			case 0:
				System.out.println("���α׷��� �����մϴ�.");
				break;
			case 1:
				System.out.println("\n=============================");
				System.out.print("�Ա��� �ݾ��� �Է��ϼ��� :");
				String strdepositIn = br.readLine();
				long depositLong = Long.parseLong(strdepositIn);
				na.deposit(depositLong);
				break;
			case 2://���
				System.out.println("\n=============================");
				System.out.print("����� �ݾ��� �Է��ϼ��� :");
				String strwithdrawIn = br.readLine();
				long withdrawLong = Long.parseLong(strwithdrawIn);
				na.withdraw(withdrawLong);
				break;
			case 3://�ܾ�Ȯ��
				System.out.println(na.getName()+"���� �ܰ�� "+na.getBalance()+"�� �Դϴ�.");
				break;
			default:
				System.out.println("0 ~ 3 ������ ���ڸ� �Է��ϼ���.\n");
			}
			
			
			
			
		}while (!strWork.equals("0"));
		
		
		
		

	}

}
