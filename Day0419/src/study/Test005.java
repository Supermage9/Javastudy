package study;


import java.io.*;

public class Test005 {

	public static void main(String[] args) throws IOException{
		
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int year;
		String s;
		
		System.out.print("년도 입력 :");
		year = Integer.parseInt(br.readLine());
//		
//		if (year%4==0 && year %400 != 0 || year % 400 == 0) {
//			System.out.println(year+"년은 윤년입니다.");
//
//		}else {
//			System.out.println(year+"년은 평년입니다.");
//		}
//		
		
		s = year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? "윤년" : "평년";
		System.out.println(year + "년은 "+s+"입니다.");
	
		
		
	}

}
