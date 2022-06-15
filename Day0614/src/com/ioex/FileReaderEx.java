package com.ioex;
import java.io.*;
public class FileReaderEx {

	public static void main(String[] args) {
		FileReader fr = null;
		
		try {
			//파일로부터 한 문자 단위로 읽어올 수 있는 FileReader 객체 생성
			fr = new FileReader("c:/ppp/song.txt");
			//스트림을 통해서 읽어들인 유니코드 값을 저장할 변수 선언
			int readValue = 0;
			while((readValue = fr.read())!= -1) {
				System.out.print((char)readValue);  // char 형변환
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
