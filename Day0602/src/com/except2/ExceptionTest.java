package com.except2;

public class ExceptionTest {

	
	public static void main(String[] args) {
		
		try {
		startInstall();
		copyFile();
		}catch(SpaceException e) {
			System.out.println("������ �����մϴ�.");
		}catch (MemoryException me) {
			System.out.println("�޸𸮰� �����մϴ�.");
		}finally {
			deleteTempFiles();
		}
	}
	
	static void startInstall() throws SpaceException, MemoryException {
		
		if(!enoughSpace()) { // ���α׷� ��ġ�� ������ ������ ���
			//throw new SpaceException("��ġ�� ������ �����մϴ�.");
		}
		
		if(!enoughMemory()) { //�޸� ����
			throw new MemoryException("�޸𸮰� �����մϴ�.");
		}
		
		
	}
	
	static boolean enoughSpace() {
		
		return false;
	}
	
	static boolean enoughMemory() {
		
		return true;
	}
	
	static void copyFile() { // ���Ϻ���
		
		
	}
	
	static void deleteTempFiles() {  //�ӽ����� ����
		
	}
	
	
}
