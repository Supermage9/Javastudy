package test;




import java.io.*;


public class Test001 {

	public static void main(String[] args)throws IOException {
		
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		
		int i;
		System.out.println("���� �Է� :");
		i = Integer.parseInt(br.readLine());
		
		if (i == 0) {
			System.out.print("0�Դϴ�.");
		}else if (i > 0) {
			System.out.print("����Դϴ�.");
		}else if (i < 0) {
			System.out.print("�����Դϴ�.");
		}else {
			System.out.print("�Է� ����");
		}
		
		
		
		
		
		
	}

}
