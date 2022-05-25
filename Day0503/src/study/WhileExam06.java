package study;

import java.util.Scanner;

/*
 * 콜라,사이다,마운틴,초코송이,에이스,웨하스가 나오는 자판기
프로그램 구현
 */


public class WhileExam06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i=0,j=0,k=0;
		String s ="";
		
		
		while(true) {
			System.out.print("상품을 골라주세요.(1.콜라 2.사이다 3.마운틴듀 4.초코송이 5.에이스 6.웨하스):");
			i=sc.nextInt();
			
			if(i==1) {
				System.out.println("콜라가 나왔습니다.");
			}else if(i==2) {
				System.out.println("사이다가 나왔습니다.");
			}else if(i==3) {
				System.out.println("마운틴듀가 나왔습니다.");
			}else if(i==4) {
				System.out.println("초코송이가 나왔습니다.");
			}else if(i==5) {
				System.out.println("에이스가 나왔습니다.");
			}else if(i==6) {
				System.out.println("웨하스가 나왔습니다.");
			}else {
				System.out.println("입력오류");
			}
			System.out.println("다른 상품을 고르시겠습니까?(y/n):");
			s = sc.next();
			if(s.equals("y")||s.equals("Y")) {
				continue;
			}else {
				break;
			}
			
			
		}
		
		
		
		

	}

}
