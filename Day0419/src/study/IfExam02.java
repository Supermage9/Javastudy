package study;


import java.util.*;

public class IfExam02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int score,year;
		
		
		System.out.print("점수를 입력하시오(0~100):");
		score = sc.nextInt();
		
		System.out.print("학년을 입력하시오(1~4):");
		year = sc.nextInt();
		
		
		
		if(score>=60) {
			
			if(year==4) {//&&활용
		
				if(score>=70) {System.out.print("합격");}
				else {System.out.print("불합격");} 
			}
			else {System.out.print("합격");}
		
		}
		else {System.out.print("불합격");}
		
		
		sc.close();
	}
}