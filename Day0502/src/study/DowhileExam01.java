package study;
/*	문)
 * 국어 영어 수학점수를 입력받아 총점과 평균 그리고 학점을 구하는 프로그램을 작성
 * 학점 : 100~90:A, ~~~ 60이하는 F로 처리
 * 평균은 소수점이하 2자리까지 표시,
 * 단, 각 과목의 점수는 0~100을 벗어나지 못함.
 * do while문 활용
 */

import java.util.Scanner;

public class DowhileExam01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int kor=0,eng=0,mat=0,tot=0;
		double avg=0.0;
		char hak=0;
		
		do {
			System.out.print("국어점수 :");
			kor=sc.nextInt();
			}while(kor<0||kor>100);
		do {
			System.out.print("영어점수 :");
			eng=sc.nextInt();
			}while(eng<0||eng>100);
		
		do {
			System.out.print("수학점수 :");
			mat=sc.nextInt();
			}while(mat<0||mat>100);
	
		tot=kor+eng+mat;
		avg=tot/3.0f;
		
		switch((int)(avg/10)){
			case 10:
			case 9:
				hak='A';
				break;
			case 8:
				hak='B';
				break;
			case 7:
				hak='C';
				break;
			case 6:
				hak='D';
				break;
				default:
				hak='F';
				break;
				
		}
		
	
		System.out.printf("총점: %d%n평균: %.2f%n학점 :%c",tot,avg,hak);
		
		
		
		
		
		
	}

}
