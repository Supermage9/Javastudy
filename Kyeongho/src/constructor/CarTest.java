package constructor;

class Car{
	String color ;
	String gearType;
	int door;
	
	Car() {} // 기본생성자.
	Car(String c,String g,int d){ // 매개변수가 있는 생성자. 매개변수들은 메소드 안의 LV들에게 값을 전달.
		color = c;
		gearType = g;
		door = d;
	}
}


class CarTest {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		
		Car c2 = new Car("white","auto",4);
		
		System.out.println("c1의 color = "+c1.color+" gearType = "+c1.gearType+" door = "+c1.door);
		System.out.println("c2의 color = "+c2.color+" gearType = "+c2.gearType+" door = "+c2.door);

	}

}
