package study;

public class ArrEx01 {

	public static void main(String[] args) {
		
		int[]score = new int[5];
		int j=1;
		
		
		score[0]=10;
		score[j]=10;
		score[j+1]=10;
		score[j+2]=10;
		score[j+3]=10;
		//int���� 4����Ʈ�̹Ƿ� 5�� ���� ������ 20����Ʈ
		System.out.println(score);
		
		int sum = score[0]+score[1]+score[2]+score[3]+score[4];
		sum=0;
		for(int i =0;i<5;i++) {
			sum=sum+score[i];
			
		}
		
		for(int i=0;i<score.length;i++) {
			System.out.printf("scroe[%d]:%2d\n",i,score[i]);
		}
		
		
	}

}
