package study;
/*
 * ����ڷκ��� ������ ������ ������ ������ŭ �Է¹޾�
 * �Է¹��� ���߿��� ���� ū ���� ����ϴ� ���α׷� �ۼ�
 * 
 * ��, �迭�� �̿�
 * 
 * �Է��� ������ ���� : 9
 * ������ �Է� : 
 * ���� ū �� :
 * 
 * 
 * 
 */
import java.util.*;
public class ArrEx04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�������� ���� �Է� :");
		int n = sc.nextInt();
		
		//�Է¹��� ������ ũ�⸦ ������
		int[]arr = new int[n];
		
		System.out.print("������ �Է�[���� ����]:");
		
		for(int i=0;i<arr.length;i++) {
			//�迭�� �Է¹��� ������ ����
			arr[i]=sc.nextInt();
		}
		
		int max = 0;//���� ū ���� ������ ����
		for(int i=0;i<arr.length;i++) {
			//max���� ū �� ��󳻱�
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.print("���� ū �� :"+max);
	}

}
