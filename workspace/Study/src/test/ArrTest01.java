package test;

import java.util.Scanner;

//100 ���� ������ ������ �� �ִ� �迭�� �����ϰ� ������ ���ʷ� �Է¹޴ٰ� 0 �� �ԷµǸ� 0 �� �����ϰ�
//�� ������ �Էµ� ������ ���� ���߿� �Էµ� �������� ���ʴ�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
public class ArrTest01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[]arr = new int[100];
		
//		int arr[]={1,2,3,4,5,6,7};
		
		for(int i=0;i<arr.length;i++) {
			System.out.print("���� �Է� :");
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


