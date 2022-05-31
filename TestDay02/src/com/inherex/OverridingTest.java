package com.inherex;


class OverridingParent{
	
	void parentMethod() {
		System.out.println("parentMethod");
	}
	
}

class OverridingChild extends OverridingParent{
	
	@Override
	void parentMethod() {
		
		System.out.println("childMethod");
	}
	
}

/*	�������̵��� ������ �� �ִ� ��Ģ
 *   
 *   1. �θ�Ŭ������ �ڽ�Ŭ���� ���̿����� ����
 *   2. static �޼ҵ�� Ŭ������ ���ϴ� �޼ҵ��̱� ������ ��ӺҰ�. ���� �������̵��� �ȵ�.
 *   3. ���������ڰ� private�� ���ǵ� �޼ҵ�� ��� ��ü�� �ȵ�. ���� �������̵��� �ȵ�.
 *   4. interface�� �����ؼ� �޼ҵ带 �������̵� �Ҷ��� �ݵ�� ���������ڸ� public���� �����ؾ���.
 *   5. �޼ҵ��� ������ ����(�Ű�����)�� Ÿ��(�ڷ���)�� ���� ��ġ�ؾ� �ϰ� ����Ÿ�Ա��� ��ġ�ؾ���.
 *   6. �θ�Ŭ������ �޼ҵ��� ���������ں��� �� ������ �� ����.
 *   7. �θ�Ŭ������ �޼ҵ庸�� �� ���� ���ܸ� ���� �� ����.
 *   8. final ���� ������ �޼ҵ�� �������̵� �� �� ����.
 */


public class OverridingTest {

	public static void main(String[] args) {
		
		OverridingChild oc =new OverridingChild();
		oc.parentMethod();


	}

}
