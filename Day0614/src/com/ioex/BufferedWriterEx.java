package com.ioex;
import java.io.*;
//�ؽ�Ʈ���Ͽ� ���� ���
public class BufferedWriterEx {

	public static void main(String[] args) {
		
		//Buffered  ��Ʈ�� : ��Ʈ���� �а� ���� ����� ���� ��Ʈ�� ���ο� ���۸� �������ִ� ��Ʈ��
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		
		
		try {
			
			fw = new FileWriter("c:/ppp/hello.txt");
			bw = new BufferedWriter(fw);
			bw.write("���õ� ������ �帮����");
			bw.newLine(); //System.out.println();�� ����
			bw.write("���õ� ������ �帮����");
			bw.newLine();
			bw.write("���õ� ������ �帮����");
			
			
			bw.flush(); // enter ����
			
			
		}catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();} 
		catch (IOException ii) {
			ii.printStackTrace();
		}finally {
			try {if(fw!=null) {fw.close();}}catch(IOException e) {}
			try {if(bw!=null) {bw.close();}}catch(IOException e) {}
		}
		
	}

}
