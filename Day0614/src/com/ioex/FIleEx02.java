package com.ioex;


// 파일 목록 출력
import java.io.File;
public class FIleEx02 {

	public static void main(String[] args) {
		
		File directory = new File("c:/");
		
		if(directory.exists()) { // 파일 존재 여부 검사
			if(directory.isDirectory()) { //디렉토리인지 아닌지 검사
				// 현재 디렉토리 내의 모든 파일
				String[]fileNameList = directory.list(); // 디렉토리 리스트를 스트링 배열에 저장
				
				//파일 목록 출력
				for(String filenName : fileNameList) {
					System.out.println("파일이름 :"+filenName);
				}
			}
		}
		
		
		
	}

}
