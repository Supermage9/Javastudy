package com.test;

/*	��]
 *     ���� ���� 10���� �Է¹޾� �迭�� �����ϰ�, �迭�� �ִ� ���� �߿���
 *     3�� ������� ����ϴ� ���α׷��� �ۼ�
 *     
 */
import java.util.*;
public class Test02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ ���� �Է� :");
		int cnt = sc.nextInt();
		int[]arr = new int[cnt];
		
		for(int i=0;i<cnt;i++) {
			System.out.print("���� �Է� :");
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<cnt;i++) {
			if(arr[i]%3==0)
			System.out.print(arr[i]+"  ");
		}
		

	}

}
