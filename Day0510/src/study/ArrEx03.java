package study;


/* [char]�ڷ��� �迭�� ���ĺ� �빮�ڸ� ä���,
 * ä���� �迭�� ��ü ��Ҹ� ���
 * 
 * ��, char  �ڷ����� �迭�� �ʱ�ȭ�� �ݺ����� �̿���
 * 
 *  
 *  
 */
public class ArrEx03 {

	public static void main(String[] args) {
//		char aa[]= new char[26];
		//���ĺ� �빮�� ����
		/*ù��° ���
		char aa[]= new char[26];
		aa[0]='A';
		aa[1]='B';
		
		aa[25]='Z';
		*/
		
		//�ι�° ���
		//char aa[]= {'A','B','C','D','E','F','G','H','I','J',,,};
		
		//����° ���
		char aa[]= new char[26];
		for(int i=0,b=97;i<aa.length;i++,b++) {
			aa[i]=(char)b;
			System.out.printf("%c",aa[i]);
		}
		
		System.out.println();
		//�׹�° ���
		char[]alpha = new char[26];
		for(int i=0;i<alpha.length;i++) {
			alpha[i]=(char)('A'+i);
			System.out.print(alpha[i]);
		}
		
		
	}

}
