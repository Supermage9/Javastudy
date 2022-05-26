package reference;

class MyMath2{
	long a,b;
	
	long add() {return a+b;}  //인스턴스변수 a,b 만을 이용해서 작업하므로 매개변수가 필요없다.
	long sub() {return a-b;}
	long mul() {return a*b;}
	double div() {return a/b;}
	
	static long add(long a, long b) {return a+b;}
	static long sub(long a, long b) {return a-b;}
	static long mul(long a, long b) {return a*b;}
	static double div(double a, double b) {return a/b;}
	
}

public class MyMathTest2 {

	public static void main(String[] args) {
		
		System.out.println(MyMath2.add(200L, 100L));
		System.out.println(MyMath2.sub(200L, 100L));
		System.out.println(MyMath2.mul(200L, 100L));
		System.out.println(MyMath2.div(200.0, 100.0));
		
		MyMath2 mm = new MyMath2();
		mm.a = 200L;
		mm.b = 100L;
		
		System.out.println(mm.add());
		System.out.println(mm.sub());
		System.out.println(mm.mul());
		System.out.println(mm.div());
		

	}

}
