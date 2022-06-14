package com.ioex;

import java.io.*;
//byte[]������ ����
public class FileCopyEx02 {

	public static void main(String[] args) {
		
		System.out.println("���� ���� ����......");
		long start = System.currentTimeMillis();
		
		FileInputStream src = null;
		FileOutputStream dest = null;
		
		try {
			
			//���������� �б� ���� FileInputStream ��ü����
			src = new FileInputStream(new File("c:/ppp/abc.txt"));
			//���� ������ �����ϱ� ���� FileOutputStream ��ü����
			dest = new FileOutputStream(new File("c:/ppp/des.txt"));
			
			//�ӽ�����ҿ� ����� �������� ��ü ������ ������ ���� ����
			int length = 0;
			//�ӽ� ����ҷ� ����� byte[]�迭 ����
			byte[] buffer = new byte[1024*8];
			
			//InputStream�� ���ؼ� �о���� �����͸� �ӽ� ����ҿ� �����ϰ�
			//����� �������� ���̸�ŭ length�� ����.
			
			while((length = src.read(buffer)) != -1) {
				//OutputStream�� ���ؼ� �ӽ�����ҿ� ����Ǿ��ִ� �����͸� length��ŭ ���Ͽ� ����
				dest.write(buffer,0,length);
			}
			
			
			
			
			
			
			
			
			
			
			
			
			//FileInputStream�� ���ؼ� �о���� ���� ������ ��������
			int readValue = 0;
			// FileInputStream�� read()�޼ҵ带 ���ؼ� �о���� ���� readValue�� ����
			
			while((readValue = src.read()) !=-1){
				//readValue�� ����Ȱ��� FileOutputStream�� write()�޼ҵ带 ���ؼ� ���Ͽ� ������.
				dest.write(readValue);
			}
			
			
			
			
			
			
			
		
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		}finally {
			try { if(dest!=null) dest.close();
			}catch(IOException ii) {
				ii.printStackTrace();
			} 
			try {
				if(src!=null)
				src.close();
			}catch(IOException ii) {
				ii.printStackTrace();
			}
		}
		
		
		
		long end = System.currentTimeMillis();
		
		long copyTime = (end-start)/1000;
		
		System.out.println("���翡 �ɸ� �ð� :"+copyTime+"��");

	}

}
