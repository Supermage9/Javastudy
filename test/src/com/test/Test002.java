package com.test;



import java.util.*;

public class Test002 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i;
		
		System.out.print("���� �Է� :");
		i = sc.nextInt();
		
		
		if(i % 2 == 0 && i % 3 == 0) {
			System.out.print("2�� 3�� ����Դϴ�.");
		}else if (i % 2 == 0) {
			System.out.print("2�� ����Դϴ�.");
		}else if (i % 3 == 0) {
			System.out.print("3�� ����Դϴ�.");
		}else {
			System.out.print("2�� 3�� ����� �ƴմϴ�.");
		}
		
		sc.close();
		
		
		
	}

}
