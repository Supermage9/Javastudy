package study;


import java.io.*;

public class Test005 {

	public static void main(String[] args) throws IOException{
		
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int year;
		String s;
		
		System.out.print("�⵵ �Է� :");
		year = Integer.parseInt(br.readLine());
//		
//		if (year%4==0 && year %400 != 0 || year % 400 == 0) {
//			System.out.println(year+"���� �����Դϴ�.");
//
//		}else {
//			System.out.println(year+"���� ����Դϴ�.");
//		}
//		
		
		s = year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? "����" : "���";
		System.out.println(year + "���� "+s+"�Դϴ�.");
	
		
		
	}

}
