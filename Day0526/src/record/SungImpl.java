package record;

import java.util.*;
public class SungImpl extends Record01 implements Sung {
	Scanner sc = new Scanner(System.in);
	int inwon;
	Record01 re[];
	public static void main(String[] args) {
		SungImpl sl = new SungImpl();
		sl.set();
		sl.input();
		sl.print();
	}

	
	
	
	@Override
	public void set() { // 인원수 입력받는 기능
		do {
			System.out.print("인원 수 입력 :");
			this.inwon = sc.nextInt();
				
		}while(inwon<1||inwon>10);
		re = new Record01[inwon];
	}

	
	
	
	
	@Override
	public void input() { //학번, 이름, 과목별 점수 입력기능, 판정
		
		Scanner sc = new Scanner(System.in);
		String[] title = {"국어점수","영어점수","수학점수"};
		
		
		for(int i = 0;i<re.length;i++) {
			re[i] = new Record01();
			
			System.out.printf("%d번째 학생의 학번, 이름 입력(공백구분) :",(i+1));
			re[i].number = sc.nextInt();
			re[i].name = sc.next();
			
			System.out.printf("국어 영어 수학 점수입력(공백구분) :");
			re[i].sco[0] = sc.nextInt();
			re[i].sco[1] = sc.nextInt();
			re[i].sco[2] = sc.nextInt();
			
			//각 과목별 판정 : 수 90점이상, 우 80점이상, 미 70점이상, 양 60점이상, 가 60점미만
			for(int j=0;j<re[i].sco.length;j++) {
				if (re[i].sco[j]>=90) {
					re[i].scor[j] ="수";
				}else if(re[i].sco[j]>=80) {
					re[i].scor[j] ="우";
				}else if(re[i].sco[j]>=70) {
					re[i].scor[j] ="미";
				}else if(re[i].sco[j]>=60) {
					re[i].scor[j] ="양";
				}else {
					re[i].scor[j] ="가";
				}
			
			}//end for
			
			re[i].sum = re[i].sco[0]+re[i].sco[1]+re[i].sco[2]; // 총점
			
			re[i].avg = re[i].sum/3; // 평균
			
		}
		
	}

	
	
	
	@Override
	public void print() { // 결과 출력
		
		for(int i = 0;i<re.length;i++) {
			System.out.printf("%d %5s %3d %3d %3d %3d %3d %s %s %s%n",
					re[i].number,re[i].name,re[i].sco[0],re[i].sco[1],re[i].sco[2],re[i].sum,re[i].avg,re[i].scor[0],re[i].scor[1],re[i].scor[2]);
		}
		
	}

}
