package study;

import java.util.Scanner;


public class OperExam08 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int kor,eng,mat,sum=0;
		double avg=0;
		
		System.out.print("�������� : ");
		kor = Integer.parseInt(sc.next());
		
		System.out.print("�������� : ");
		eng = Integer.parseInt(sc.next());
		
		System.out.print("�������� : ");
		mat = Integer.parseInt(sc.next());
		
		
		
		sum = kor+eng+mat;
		avg = sum / 3.0f;
		
		System.out.printf("���� : %d\n��� : %.2f",sum, avg);
		sc.close();

		
		
		
		
		
	}

}
