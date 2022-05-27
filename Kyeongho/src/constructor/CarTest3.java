package constructor;

class Car4{
	String color;
	String geartype;
	int door;
	
	Car4() {
		this("white","auto",4);
	}
	Car4(String color){
		this(color,"auto",4);
	}
	Car4(String color,String geartype,int door){
		this.color = color;
		this.geartype = geartype;
		this.door = door;
	}
	
	
	
}


public class CarTest3 {

	public static void main(String[] args) {
		
		Car4 c1 = new Car4();
		Car4 c2 = new Car4("blue");
		System.out.println("c1 color = "+c1.color+", geartype = "+c1.geartype+"door = "+c1.door);
		System.out.println("c2 color = "+c2.color+", geartype = "+c2.geartype+"door = "+c2.door);
		
		
		
	}

}
