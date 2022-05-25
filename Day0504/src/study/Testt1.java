package study;

import java.util.Random;
import java.util.Scanner;

public class Testt1 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int low,high,card;
		
		while(true) {
			int i=0;//사용자의 시행 횟수
			low=0;// 최소 범위
			high=99;// 최대 범위
			
			//0과 99 사이의 정수(난수)값을 생성(숨김값)
			card = r.nextInt(100);
			System.out.println("숨겨진 카드 값을 맞춰 보세요");
			while(true) {
				System.out.println("입력하실 수 있는 값의 범위"+low+"~~"+high+"입니다.");
				int n=0;
				n=sc.nextInt();//값을 입력받음
				//입력한 값이 범위를 벗어난 경우와 정상적인 경우 판정
				if(n>high||n<low) {
					System.out.println("범위를 초과하였습니다.");
				}else {
					if(n==card) {
						System.out.println("정답입니다.");
						break;
					}else if(n>card) {//입력된 값이 숨겨진 카드값보다 큰 경우
						System.out.println("더 낮은 값을 입력하시오.");
						high = n;
					}else {//입력된 값이 숨겨진 카드값보다 작은 경우
						System.out.println("더 큰 값을 입력하시오.");
						low = n;
					}
				}
				i++;
				
			}//안쪽 end while
		    System.out.println("계속 게임을 진행하시겠습니까?(y/n)");
		    if(sc.next().equals("n"))
		    	break;
			
			
			
			
		}
		
		
		
		
		
		
	}

}
