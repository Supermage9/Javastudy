package study;
/*
 * 사용자로부터 임의의 정수를 임의의 개수만큼 입력받아
 * 입력받은 수중에서 가장 큰 수를 출력하는 프로그램 작성
 * 
 * 단, 배열을 이용
 * 
 * 입력할 데이터 개수 : 9
 * 데이터 입력 : 
 * 가장 큰 수 :
 * 
 * 
 * 
 */
import java.util.*;
public class ArrEx04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("데이터의 개수 입력 :");
		int n = sc.nextInt();
		
		//입력받은 정수로 크기를 지정함
		int[]arr = new int[n];
		
		System.out.print("데이터 입력[공백 구분]:");
		
		for(int i=0;i<arr.length;i++) {
			//배열에 입력받은 데이터 저장
			arr[i]=sc.nextInt();
		}
		
		int max = 0;//가장 큰 수를 저장할 변수
		for(int i=0;i<arr.length;i++) {
			//max보다 큰 값 골라내기
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.print("가장 큰 수 :"+max);
	}

}
