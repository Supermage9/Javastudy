package study;

/*
 * 0에서 99까지 임의의 수를 가진 카드를 한장 숨기고
 * 이 카드 수를 맞추는 게임
 * 
 * 카드 속의 수가 77이라면 수를 맞추는 사람이 55를 입력하면
 * 더 높게 다시 70을 입력하면 더 높게 라는 식으로 범위를 좁혀가면서
 * 카드를 맞추는 게임
 * 게임을 반복하기 위해 y/n을 묻고, n인 경우는 종료
 * 
 * 컴퓨터가 숨길 수를 임의로 선택하기 위해 Random 클래스를 사용함
 * Random 클래스 사용법은 1. import java.util.*;
 *                   2. Random r = new Random();(main()메소드 안에 작성)
 *                      int i = r.nextInt(100)의 의미는
 *                      0~99까지의 임의의 정수를 생성함
 *                      
 *  String str = sc.next();
 *   if(str.equals("n")){
 *     System.exit(0); 
 *      break;
 *   }    
 *   
 *  while문 이용
 */

import java.util.*;
public class Test01 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		Random r = new Random();
		int i = r.nextInt(100);
		int ans = 0;
		String yn=" ";
		
		
			while(true) {
				System.out.print("수를 입력하세요 :");
				ans = sc.nextInt();
				
				if(ans<i) {
					System.out.print("더 높게 ");
				}else if(ans>i) {
					System.out.print("더 낮게 ");
				}else if(ans==i) {
					System.out.print("정답입니다!\n");
					System.out.print("다시 시작?(y/n):");
					yn = sc.next();
					if(yn.equals("y")||yn.equals("Y")) {
						i = r.nextInt(100);
						continue;
					}else {
						break;
					}
				}
			}


	}

}
