package study;


/* [char]자료형 배열에 알파벳 대문자를 채우고,
 * 채워진 배열에 전체 요소를 출력
 * 
 * 단, char  자료형의 배열에 초기화는 반복문을 이용함
 * 
 *  
 *  
 */
public class ArrEx03 {

	public static void main(String[] args) {
//		char aa[]= new char[26];
		//알파벳 대문자 구성
		/*첫번째 방법
		char aa[]= new char[26];
		aa[0]='A';
		aa[1]='B';
		
		aa[25]='Z';
		*/
		
		//두번째 방법
		//char aa[]= {'A','B','C','D','E','F','G','H','I','J',,,};
		
		//세번째 방법
		char aa[]= new char[26];
		for(int i=0,b=97;i<aa.length;i++,b++) {
			aa[i]=(char)b;
			System.out.printf("%c",aa[i]);
		}
		
		System.out.println();
		//네번째 방법
		char[]alpha = new char[26];
		for(int i=0;i<alpha.length;i++) {
			alpha[i]=(char)('A'+i);
			System.out.print(alpha[i]);
		}
		
		
	}

}
