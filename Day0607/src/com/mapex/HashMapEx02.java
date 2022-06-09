package com.mapex;


import java.util.*;
public class HashMapEx02 {

	
	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("홍길동", 90);
		map.put("이순신", 100);
		map.put("이기자", 60);
		map.put("빅자바", 50);
		
		Set<Map.Entry<String, Integer>> set1 = map.entrySet();
		Iterator<Map.Entry<String, Integer>> it1 = set1.iterator();
		/*	키와 값을 set 형태로 저장(HashMap을 이용해서 key와 value를 묶어주기 위해서 entry를 이용함)
		 *   
		 *   임의,엔트리(키와 값의 한쌍,페어이다)
		 *   Map,Entry에는 .entrySet() 메소드가 있는데
		 *     entrySet()메소드는 현재(이클래스)클래스에 속하는 요소를 가지는 맵의 컬렉션뷰를 돌려줌
		 *     맵의 엔트리의 참조를 취득하는 유일한 방법은 반복자(Iterator)를 이용해서 취득함
		 */
		
		while(it1.hasNext()) {
			Map.Entry<String, Integer> e = it1.next();
			System.out.println("이름 :"+e.getKey()+" 점수 :"+e.getValue());
		}
		
		Set set2 = map.keySet();
		System.out.println("이름 :"+set2);
		
		Collection<Integer> v = map.values();
		Iterator<Integer> it2 = v.iterator();
		
		int sum = 0;
		while(it2.hasNext()) {
			Integer i = it2.next();
			sum +=i;
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.println("총점 :"+sum);
		System.out.println("평균 :"+sum/set2.size());
		System.out.println("최대값 :"+Collections.max(v));
		System.out.println("최소값 :"+Collections.min(v));
		
		
	}

}
