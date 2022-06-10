
/*
 * 참조변수의 형변환
 * 
 *   - 사용할 수 있는 멤버의 개수를 조절하는 것.
 *   - 조상 자손 관계의 참조변수는 서로 형변환 가능.
 */


class Car {
	
	String color;
	int door;
	void drive() {
		System.out.println("드라이브");
	}
	void stop() {
		System.out.println("스탑");
	}
	
	public static void main(String[] args) {
		Car c1 = new Car();
		FireEngine c2 = new FireEngine();
		Car c3 = new FireEngine();
		Ambulance c4 = new Ambulance();
		Car c5 = new Ambulance();
		
		c1 = (Car)c2; // 자손타입 -> 조상타입 형변환 생략 불가.
		
		c2 = (FireEngine)c1; // 조상타입 -> 자손타입 형변환.
		
		Car c = new Car();
		FireEngine fe = (FireEngine)c; //형변환에러. java.lang.ClassCastException
		fe.water(); //컴파일오케이.
		
	}
	
	
}

class FireEngine extends Car{
	void water() {
		System.out.println("물 촥");
		
	}
	
}

class Ambulance extends Car{
	void siren() {
		System.out.println("사이렌");
	}
}
