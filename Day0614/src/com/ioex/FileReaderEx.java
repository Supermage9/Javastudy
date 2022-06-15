package com.ioex;
import java.io.*;
public class FileReaderEx {

	public static void main(String[] args) {
		FileReader fr = null;
		
		try {
			//���Ϸκ��� �� ���� ������ �о�� �� �ִ� FileReader ��ü ����
			fr = new FileReader("c:/ppp/song.txt");
			//��Ʈ���� ���ؼ� �о���� �����ڵ� ���� ������ ���� ����
			int readValue = 0;
			while((readValue = fr.read())!= -1) {
				System.out.print((char)readValue);  // char ����ȯ
			}
			
			
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {if(fr!=null) {fr.close();}}catch(IOException e) {}
		}
		
		
	}

}
