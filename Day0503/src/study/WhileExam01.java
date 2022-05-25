package study;

/*
 * 사용자로부터 하나의 숫자를 입력받은 다음, 그 수만큼 3의 배수를 출력하는 프로그램 작성
 * 만약 사용자로부터 5를 입력받았다면 3 6 9 12 15를 출력
 */
import java.util.*;
public class WhileExam01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i=1,j=1;
		System.out.print("정수 입력 :");
		i = sc.nextInt();
		
		while(j<=i){
			System.out.print((j*3)+" ");
			j++;
			
		}
		
		
		
		
		
		
		
		
	}

}
