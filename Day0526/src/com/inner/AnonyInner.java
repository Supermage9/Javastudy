package com.inner;

/*	 Anonymous(�͸�) dlsjzmffotm
 * 
 * 		- �͸��̶�?
 * 		   �̸��� ���� ���� �ǹ�
 *         �ڹ��� ���α׷����� �ؼ��� ��� Ŭ������ �̸��� ����.
 *         
 *         Event�� ������ ����
 *         interface ������ �ʿ����
 *         �Ϲ� �޼ҵ� ���ο��� ���Ǻθ� ���� �� ����.
 *         abstract �� ��ӹ��� �� ����.
 *         �������̽��� ��ӹ޾� �����Ҷ��� �ϳ��� ������.
 *         
 * 
 */


abstract class AbsExam { //�߻�Ŭ����. �������̵�(������) �ʿ�
	int data = 10000;
	public abstract void printData(); // �߻�Ŭ�����̱� ������ �߻�޼ҵ� ����.
	
}


public class AnonyInner {
	
	AbsExam ae = new AbsExam() {

		@Override
		public void printData() { // �߻�Ŭ���� ���� �޼ҵ� ������
			System.out.println(data);
		}
		
	};
	
	public static void main(String[] args) {
		
		AnonyInner ai = new AnonyInner();
		
		ai.ae.printData();

	}

}
