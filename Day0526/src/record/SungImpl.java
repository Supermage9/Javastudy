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
	public void set() { // �ο��� �Է¹޴� ���
		do {
			System.out.print("�ο� �� �Է� :");
			this.inwon = sc.nextInt();
				
		}while(inwon<1||inwon>10);
		re = new Record01[inwon];
	}

	
	
	
	
	@Override
	public void input() { //�й�, �̸�, ���� ���� �Է±��, ����
		
		Scanner sc = new Scanner(System.in);
		String[] title = {"��������","��������","��������"};
		
		
		for(int i = 0;i<re.length;i++) {
			re[i] = new Record01();
			
			System.out.printf("%d��° �л��� �й�, �̸� �Է�(���鱸��) :",(i+1));
			re[i].number = sc.nextInt();
			re[i].name = sc.next();
			
			System.out.printf("���� ���� ���� �����Է�(���鱸��) :");
			re[i].sco[0] = sc.nextInt();
			re[i].sco[1] = sc.nextInt();
			re[i].sco[2] = sc.nextInt();
			
			//�� ���� ���� : �� 90���̻�, �� 80���̻�, �� 70���̻�, �� 60���̻�, �� 60���̸�
			for(int j=0;j<re[i].sco.length;j++) {
				if (re[i].sco[j]>=90) {
					re[i].scor[j] ="��";
				}else if(re[i].sco[j]>=80) {
					re[i].scor[j] ="��";
				}else if(re[i].sco[j]>=70) {
					re[i].scor[j] ="��";
				}else if(re[i].sco[j]>=60) {
					re[i].scor[j] ="��";
				}else {
					re[i].scor[j] ="��";
				}
			
			}//end for
			
			re[i].sum = re[i].sco[0]+re[i].sco[1]+re[i].sco[2]; // ����
			
			re[i].avg = re[i].sum/3; // ���
			
		}
		
	}

	
	
	
	@Override
	public void print() { // ��� ���
		
		for(int i = 0;i<re.length;i++) {
			System.out.printf("%d %5s %3d %3d %3d %3d %3d %s %s %s%n",
					re[i].number,re[i].name,re[i].sco[0],re[i].sco[1],re[i].sco[2],re[i].sum,re[i].avg,re[i].scor[0],re[i].scor[1],re[i].scor[2]);
		}
		
	}

}
