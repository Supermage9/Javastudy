package study;

public class ArrEx02 {

	public static void main(String[] ar) {
		
		for(String s: ar)
			System.out.printf("%3s",s);
		System.out.println();
		String[] subject = {"국어점수","영어점수","수학점수"};
		
		for(String ss:subject)
			System.out.printf("%3s\n",ss);
		
		System.out.println();
		char ch[]= new char[4];
//		char[]ch= {'j','a','v','a'};
		ch[0]='j';
		ch[1]='a';
		ch[2]='v';
		ch[3]='a';
		
		for(int i=0;i<ch.length;i++) {
			System.out.println("ch["+i+"]:"+ch[i]);
		}
		
		
		
		

	}

}
