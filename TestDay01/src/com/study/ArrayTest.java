package com.study;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		
		String names[] = {"ȫ�浿","����ġ","�̵�","�������","�̼���","������","�縸��","���ο�"};
		
		Scanner sc = new Scanner(System.in);
		
		int index = -1;
		
		do {
			System.out.print("�˻��� �̸� �Է� :");
			String name = sc.next();
			for(int i =0;i<names.length;i++) {
				//�Է¹��� �̸��� �迭�� ����Ǿ� �ִ� �̸��� �������� ����.
				if(name.equals(names[i])) {
					index = i;
				}
			}
			if(index!= -1) { //ã�Ҵ�.
				System.out.println(name+"�� �迭�� "+index+"��° �Դϴ�.");
				break;
			}else {
				System.out.println("�ش� �̸��� names �迭�� �����ϴ�.");
			}
			
		}while(true);
		
		for(String s : names) {
			System.out.print(s+" ");
		}
	}

}
