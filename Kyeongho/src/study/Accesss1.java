package study;

/*	���� ������
 * 
 *     public �������� ����.
 *     
 *     protected ������Ű�� ������, �ٸ���Ű���� �ڼ�Ŭ�������� ���� ����
 *     
 *     (default) ���� ��Ű�� �������� ���� ����, �ƹ��͵� �Ⱥ��̸� ����Ʈ
 *     
 *     private ���� Ŭ���� �������� ���� ����.
 * 		
 * 
 * 		���������ڴ� �������� ����. �������ٰ� �ʿ��� �� ������ ��
 */


class Myparent{
	private 	int prv; // ���� Ŭ����
				int dft; // ���� ��Ű��
	protected 	int prt; // ���� ��Ű�� + �ڼ�(�ٸ� ��Ű��)
	public 		int pub; // ���� ���Ѿ���.
	
	public void printMembers() {
		System.out.println(prv); // OK
		System.out.println(dft); // OK
		System.out.println(prt); // OK
		System.out.println(pub); // OK
	}
}




public class Accesss1 {

	public static void main(String[] args) {
		
		Myparent p = new Myparent();
//		System.out.println(p.prv); // ����.
		System.out.println(p.dft); // OK
		System.out.println(p.prt); // OK
		System.out.println(p.pub); // OK
		
	}

}
