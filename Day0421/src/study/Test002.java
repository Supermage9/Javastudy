package study;



import java.io.*;


public class Test002 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int i ;
		
		System.out.print("���� �Է� : ");
		i = Integer.parseInt(br.readLine());
		
		if (i%2==0) {
			if (i%2==0 && i%3==0) {
				System.out.print("2�� 3�� ����Դϴ�.");
			}else {
				System.out.print("2�� ����Դϴ�.");
			}
		}else if (i%3==0) {
			System.out.print("3�� ����Դϴ�.");
		}else {
			System.out.print("2�� 3�� ����� �ƴմϴ�.");
		}
	
		
		
		
		
	}

}
