package com.test;

/*	문) 학생 수를 입력받아 입력받은 인원수만큼 학생의 이름과 전화번호를 입력받고
 *     입력 받은 내용을 전체를 출력하는 프로그램 작성
 *     단, 배열을 이용하여 작성
 *     
 *     이름과 전화번호는 공백으로 구분
 *     
 *     이름 전화번호 입력(1)[공백구분] : 홍길동 010-1111-1111
 */
import java.util.*;
public class Test01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int stu;
		System.out.print("학생 수 입력 :");
		stu = sc.nextInt();
		String[]name=new String[stu];
		String[]phone=new String[stu];
		System.out.println("-------------------------------");
		for(int i=0;i<name.length;i++) {
		System.out.printf("이름과 전화번호 입력(%d)[공백구분]:",i+1);
		name[i]=sc.next();
		phone[i]=sc.next();
		}
		
		System.out.println();
		System.out.println("-------------------------------");
		System.out.println("입력받은 학생 수 :"+stu+"명");
		System.out.println("-------------------------------");
		System.out.println("이  름   전화번호");
		
		for(int j=0;j<stu;j++) {
			System.out.println(name[j]+"\t"+phone[j]);
		}
		
		
		
	}

}
