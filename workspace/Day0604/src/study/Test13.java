package study;

import java.util.*;


public class Test13 {
	
	public static String getRole(int age) {
		
		String s;
		
		if(age>=18) {
			s = "성인";
		}else if(age>=13) {
			s = "청소년";
		}else if(age>=6) {
			s = "어린이";
		}else if(age<=5&&age>0) {
			s = "유아";
		}else {
			s = "입력오류";
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
