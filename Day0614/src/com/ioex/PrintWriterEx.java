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
			pw = new PrintWriter(bos, true); // true 는 autoFlush 기능을 쓸 것인지 묻는것
			
			pw.println("오늘도 즐거운 !!");
			pw.println("점심시간이 찾아왔습니다");
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
