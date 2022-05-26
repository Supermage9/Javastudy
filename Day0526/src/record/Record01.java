package record;
/*	
 * 인원수 입력
 * 1번째 학생의 학번 이름 입력 
 * 국어 영어 수학 점수입력(공백구분)
 * 
 * 학번 이름 국어 영어 수학 총점 평균 수우미양가
 * 
 * record 
 * 이름 name
 * String[]scor = new String[3]과목
 * int[]sco = new int[3]과목점수
 * int number, avg, sum
 * 
 * 인터페이스 Sung
 * set();
 * input();
 * print();
 * 
 * 인터페이스를 구현할 클래스 정의
 * Sunglmpl
 */
public class Record01 {
	
	
	String name;
	String[] scor = new String[3]; //수, 우, 미, 양, 가
	int[]sco = new int[3]; // sco[0~2] = 국영수
	int number=0, avg=0, sum=0;  //학번,평균,총점
	
}
