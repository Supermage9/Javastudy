



import java.util.*;

public class Test001 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		
		int i ;
		
		System.out.print("정수 입력 :");
		i = sc.nextInt();
		
		if (i==0) {
			System.out.print("0입니다.");
		}else if (i%2==1) {
			System.out.print("홀수입니다.");
		}else if (i % 2 == 0) {
			System.out.print("짝수입니다.");
		}
			
		sc.close();
		
	}

}
