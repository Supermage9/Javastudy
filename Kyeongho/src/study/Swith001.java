package study;

import java.util.*;
public class Swith001 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("���� ���� �Է��ϼ��� :");
		int month = sc.nextInt();
		
		
		
		switch (month) {
			case 3 :
			case 4 :
			case 5 :
				System.out.println("���� ������ ���Դϴ�.");
				break;
			case 6 : case 7 : case 8 :
				System.out.println("���� ������ �����Դϴ�.");
		}
		
		
		
		
		
		
		
	}

		
}
