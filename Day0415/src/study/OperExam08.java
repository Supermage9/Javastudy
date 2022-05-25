package study;

import java.util.Scanner;


public class OperExam08 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int kor,eng,mat,sum=0;
		double avg=0;
		
		System.out.print("국어점수 : ");
		kor = Integer.parseInt(sc.next());
		
		System.out.print("영어점수 : ");
		eng = Integer.parseInt(sc.next());
		
		System.out.print("수학점수 : ");
		mat = Integer.parseInt(sc.next());
		
		
		
		sum = kor+eng+mat;
		avg = sum / 3.0f;
		
		System.out.printf("총점 : %d\n평균 : %.2f",sum, avg);
		sc.close();

		
		
		
		
		
	}

}
