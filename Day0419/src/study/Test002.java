package study;

import java.util.*;

public class Test002 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int kor, eng, mat, sci, his, sum, avg;
		char hak;
		
		System.out.print("�������� : ");
		kor = sc.nextInt();
		
		System.out.print("�������� : ");
		eng = sc.nextInt();
		
		System.out.print("�������� : ");
		mat = sc.nextInt();
		
		System.out.print("�������� : ");
		sci = sc.nextInt();
		
		System.out.print("�������� : ");
		his = sc.nextInt();
		
		sum = kor + eng + mat + sci + his ;
		avg = sum / 5 ;
		
		System.out.printf("���� : %d\n���� : %d\n���� : %d\n���� : %d\n���� : %d\n"
				+ "���� : %d\n��� : %d\n",kor,eng,mat,sci,his,sum,avg);
		
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
					
		System.out.println("���� : "+hak);
		
		
		
	
		
		sc.close();
		
		
	}

}
