package com.mapex.mscore;
import java.io.*;
import java.util.*;

public class ScoreMain {

	public static void main(String[] args)throws IOException {
		
		
		Score score = new ScoreImpl();
		char ch;
		System.out.println("����ó��");
		while(true) {
			
			do {
				System.out.print("\n1.�Է�");
				System.out.print("\n2.����");
				System.out.print("\n3.�̸��˻�");
				System.out.print("\n4.����");
				System.out.print("\n5.��ü���");
				System.out.print("\n6.������ ��ü���");
				System.out.println("\n7.����");
				System.out.print("�޴� ���� :");
				ch = (char)System.in.read();
				System.in.skip(2);
			}while(ch<'1'||ch>'7');
			
			switch(ch) {
			case '1':score.insert(); break;
			case '2':score.update(); break;
			case '3':score.search(); break;
			case '4':score.delete(); break;
			case '5':score.writeAll(); break;
			case '6':score.writeSort(); break;
			case '7':System.exit(0); break;
		
			}
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		

	}

}
