package study;

/*	사용자가 입력하는 정수를 계속해서 더해 나감
 * 만약 0이 입력되면 지금까지 입력된 정수의 덧셈 결과를 출력하고 종료함
 * 
 */



import java.io.*;

public class WhileExam02 {

	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader
				(new InputStreamReader(System.in));
	
		int i=1,sum=0;
		
		
		while(i!=0) {
			
			
			System.out.print("정수 입력 :");
			i = Integer.parseInt(br.readLine());
			sum+=i;
//			if(i==0)
//				break;
			
		}
		System.out.print("지금까지의 합계 :"+sum);
		
		

	}

}
