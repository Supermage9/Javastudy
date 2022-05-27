package constructor;

class Car3 {
	String color;
	String gear;
	int door;
	
	public Car3() {
		// TODO Auto-generated constructor stub
	}
	Car3(String a,String b,int c){
		color = a;
		gear = b;
		door = c;
	}
	
}


public class CarTest2 {

	public static void main(String[] args) {
		
		Car3 c3 = new Car3();
		c3.color = "white";
		c3.gear = "¼öµ¿";
		c3.door = 2;
		
		
		Car3 c4 = new Car3("black","auto",2);
		
		System.out.println(c3.color+","+c3.gear+""+c3.door);
		System.out.println(c4.color+","+c4.gear+""+c4.door);
	}

}
