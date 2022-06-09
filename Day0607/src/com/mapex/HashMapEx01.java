package com.mapex;
import java.util.*;

/*
 * 	Map<Key, value> : 키는 중복을 허용하지 않음. 값은 중복을 허용함.
 *       키    값      키값이 중복될 경우 값을 변경해야함.
 */



public class HashMapEx01 {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<String, String>();
		
		//map에 데이터 추가 put(k,v);
		map.put("만화", "마녀배달부 키키");
		map.put("호러", "스크림");
		map.put("영화", "황혼에서 새벽까지");
		
		System.out.println(map);
		
		String key;
		
		Set set = map.keySet();
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			key = it.next();
			System.out.println(map.get(key));// 키에 의해 값만 나옴.
		}
		
		map.put("영화", "달마야 놀자");
		System.out.println(map); // 키가 중복될경우 값을 밀어냄.
		
		
	}

}
