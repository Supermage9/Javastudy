package com.ioex;

//����, ���丮 ���� �� ����
import java.io.*;
public class FileEx03 {

	public static void main(String[] args) {
		
		//���� ����
//		File f1 = new File("c:/ppp/newFile.txt");
//		
//		try {
//			if(f1.exists()) {
//				System.out.println("�����̸� :"+f1.getName());
//			}else {
//				if(f1.createNewFile()) {
//					System.out.println("���ο� ������ ��������ϴ�.");
//				}
//			}
//			
//		} catch (IOException e) {}
		
		//���丮 ����
		
//		File f2 = new File("c:/newDirectory");
//		if(!f2.exists()) {
//			f2.mkdir();
//		}else {
//			System.out.println("���丮 �̸� :"+f2.getPath());
//		}
		
		//���� Ȥ�� ���丮 ����
//		File f3 = new File("c:/ppp/newFile.txt");
//		if(f3.exists()) {
//			f3.delete();
//		}else {
//			System.out.println("���� Ȥ�� ���丮�� �������� �ʽ��ϴ�.");
//		}
		
		//���� Ȥ�� ���丮 �̸� ����
		File src = new File("c:/ppp/newFIle.txt");
		File dest = new File("c:/newDirectory/dest.txt");
		File dest2 = new File("c:.newDirectory/dest2.txt");
		
		if(src.exists()) {
			src.renameTo(dest);
			src.renameTo(dest2);
		}else {
			System.out.println("������ �����ϴ�.");
		}
		
	}

}
