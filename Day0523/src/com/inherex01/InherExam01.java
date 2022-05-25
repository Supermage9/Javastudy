package com.inherex01;

/*	��ӽ� ���ǻ���
 * 
 *   - ���� Ŭ�������� ����� ��������� ���� Ŭ�������� ������ ��� ������ ������
 *     ���� Ŭ������ ��� ������ ���õ�.
 *     �� ��, ���� Ŭ������ ��������� ����ϱ� ���ؼ��� super��� Ű���带 �����
 *     
 *   - ������ �̸��� ��������� ������ �̸��� �޼ҵ尡 �� Ŭ���� �ȿ� ���ǵǴ� ���� �����߻�. 
 * 
 */

//�θ� Ŭ����
class SuperTest{
	
	protected double area;
	private String title;
	
	public SuperTest() {
		
		System.out.println("SuperTest()...���ڰ� ���� ������...");
		
	}
	
	public SuperTest(String title) {
		
		this.title = title;
	}
	
	public void write() {
		System.out.println(title+""+area);
	}
	
	
	
}

//�ڽ� Ŭ����
class Rect extends SuperTest{
	
	
	private int w,h;
	
	public Rect() {
		super();
	}
	
	
	//����޼ҵ�
	public void calc(int w, int h) {
		this.w = w;
		this.h = h;
		area = (double)this.w * this.h;
		
		write();
	}
	
	
	@Override
	public void write() {
		
		System.out.println("w :"+w+",h :"+h);
		System.out.println("�簢���� ���̴� "+area);
		
		
	}
	
	/*	 �޼ҵ� �������̵�
	 * 
	 * 	 ���� Ŭ������ ��ӹ��� ���� Ŭ��������
	 *   ���� Ŭ������ ���ǵ� �޼ҵ带 �������ϴ� ���� �ǹ���.
	 *   ��ü���� ���α׷��� Ư¡�� �������� ��Ÿ��.
	 * 	 
	 *   ������ 
	 *     �ݵ�� ��Ӱ��迡 �־�� �ϸ�
	 *     �޼ҵ� �̸�, ����Ÿ��, �Ű������� ������ Ÿ���� ������ ��ġ�ؾ���.
	 */
	
	
}

class Circle extends SuperTest{
	
	public Circle(String title) {
		super(title);
	}
	
	public void calc(int r) {
		area = r*r*3.141592;
		write();
	}
	
}







public class InherExam01 {

	
	public static void main(String[] args) {
		Rect r = new Rect();
		Circle c = new Circle("���� ���� :");
		
		
		

	}

}


class A_class{
	
	public A_class(int n) {
		// TODO Auto-generated constructor stub
	}
}


class B_class extends A_class{
	public B_class() {
		super(10);
		
	}
}

/*
 * ============================================================================
 *  ���� Ŭ���� 			��	���� Ŭ����				��			���
 * ============================================================================
 *  �����ڸ� �������� ����	��	������ ���� ����			��			����
 *  					��	���ڰ� ���� ������			��			����
 *  					��	�μ��� �ִ� ������			��			����
 * ============================================================================
 *  �μ��� ���� ������ ����	��	������ ���� ����			��			����
 *  					��	�μ��� ���� ������			��			����
 *  					��	�μ��� �ִ� ������			��			����
 * ============================================================================
 *  �μ��� �ִ� ������ ����	�� 	������ ���� ����			��		   �����߻�
 *  					��	�μ��� ���� ������			��  ���� Ŭ������ �ش� �����ڸ� 
 *  					��							��	ȣ������ ������ ���� �߻�
 *						��							�� -----------------------
 * 						��	�μ��� �ִ� ������			��	����Ŭ������ �ش� �����ڸ�
 * 						��							��	ȣ������ ������ �����߻�
 *  					
 */



















