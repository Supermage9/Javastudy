package study;



import java.io.*;


public class Test002 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int i ;
		
		System.out.print("정수 입력 : ");
		i = Integer.parseInt(br.readLine());
		
		if (i%2==0) {
			if (i%2==0 && i%3==0) {
				System.out.print("2와 3의 배수입니다.");
			}else {
				System.out.print("2의 배수입니다.");
			}
		}else if (i%3==0) {
			System.out.print("3의 배수입니다.");
		}else {
			System.out.print("2와 3의 배수가 아닙니다.");
		}
	
		
		
		
		
	}

}
