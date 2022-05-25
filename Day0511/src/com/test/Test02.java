package com.test;

/*	문]
 *     양의 정수 10개를 입력받아 배열에 저장하고, 배열에 있는 정수 중에서
 *     3의 배수만을 출력하는 프로그램을 작성
 *     
 */
import java.util.*;
public class Test02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수의 개수 입력 :");
		int cnt = sc.nextInt();
		int[]arr = new int[cnt];
		
		for(int i=0;i<cnt;i++) {
			System.out.print("정수 입력 :");
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<cnt;i++) {
			if(arr[i]%3==0)
			System.out.print(arr[i]+"  ");
		}
		

	}

}
