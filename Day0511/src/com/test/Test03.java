package com.test;

import java.util.Scanner;

/*
 * ��]
 *    Ű����� ���� �׼��� �Է¹޾� ������, ����, ��õ��, õ��, �����, ���, ���ʿ�, �ʿ�, �Ͽ�
 *    ���� ��ȯ�ϴ� ���α׷� �ۼ�
 *    ��, �迭�� �ݺ��� ���
 *    �迭�� : unit
 *    �ݾ� : 65123
 *    
 */


public class Test03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		int[]unit= {50000,10000,5000,1000,500,100,50,10,1};
		System.out.print("�ݾ� :");
		int money = sc.nextInt();
		int count=0;
		for(int i=0;i<unit.length;i++) {
			count=money/unit[i];
			money%=unit[i];
			System.out.print(unit[i]+"�� ���� :"+count+"\n");
		}
		
		
		
		
		
		
		
		

	}

}
