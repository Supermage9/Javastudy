package study;

/*
 * 문) 임의의 숫자가 들어있는 배열의 숫자 데이터들 중
 * 짝수인 요소만 골라서 출력하고,
 * 3의 배수인 요소만 골라서 출력하는 프로그램을 구현
 * 
 * 임의의 숫자 : 4,7,9,1,3,2,5,6,8
 * 
 * 1. 배열의 전체 요소 출력 :4,7,9,1,3,2,5,6,8
 * 2. 짝수 출력 : 4,2,6,8
 * 3. 3의 배수출력 : 9,3,6
 *
 */
public class Test01 {

	public static void main(String[] args) {
		
		int[] arr = {4,7,9,1,3,2,5,6,8};
		
		System.out.println("전체 요소 출력");
		for(int i=0;i<arr.length;i++) {
			System.out.printf("%2d",arr[i]);
		}
		System.out.println();
		System.out.println("짝수 출력");
		
		for(int j=0;j<arr.length;j++) {
			if(arr[j]%2==0) {
				System.out.printf("%2d",arr[j]);
			}
		}
		System.out.println();
		System.out.println("3의 배수 출력");
		
		for(int k=0;k<arr.length;k++) {
			if(arr[k]%3==0) {
				System.out.printf("%2d",arr[k]);
			}
		}
		
		
		
	}

}
