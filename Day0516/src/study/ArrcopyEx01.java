package study;

/*
 * �迭�� ����
 *   �迭�� �ѹ� ������ �� ũ�⸦ ������ �� ����.
 *   ũ�⸦ �� �ø��� ���� ��� ���� �ڷ��� �迭�� ���ϴ� ũ��� ������
 *   ������ �迭�� ����
 *   
 *   System.arraycopy()�� �̿��� ����
 *   public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length){
 *   
 *   }
 *   
 *   src : �ҽ� �迭(���� �迭)
 *   srcPos : �ҽ� �迭�� ���� ���� ��ġ(������)
 *   dest : ���� �迭(����Ƽ���̼�)
 *   destPos : ���� ���� ��ġ
 *   length : ����Ǵ� �迭�� ����� ��(�ε���)
 */

public class ArrcopyEx01 {

	public static void main(String[] args) {
		
		String[]src= {"Java","Database","JSP","Spring"};
		String[]dest= new String[6];
		dest[0]="OS";
		dest[1]="Network";
		
		System.arraycopy(src, 0, dest, 2, 4);
		
		for(String str : dest) // �迭 ��½� ���. str�� dest�� ������ ���� �Է�
		System.out.println("dest value:"+str);
		
		
	}

}
