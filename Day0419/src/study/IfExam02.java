package study;


import java.util.*;

public class IfExam02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int score,year;
		
		
		System.out.print("������ �Է��Ͻÿ�(0~100):");
		score = sc.nextInt();
		
		System.out.print("�г��� �Է��Ͻÿ�(1~4):");
		year = sc.nextInt();
		
		
		
		if(score>=60) {
			
			if(year==4) {//&&Ȱ��
		
				if(score>=70) {System.out.print("�հ�");}
				else {System.out.print("���հ�");} 
			}
			else {System.out.print("�հ�");}
		
		}
		else {System.out.print("���հ�");}
		
		
		sc.close();
	}
}