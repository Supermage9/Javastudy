package study;

/* ��)
 * -1^2 + 2^2 -3^2 + 4^2 -5^2 +.......+100^2
 * �� �հ踦 ���ϴ� ���α׷�
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
