package constructor;

class Data1 {
//	public Data1() {} // �⺻������. �����Ϸ��� �ڵ����������� ���ִ°� ����.	
	int value;
}
class Data2 {
	int value;
	//�Ű������� �ִ� ������.
	public Data2(int x) { // �����ڴ� �޼ҵ��̰� �⺻������ Ŭ������ �̸��� ����.
		value = x;
	}
}

public class ConstructorTest {

	public static void main(String[] args) {
		
		Data1 d1 = new Data1();
		Data2 d2 = new Data2(2);
		

	}

}
// �⺻�����ڰ� �����Ϸ��� ���� �߰��Ǵ� ���� Ŭ������ ���ǵ� �����ڰ� �ϳ��� ���� �� ���̴�.(�Ű������� �ִ� �����ڰ� �����ϸ� �⺻������ �ȸ������)