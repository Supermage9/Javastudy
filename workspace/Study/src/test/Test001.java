package test;




import java.io.*;


public class Test001 {

	public static void main(String[] args)throws IOException {
		
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		
		int i;
		System.out.println("정수 입력 :");
		i = Integer.parseInt(br.readLine());
		
		if (i == 0) {
			System.out.print("0입니다.");
		}else if (i > 0) {
			System.out.print("양수입니다.");
		}else if (i < 0) {
			System.out.print("음수입니다.");
		}else {
			System.out.print("입력 오류");
		}
		
		
		
		
		
		
	}

}
