package q;

//private ���������ڴ� ���� Ŭ���� �������� ���� ����
//protected ���������ڴ� ���� ��Ű�� ������ ���ٰ���, �ٸ���Ű�� ���ٺҰ�
//default ���������ڴ� �ƹ��͵� �Ⱦ���, �����Ѱ�.




class FinalClass{
	protected final int finalMethod() {
		return 0;
	}
}

class Subclass extends FinalClass{
//	protected int finalMethod() {return 0;}
}


public class B {
	 
	public int n;
	public void g() { 
		n = 5;
	}
}
