

class Product{
	int price;
	int bonuspoint;
	
	public Product(int price) {
		this.price = price;
		bonuspoint = (int)(price/10.0);
	}
}


class Tv1 extends Product {

	Tv1(){
		//����Ŭ������ ������ ȣ��
		super(100); // ���� 100���� ��.
	}
	//ObjectŬ������ toString()�޼ҵ带 �������̵�.
	@Override
	public String toString() {
		return "Tv";
	}
	
}
class Computer extends Product{
	Computer(){
		super(200);
	}
	
	@Override
	public String toString() {
		return "Computer";
	}
	
}
class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("�ܾ׺���");
			return;
		}
		
		money -=p.price;
		bonusPoint += p.bonuspoint;
		System.out.println(p+"�� �����ϼ̽��ϴ�.");
	}
}

public class Ex7_8 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Tv1());
		b.buy(new Computer());
		
		System.out.println("���� �ܾ��� "+b.money+"�����Դϴ�.");
		System.out.println("���� ���ʽ������� "+b.bonusPoint+"���Դϴ�.");
	}
}

