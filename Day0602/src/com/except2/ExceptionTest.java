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
	
	
	static void Install() throws InstallException{
		
		try {
			startInstall();
			copyFile();
			
		}catch(SpaceException se) {
			InstallException ie = new InstallException("설치중 예외발생");
			ie.initCause(se); // 지정한 예외를 원인으로 등록하는 기능
			throw ie; // 원인 예외를 반환함
		}catch(MemoryException me) {
			InstallException ie = new InstallException("설치중 예외발생");
			ie.initCause(me); // 지정한 예외를 원인으로 등록하는 기능
			throw ie; // 원인 예외를 반환함
		}finally {
			deleteTempFiles(); //프로그램 설치에 사용된 임시파일을 제거함.
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
