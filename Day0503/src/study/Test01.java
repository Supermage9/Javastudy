package study;

/*
 * 0���� 99���� ������ ���� ���� ī�带 ���� �����
 * �� ī�� ���� ���ߴ� ����
 * 
 * ī�� ���� ���� 77�̶�� ���� ���ߴ� ����� 55�� �Է��ϸ�
 * �� ���� �ٽ� 70�� �Է��ϸ� �� ���� ��� ������ ������ �������鼭
 * ī�带 ���ߴ� ����
 * ������ �ݺ��ϱ� ���� y/n�� ����, n�� ���� ����
 * 
 * ��ǻ�Ͱ� ���� ���� ���Ƿ� �����ϱ� ���� Random Ŭ������ �����
 * Random Ŭ���� ������ 1. import java.util.*;
 *                   2. Random r = new Random();(main()�޼ҵ� �ȿ� �ۼ�)
 *                      int i = r.nextInt(100)�� �ǹ̴�
 *                      0~99������ ������ ������ ������
 *                      
 *  String str = sc.next();
 *   if(str.equals("n")){
 *     System.exit(0); 
 *      break;
 *   }    
 *   
 *  while�� �̿�
 */

import java.util.*;
public class Test01 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		Random r = new Random();
		int i = r.nextInt(100);
		int ans = 0;
		String yn=" ";
		
		
			while(true) {
				System.out.print("���� �Է��ϼ��� :");
				ans = sc.nextInt();
				
				if(ans<i) {
					System.out.print("�� ���� ");
				}else if(ans>i) {
					System.out.print("�� ���� ");
				}else if(ans==i) {
					System.out.print("�����Դϴ�!\n");
					System.out.print("�ٽ� ����?(y/n):");
					yn = sc.next();
					if(yn.equals("y")||yn.equals("Y")) {
						i = r.nextInt(100);
						continue;
					}else {
						break;
					}
				}
			}


	}

}
