package com.mapex;
import java.util.*;

/*
 * 	Map<Key, value> : Ű�� �ߺ��� ������� ����. ���� �ߺ��� �����.
 *       Ű    ��      Ű���� �ߺ��� ��� ���� �����ؾ���.
 */



public class HashMapEx01 {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<String, String>();
		
		//map�� ������ �߰� put(k,v);
		map.put("��ȭ", "�����޺� ŰŰ");
		map.put("ȣ��", "��ũ��");
		map.put("��ȭ", "Ȳȥ���� ��������");
		
		System.out.println(map);
		
		String key;
		
		Set set = map.keySet();
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			key = it.next();
			System.out.println(map.get(key));// Ű�� ���� ���� ����.
		}
		
		map.put("��ȭ", "�޸��� ����");
		System.out.println(map); // Ű�� �ߺ��ɰ�� ���� �о.
		
		
	}

}
