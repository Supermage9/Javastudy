package com.vectorex;

import java.util.Collections;
import java.util.Vector;

public class VectorEx03 {

	
	private static final String colors[]= {
		"����","���","���","�Ķ�","��Ȳ","����","����",	
	};
	
	
	public static void main(String[] args) {
		
		Vector<String> v = new Vector<String>();
		
		for(String str :colors)
			v.add(str);
		
		System.out.println("ù��° ��� :"+v.firstElement());
		System.out.println("����° ��� :"+v.get(2));
		System.out.println("������ ��� :"+v.lastElement());
		System.out.println("������ ũ�� :"+v.capacity());
		
		//ù��° ��Ұ��� ������� ����
		v.set(0, "���");
		System.out.println("ù��° ��� :"+v.firstElement());
		System.out.println("��� ���� : "+v.size());
		
		//ù��° ��ҿ� ���� �߰�
		v.insertElementAt("����", 0);
		System.out.println("ù��° ��� :"+v.firstElement());
		System.out.println("��� ���� : "+v.size());
		
		
		
		//��ü���
		for(String str : v)
			System.out.print(str+" ");
		System.out.println("\n");
		
		
		//�˻�
		String s = "���";
		if(v.contains(s)) {
			int i = v.indexOf(s)+1;
			System.out.println(s+"-->��ġ :"+i);
		}
		System.out.println("\n");
		
		//����
		v.remove(6);
		v.remove("��Ȳ");
		System.out.println("�ڷ� ������ ");
		for(String str : v)
			System.out.print(str+" ");
		System.out.println("\n");
		
		
		
		
		
		
		
		
		//�������� ����
		Collections.sort(v);
		//�������� ������
		for(String str : v)
		System.out.print(str+" ");
		System.out.println();
		
		//�˻��� �������� ���ĵ� �ڷῡ���� ������
		int idx =Collections.binarySearch(v, "���");
		System.out.println("��� :"+idx+" index�� ����"); //������ �ε��� ���, ������ ���� ���
		
		
		
		//�������� ����
		Collections.sort(v,Collections.reverseOrder());
		//�������� ������
		System.out.println("\n�������� ������ :");
		for(String str :v) 
			System.out.print(str+" ");
		System.out.println();
		
		//�������� �˻�
		idx = Collections.binarySearch(v, "����",Collections.reverseOrder());
		System.out.println("���λ� :"+idx+" index�� ����");//������ �ε��� ���, ������ �������
		
		
		
		
		
	}

}
