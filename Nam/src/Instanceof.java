/*
 *  �ν��Ͻ����� 
 *  
 *  ���������� ����ȯ ���ɿ��� Ȯ�ο� ���. �����ϸ� true��ȯ.
 *  ����ȯ�ϱ� ���� �ݵ�� �ν��Ͻ������ Ȯ���ϰ� ��ȯ�ؾ���.
 *  
 *  
 */

public class Instanceof {

	public static void main(String[] args) {
		
		Instanceof fe = new Inst1();
		
		System.out.println(fe instanceof Object);
		System.out.println(fe instanceof Inst1);
		System.out.println(fe instanceof Instanceof);
		
	
	}

}

class Inst1 extends Instanceof{
	
}
