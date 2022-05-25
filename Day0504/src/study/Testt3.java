package study;

import java.util.Scanner;

public class Testt3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str="";
		int n=1;
		
		while(n!=0) {
			System.out.print("1.콜라 2.사이다 3.마운틴듀 4.초코송이 5.에이스 6.웨하스 0.종료");
			n= sc.nextInt();
			switch(n) {
			case 1:
				str="콜라";
				break;
			case 2:
				str="사이다";
				break;
			case 3:
				str="마운틴듀";
				break;
			case 4:
				str="초코송이";
				break;
			case 5:
				str="에이스";
				break;
			case 6:
				str="웨하스";
				break;
			default:
				str="선택하신 상품이 없습니다";
			}
			System.out.println(str);
		}
		
		
		
		
		
		
		
		
		
	}

}
