package com.inner;

/*	 LocalInner Class
 *    
 *    -Ŭ���� ���ο� Ư�� �޼ҵ� �ȿ� ���ǵǴ� Ŭ������
 *    -���������� ���� ���̴�.
 *     �޼ҵ尡 ȣ��� �� ������ �� ������ �޼ҵ��� ������� �������� ������
 *     ���������� ���� �ڵ����� �Ҹ��
 *     
 *     * �� ��������� �ʴ´�.
 *       - �޼ҵ� ���ο� Ŭ������ ���� �޼ҵ� ���� �ÿ��� �����
 *     
 *       
 *     ex)  
 *     class Outer{ //�ܺ�Ŭ����
 *     		
 *     		public void aa(){ // Ŭ������ ��� �޼ҵ�
 *     			class Inner{ // ����Ŭ����. �޼ҵ� �ȿ� ���������� ���� ���� ��ġ
 *     
 *     			}
 *			}     
 * 
 *     }
 * 
 */
public class LocalInner {
	
	int a = 100; // IV, �ܺ�Ŭ������ �������, ��������
	
	public void innerExam01(int k) { //����޼ҵ�. �ν��Ͻ��޼ҵ�
		int b = 200; // ��������, �޼ҵ峻������ ���
		final int c = k; // ���
		
		class Inner{ // ���� �̳� Ŭ����. ����Ŭ����
			//���� �̳� Ŭ������ �ܺ� Ŭ������ ��� ������ ���� ��ġ�� ������
			//��� ������ ����鸸 ������ �����ϴ�.
			public void getData(){
				
				System.out.println("int a:"+a);
				System.out.println("int b:"+b);
				System.out.println("final int c:"+c);
				
			} //end getData �޼ҵ�
			
		}// end Innerclass ����Ŭ����
		
		//�޼ҵ� ������ ���� �̳� Ŭ������ ��ü ������ ������.
		Inner i = new Inner();
		
		// ������ ��ü�� ���ؼ� �޼ҵ带 ȣ���Ѵ�.
		i.getData();
		
	} // end innerExam01 ����޼ҵ�
	
	public static void main(String[] args) {
		
		LocalInner li = new LocalInner();
		
		li.innerExam01(1000);
		
	}
	
	
	
	
	
	

}
