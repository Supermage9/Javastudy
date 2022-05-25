package study;


import java.io.*;

public class Test004 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int i;
//		String s;
		
		System.out.print("정수 입력 :");
		i = Integer.parseInt(br.readLine());
		
		if(i!=0) {
			if(i>0)
			System.out.println("양수");
			else {
				System.out.println("음수");
			}
		}else {
			System.out.println("0");
		}
//		
//		s = (i >= 0) ? ((i == 0) ? "0입니다" : "양수입니다.") : "음수입니다";
//		System.out.println(s);
		
		
		br.close();
		
	}

}
