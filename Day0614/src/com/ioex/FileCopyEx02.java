package com.ioex;

import java.io.*;
//byte[]단위로 복사
public class FileCopyEx02 {

	public static void main(String[] args) {
		
		System.out.println("파일 복사 시작......");
		long start = System.currentTimeMillis();
		
		FileInputStream src = null;
		FileOutputStream dest = null;
		
		try {
			
			//원본파일을 읽기 위한 FileInputStream 객체생성
			src = new FileInputStream(new File("c:/ppp/abc.txt"));
			//복사 파일을 생성하기 위한 FileOutputStream 객체생성
			dest = new FileOutputStream(new File("c:/ppp/des.txt"));
			
			//임시저장소에 저장된 데이터의 전체 개수를 저장할 변수 선언
			int length = 0;
			//임시 저장소로 사용할 byte[]배열 선언
			byte[] buffer = new byte[1024*8];
			
			//InputStream을 통해서 읽어들인 데이터를 임시 저장소에 저장하고
			//저장된 데이터의 길이만큼 length에 저장.
			
			while((length = src.read(buffer)) != -1) {
				//OutputStream을 통해서 임시저장소에 저장되어있는 데이터를 length만큼 파일에 저장
				dest.write(buffer,0,length);
			}
			
			
			
			
			
			
			
			
			
			
			
			
			//FileInputStream을 통해서 읽어들인 값을 저장할 변수선언
			int readValue = 0;
			// FileInputStream의 read()메소드를 통해서 읽어들인 값을 readValue에 저장
			
			while((readValue = src.read()) !=-1){
				//readValue에 저장된값을 FileOutputStream의 write()메소드를 통해서 파일에 저장함.
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
		
		System.out.println("복사에 걸린 시간 :"+copyTime+"초");

	}

}
