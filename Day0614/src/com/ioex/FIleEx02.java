package com.ioex;


// ���� ��� ���
import java.io.File;
public class FIleEx02 {

	public static void main(String[] args) {
		
		File directory = new File("c:/");
		
		if(directory.exists()) { // ���� ���� ���� �˻�
			if(directory.isDirectory()) { //���丮���� �ƴ��� �˻�
				// ���� ���丮 ���� ��� ����
				String[]fileNameList = directory.list(); // ���丮 ����Ʈ�� ��Ʈ�� �迭�� ����
				
				//���� ��� ���
				for(String filenName : fileNameList) {
					System.out.println("�����̸� :"+filenName);
				}
			}
		}
		
		
		
	}

}
