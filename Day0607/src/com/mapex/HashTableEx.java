package com.mapex;


import java.util.*;
public class HashTableEx {
	
	
	private static final String name[]= {
		"�ö���","��ũ���׽�","����","����","�Ƹ������ڷ���","�����"	
	};
	private static final String tell[]= {
			"111-1111","222-2222","333-3333","555-5555","666-6666","555-5555"
	};
	
	public static void main(String[] args) {
		
		Hashtable<String, String> ht = new Hashtable<>();
		
		//�ؽ����̺� Ű,������ �Է�
		for(int i = 0;i<name.length;i++) {
			ht.put(name[i],tell[i]);
		}
		
//		System.out.println(ht);
		
		String str = ht.get("�����");
		if(str !=null) {
			System.out.println("������� ��ȭ��ȣ :"+str);
		}
		
		//Ű�� �����ϴ��� �˻�
		if(ht.contains("�ɽ���"))
			System.out.println("�ɽ����ڷᰡ ������");
		else
			System.out.println("�ڷᰡ �������� �ʽ��ϴ�");
		
		if(ht.containsValue("555-5555"))
			System.out.println("�ɽ����ڷᰡ ������");
		else
			System.out.println("�ڷᰡ �������� �ʽ��ϴ�");
		
		ht.remove("�����");
		
		if(ht.containsKey("�����"))
			System.out.println("������ڷᰡ ������");
		else
			System.out.println("�ڷᰡ �������� �ʽ��ϴ�");

		
		
		
		

	}

}
