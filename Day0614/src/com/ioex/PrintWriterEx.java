package com.ioex;
import java.io.*;
public class PrintWriterEx {

	public static void main(String[] args) {
		
		PrintWriter pw = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			
			fos = new FileOutputStream("c:/ppp/printwriter.txt");
			bos = new BufferedOutputStream(fos);
			pw = new PrintWriter(bos, true); // true �� autoFlush ����� �� ������ ���°�
			
			pw.println("���õ� ��ſ� !!");
			pw.println("���ɽð��� ã�ƿԽ��ϴ�");
			pw.println(100.0);
			pw.println(true);
			
			
		}catch (FileNotFoundException fnfe) {fnfe.printStackTrace();
		}catch (IOException ii) {ii.printStackTrace();
		}finally {
			try {
				if(fos!=null) {fos.close();}
				if(pw!=null) {pw.close();}
				if(bos!=null) {bos.close();}
			}catch(IOException e) {}
		}
		
	}

}