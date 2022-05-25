package study;


/*
 * 증감 연산자(++/--) : 하나식 증가시키거나 감소시키는 연산자
 * 
 */
public class OperEx01 {

	public static void main(String[] args) {
		
		int x = 10;
		int y = x++;
		System.out.println("x:"+x+",y:"+y);
		
		
		int i = 5;
		i++; //i = i+1 동일한 의미이다. sum = sum+1 (후위형)
		System.out.println(i);
		
		i = 5;
		System.out.println(i);
		
		++i;//전위형
		System.out.println(i);
		
		
		
		

	}

}
