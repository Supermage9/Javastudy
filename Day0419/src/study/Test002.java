package study;

import java.util.*;

public class Test002 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int kor, eng, mat, sci, his, sum, avg;
		char hak;
		
		System.out.print("국어점수 : ");
		kor = sc.nextInt();
		
		System.out.print("영어점수 : ");
		eng = sc.nextInt();
		
		System.out.print("수학점수 : ");
		mat = sc.nextInt();
		
		System.out.print("과학점수 : ");
		sci = sc.nextInt();
		
		System.out.print("역사점수 : ");
		his = sc.nextInt();
		
		sum = kor + eng + mat + sci + his ;
		avg = sum / 5 ;
		
		System.out.printf("국어 : %d\n영어 : %d\n수학 : %d\n과학 : %d\n역사 : %d\n"
				+ "총점 : %d\n평균 : %d\n",kor,eng,mat,sci,his,sum,avg);
		
		if(avg>=90) {
			hak='A';
		}else if(avg >=80) {
			hak='B';
		}else if(avg >=80) {
			hak='B';
		}else if(avg >=70) {	
			hak='C';
		}else if(avg >=60) {	
			hak='D';
		}else {
			hak='F';
		}
					
		System.out.println("학점 : "+hak);
		
		
		
	
		
		sc.close();
		
		
	}

}
