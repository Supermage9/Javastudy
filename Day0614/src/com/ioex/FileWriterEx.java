package com.ioex;
/*
 * ���Ͽ� ���� ���
 */

import java.io.*;

public class FileWriterEx {

	public static void main(String[] args) {
		
		FileWriter fw = null;
		
		try {
			//���Ͽ� �� ���ڴ����� ����� �� �ִ� FileWriter ��ü�� ����
			fw = new FileWriter("c:/ppp/song.txt");
			//fw�� ���ڿ��� �ٷ� ����� �� �ִ�.
			String str = "�б����� ������ �������";
			fw.write(str);
			//�ѱ��� ������ �а� �� �� �ִ� Reader,Writer�迭�� ��Ʈ����
			//���������� ���۸� �����ϰ� ����
			//����� ���۴� ���۰� ���� ä���� ������ ��Ʈ���� ���� ��������.
			//�׷��� ����ä������ ���� ���¿��� ���۸� ����� �� ���
			//flush()�޼ҵ带 Ȱ���Ͽ� ���۰� ä������ ���� ���¿����� ���� �Ѵ�.
			fw.flush();
			
			
			
			
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {if(fw!=null) {fw.close();}}catch(IOException e) {}
		}
		
		
	}

}
