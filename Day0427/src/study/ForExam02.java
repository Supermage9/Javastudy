package study;

/*		���� �ΰ��� �Է¹޾� �� �� ������ ������ �հ踦 ���ϴ� ���α׷��� �ۼ��Ͻÿ�
 * 
 */

import java.util.*;
public class ForExam02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1,num2,sum=0,i;
		System.out.print("ù��° ���� �Է� :");
		num1 = sc.nextInt();
		System.out.print("�ι�° ���� �Է� :");
		num2 = sc.nextInt();
		if(num1>num2) {
			num1 = num1 ^ num2;
			num2 = num2 ^ num1;
			num1 = num1 ^ num2;
		}
		
		for (i=num1;i<=num2;i++) {
		
		sum = sum + i;
		}
		System.out.println(sum);
		
		
		
		
		
		
		
		
	}

}
