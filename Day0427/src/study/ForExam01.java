package study;

public class ForExam01 {

	public static void main(String[] args) {
		
		//1���� 10���� �ݺ� ó���ϴ� ����
		int i=1;
		
		int even=0, odd = 0;
		// �ݺ� ó���ϸ鼭 �����հ踦 �����ϴ� ����
		int sum = 0;//�����հ�� �ʱ�ȭ�� ���ִ� ���� ��Ģ
//		/*
//		for (i=1;i<=10;i++) {
//		sum = sum + i;
//		System.out.println(i+","+sum);
//		}
//		*/
//
////		while (i <= 10) {//while���� �ʱⰪ�� �ۿ��� ��������
////					
////		sum = sum + i;
////		System.out.println(i+","+sum);
////		i++;
////		}
//				
//		do{
//		sum = sum + i;
//		System.out.println(i+","+sum);
//		i++;
//		}
//		while (i<=10);{
//		}
//				
		for(i=1;i<=10;i++) {
			if(i%2==0) {
				even= even+i;
				
			}else {
				odd= odd+i;
			}
		sum = sum + i;
		}
		
		
		System.out.print("¦���� �հ� :"+even+"\nȦ���� �հ� :"+odd+"\n��ü �հ� :"+sum);
		
		
	 }


}
