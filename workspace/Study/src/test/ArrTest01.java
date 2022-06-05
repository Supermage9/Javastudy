package test;

import java.util.Scanner;

//100 개의 정수를 저장할 수 있는 배열을 선언하고 정수를 차례로 입력받다가 0 이 입력되면 0 을 제외하고
//그 때까지 입력된 정수를 가장 나중에 입력된 정수부터 차례대로 출력하는 프로그램을 작성하시오.
public class ArrTest01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[]arr = new int[100];
		
//		int arr[]={1,2,3,4,5,6,7};
		
		for(int i=0;i<arr.length;i++) {
			System.out.print("정수 입력 :");
			arr[i]=sc.nextInt();
			if(arr[i]==0) {
				break;
			}
		}
		for(int j=arr.length-1;j>=0;j--) {
			if(arr[j]!=0) {
				System.out.println(arr[j]);
					
			}
		}
		
		
		
	
	
	}
		
}


