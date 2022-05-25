package study;

/*
 * 배열의 복사
 *   배열은 한번 생성된 후 크기를 변경할 수 없음.
 *   크기를 더 늘리고 싶을 경우 같은 자료형 배열을 원하는 크기로 생성후
 *   기존의 배열을 복사
 *   
 *   System.arraycopy()를 이용한 복사
 *   public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length){
 *   
 *   }
 *   
 *   src : 소스 배열(원본 배열)
 *   srcPos : 소스 배열의 복사 시작 위치(포지션)
 *   dest : 복사 배열(데스티네이션)
 *   destPos : 복사 시작 위치
 *   length : 복사되는 배열의 요소의 수(인덱스)
 */

public class ArrcopyEx01 {

	public static void main(String[] args) {
		
		String[]src= {"Java","Database","JSP","Spring"};
		String[]dest= new String[6];
		dest[0]="OS";
		dest[1]="Network";
		
		System.arraycopy(src, 0, dest, 2, 4);
		
		for(String str : dest) // 배열 출력시 사용. str에 dest의 값들을 전부 입력
		System.out.println("dest value:"+str);
		
		
	}

}
