package study;

/* 문)
 * -1^2 + 2^2 -3^2 + 4^2 -5^2 +.......+100^2
 * 의 합계를 구하는 프로그램
 * 
 * 
 */

public class WhileExam03 {

	public static void main(String[] args) {
		
		int i=1,sum1=1,sum2=0;
		
		while(i<=100) {
			sum1=-sum1;
			sum2+=sum1*(i*i);
			i++;
			
		}
		
		System.out.println(sum2);
		
		
		
		
		
		
	}

}
