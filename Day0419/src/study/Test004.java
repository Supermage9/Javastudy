package study;


import java.io.*;

public class Test004 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int i;
//		String s;
		
		System.out.print("���� �Է� :");
		i = Integer.parseInt(br.readLine());
		
		if(i!=0) {
			if(i>0)
			System.out.println("���");
			else {
				System.out.println("����");
			}
		}else {
			System.out.println("0");
		}
//		
//		s = (i >= 0) ? ((i == 0) ? "0�Դϴ�" : "����Դϴ�.") : "�����Դϴ�";
//		System.out.println(s);
		
		
		br.close();
		
	}

}
