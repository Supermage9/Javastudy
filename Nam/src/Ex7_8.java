

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
		//조상클래스의 생성자 호출
		super(100); // 가격 100으로 함.
	}
	//Object클래스의 toString()메소드를 오버라이딩.
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
			System.out.println("잔액부족");
			return;
		}
		
		money -=p.price;
		bonusPoint += p.bonuspoint;
		System.out.println(p+"를 구입하셨습니다.");
	}
}

public class Ex7_8 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Tv1());
		b.buy(new Computer());
		
		System.out.println("남은 잔액은 "+b.money+"만원입니다.");
		System.out.println("현재 보너스점수는 "+b.bonusPoint+"점입니다.");
	}
}

