package com.ioex;
import java.io.*;
//텍스트파일에 문자 기록
public class BufferedWriterEx {

	public static void main(String[] args) {
		
		//Buffered  스트림 : 스트림의 읽고 쓰는 기능을 위해 스트림 내부에 버퍼를 가지고있는 스트림
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		
		
		try {
			
			fw = new FileWriter("c:/ppp/hello.txt");
			bw = new BufferedWriter(fw);
			bw.write("오늘도 날씨는 흐리군요");
			bw.newLine(); //System.out.println();의 역할
			bw.write("오늘도 날씨는 흐리군요");
			bw.newLine();
			bw.write("오늘도 날씨는 흐리군요");
			
			
			bw.flush(); // enter 역할
			
			
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
