package com.methodex;

import java.io.*;

public class MethodEx04 {
	
	public static int plus(int x,int y) {
		return x+y;
	}
	public static int min(int x,int y) {
		return x-y;
	}
	public static int mul(int x,int y) {
		return x*y;
	}
	public static int div(int x,int y) {
		return x/y;
	}
	public static int per(int x,int y) {
		return x%y;
	}
	 //��� �޼ҵ�. a : ù��° ��, b: ������, c: �ι�° ��, d : �����
	public static void disp(int a, char b, int c, int d){
		
		System.out.println("\n"+a+""+b+""+c+"="+d);
		
	}
	

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//���� ����
		int su1=0,su2=0,tot=0;
		char yon=0;
		
		System.out.print("ù��° �� :");
		su1 = Integer.parseInt(br.readLine());
		do {
			System.out.print("yon(+,-,*,/,%) :");
			yon = (char)System.in.read();
			//System.in.read();
			//System.in.read();
			System.in.skip(2);
		}while(yon!='+'&&yon!='-'&&yon!='*'&&yon!='/'&&yon!='%');
		
		System.out.print("�ι�° �� :");
		su2 = Integer.parseInt(br.readLine());
		
		//�����ڸ� �������� �ؼ� ó�� (������)
//		switch(yon) {
//		case'+' :
//			tot = su1+su2;
//			break;
//		case'-' :
//			tot = su1-su2;
//			break;
//		case'*' :
//			tot = su1*su2;
//			break;
//		case'/' :
//			tot = su1/su2;
//			break;
//		case'%' :
//			tot = su1%su2;
//			break;
//		}
		
		
		switch(yon) {
		case'+' :
			tot = plus(su1,su2);
			break;
		case'-' :
			tot = min(su1,su2);
			break;
		case'*' :
			tot = mul(su1,su2);
			break;
		case'/' :
			tot = div(su1,su2);
			break;
		case'%' :
			tot = per(su1,su2);
			break;
		}
		
		
		//System.out.println(su1+" "+yon+" "+su2+" = "+tot);
		disp(su1, yon, su2, tot);

	}

}
