package study;

/*	����ڰ� �Է��ϴ� ������ ����ؼ� ���� ����
 * ���� 0�� �ԷµǸ� ���ݱ��� �Էµ� ������ ���� ����� ����ϰ� ������
 * 
 */



import java.io.*;

public class WhileExam02 {

	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader
				(new InputStreamReader(System.in));
	
		int i=1,sum=0;
		
		
		while(i!=0) {
			
			
			System.out.print("���� �Է� :");
			i = Integer.parseInt(br.readLine());
			sum+=i;
//			if(i==0)
//				break;
			
		}
		System.out.print("���ݱ����� �հ� :"+sum);
		
		

	}

}
