package study;

import java.util.Scanner;

/*	구구단
 * 	234
 * 	567
 * 	89
 * 	출력
 */

public class ForExam02 {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		
//		int a;
//		
//		System.out.println("입력 : ");
//		a = sc.nextInt();
		
		int i=2,j=1,n=1;
		
		
		for(j=1;j<=3;j++) {
			
			for(n=1;n<=9;n++) {
				
				if(j==1) {
					for(i=2;i<=4;i++) {
					System.out.printf("%d x %d = %2d\t",i,n,i*n);
					}
				}
				if(j==2) {
					for(i=5;i<=7;i++) {
					System.out.printf("%d x %d = %2d\t",i,n,i*n);
					}
				}
				if(j==3) {
					for(i=8;i<=9;i++) {
					System.out.printf("%d x %d = %2d\t",i,n,i*n);
					}
				}
				System.out.println();
			}
			System.out.println();
				
				
		}
			
			
			
			
			
			
	}
			
		
		
		
		
			
	

}
