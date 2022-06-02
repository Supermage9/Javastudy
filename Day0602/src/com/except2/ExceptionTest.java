package com.except2;

public class ExceptionTest {

	
	public static void main(String[] args) {
		
		try {
		startInstall();
		copyFile();
		}catch(SpaceException e) {
			System.out.println("공간이 부족합니다.");
		}catch (MemoryException me) {
			System.out.println("메모리가 부족합니다.");
		}finally {
			deleteTempFiles();
		}
	}
	
	static void startInstall() throws SpaceException, MemoryException {
		
		if(!enoughSpace()) { // 프로그램 설치시 공간이 부족한 경우
			//throw new SpaceException("설치할 공간이 부족합니다.");
		}
		
		if(!enoughMemory()) { //메모리 부족
			throw new MemoryException("메모리가 부족합니다.");
		}
		
		
	}
	
	static boolean enoughSpace() {
		
		return false;
	}
	
	static boolean enoughMemory() {
		
		return true;
	}
	
	static void copyFile() { // 파일복사
		
		
	}
	
	static void deleteTempFiles() {  //임시파일 삭제
		
	}
	
	
}
