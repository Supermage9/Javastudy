package study;

import java.util.Scanner;

public class ForExam02 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int n1,n2,sum;
		n1=n2=sum=0;
		
		
		//for(;;) {
		while(true) {
			
		    System.out.print("ù��° ���� �Է� :");
			n1 = sc.nextInt();
			if(n1==0) 
				break;
			System.out.print("�ι�° ���� �Է� :");
			n2 = sc.nextInt();
			sum=n1+n2;
			System.out.println(sum);

		}
		
		
		
	}

}
