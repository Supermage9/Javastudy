package com.study;

/*	java.util ��Ű���� ����
 *  "2022/06/13" �̶�� ���ڿ��� ���� 2022,06,13���� �и��Ҷ� �����
 *  ������ ���ڿ��� ��ū�̶�� ��
 */

import java.util.*;
public class StringTokenEx01 {
	
	StringTokenizer st;
	
	public StringTokenEx01(String str) {
		st = new StringTokenizer(str);
	}
	public StringTokenEx01(String str,String delim) {
		System.out.println("str :"+str);
		st = new StringTokenizer(str,delim);
	}
	public void print() {
		System.out.println("Token count :"+st.countTokens());
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}
	
	

	public static void main(String[] args) {
		StringTokenEx01 st1 = new StringTokenEx01("Happy Day");
		st1.print();
		System.out.println();
		StringTokenEx01 st2 = new StringTokenEx01("2022/06/13","/");
		st2.print();
	}

}
