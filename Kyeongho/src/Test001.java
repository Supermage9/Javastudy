



import java.util.*;

public class Test001 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		
		int i ;
		
		System.out.print("���� �Է� :");
		i = sc.nextInt();
		
		if (i==0) {
			System.out.print("0�Դϴ�.");
		}else if (i%2==1) {
			System.out.print("Ȧ���Դϴ�.");
		}else if (i % 2 == 0) {
			System.out.print("¦���Դϴ�.");
		}
			
		sc.close();
		
	}

}
