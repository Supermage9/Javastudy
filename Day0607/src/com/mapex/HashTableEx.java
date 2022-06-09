package com.mapex;


import java.util.*;
public class HashTableEx {
	
	
	private static final String name[]= {
		"플라톤","소크라테스","공자","맹자","아리스토텔레스","신재우"	
	};
	private static final String tell[]= {
			"111-1111","222-2222","333-3333","555-5555","666-6666","555-5555"
	};
	
	public static void main(String[] args) {
		
		Hashtable<String, String> ht = new Hashtable<>();
		
		//해시테이블에 키,데이터 입력
		for(int i = 0;i<name.length;i++) {
			ht.put(name[i],tell[i]);
		}
		
//		System.out.println(ht);
		
		String str = ht.get("신재우");
		if(str !=null) {
			System.out.println("신재우의 전화번호 :"+str);
		}
		
		//키가 존재하는지 검색
		if(ht.contains("심심해"))
			System.out.println("심심해자료가 존재함");
		else
			System.out.println("자료가 존재하지 않습니다");
		
		if(ht.containsValue("555-5555"))
			System.out.println("심심해자료가 존재함");
		else
			System.out.println("자료가 존재하지 않습니다");
		
		ht.remove("신재우");
		
		if(ht.containsKey("신재우"))
			System.out.println("신재우자료가 존재함");
		else
			System.out.println("자료가 존재하지 않습니다");

		
		
		
		

	}

}
