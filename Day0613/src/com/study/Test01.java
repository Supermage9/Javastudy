package com.study;

import java.util.*;
public class Test01 {

	public static void main(String[] args) {
		
		//���� ��ü ����
		Random r = new Random();
		//���� ��ü����
		Stack st = new Stack<>();
		
		int nNum,i; // nNum : �������� ������ ������ �����ϴ� ����
		System.out.print("���ÿ� ����� �� :");
		for(i=0;i<10;i++) {
			r.setSeed(r.nextLong()); //seed ����
			
			nNum = (r.nextInt()%100);
			st.push(nNum); //���ÿ� ����
			System.out.print(" "+nNum);
		}
		System.out.println();
		//���ÿ� ���� ���� ���
		System.out.print("���ÿ� ����� �� ��� :");
		for(i=0;i<10;i++) {
			System.out.print(st.pop()+" ");
		}
		
		
		
	}

}
