
/*
 * ���������� ����ȯ
 * 
 *   - ����� �� �ִ� ����� ������ �����ϴ� ��.
 *   - ���� �ڼ� ������ ���������� ���� ����ȯ ����.
 */


class Car {
	
	String color;
	int door;
	void drive() {
		System.out.println("����̺�");
	}
	void stop() {
		System.out.println("��ž");
	}
	
	public static void main(String[] args) {
		Car c1 = new Car();
		FireEngine c2 = new FireEngine();
		Car c3 = new FireEngine();
		Ambulance c4 = new Ambulance();
		Car c5 = new Ambulance();
		
		c1 = (Car)c2; // �ڼ�Ÿ�� -> ����Ÿ�� ����ȯ ���� �Ұ�.
		
		c2 = (FireEngine)c1; // ����Ÿ�� -> �ڼ�Ÿ�� ����ȯ.
		
		Car c = new Car();
		FireEngine fe = (FireEngine)c; //����ȯ����. java.lang.ClassCastException
		fe.water(); //�����Ͽ�����.
		
	}
	
	
}

class FireEngine extends Car{
	void water() {
		System.out.println("�� �d");
		
	}
	
}

class Ambulance extends Car{
	void siren() {
		System.out.println("���̷�");
	}
}
