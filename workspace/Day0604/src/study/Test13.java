package study;

import java.util.*;


public class Test13 {
	
	public static String getRole(int age) {
		
		String s;
		
		if(age>=18) {
			s = "����";
		}else if(age>=13) {
			s = "û�ҳ�";
		}else if(age>=6) {
			s = "���";
		}else if(age<=5&&age>0) {
			s = "����";
		}else {
			s = "�Է¿���";
		}
		
		return s;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		String role = getRole(age);
		System.out.println(role);
		
		
	}

}
