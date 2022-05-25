package com.inherex01;

import java.io.*;



class AClass{
	protected int x,y; //�ΰ��� ����
	protected char ch; //������
	
	
	public AClass() {
		
	}
	
	public void write(double result) {
		System.out.printf("%d %c %d = %.2f%n",x,ch,y,result);
	}
	
}


class BClass extends AClass{
	//�������Է±��(�޼ҵ�)
	boolean input() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.print("������ �� ���� �Է�(���� ����):");
		String temp = br.readLine(); //"20 15" ���鱸��
		String[]str = temp.split("\\s");//{"20","15"}
		
		if(str.length != 2)
			return false;
		
		x = Integer.parseInt(str[0]);
		y = Integer.parseInt(str[1]);
		
		System.out.print("������ �Է�[+ - * /]:");
		ch = (char)System.in.read();
		
		if(ch=='+'||ch=='-'||ch=='*'||ch=='/') {
			return true;
		}
		
		
		return false;
	}
	
	
	//���� �� ó�� ���(�޼ҵ�)
	
	public double calc() {
		double result = 0;
		
		switch(ch) {
		case'+': result = x+y; break;
		case'-': result = x-y; break;
		case'*': result = x*y; break;
		case'/': result = x/y; break;
		}
		return result;
	}
}




public class InherExam02 {
	

	public static void main(String[] args) throws IOException{
		
		BClass bc = new BClass();
		
		if(!bc.input()) {
			System.out.println("Error!");
			return;
		}
		double result = bc.calc();
		bc.write(result);
		
		
	}

}