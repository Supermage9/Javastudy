package com.study;

//실제 회원 검색기능 구현
public class SearchService {
	
	
	
	Member members[] = new Member[5];
	
	public SearchService() {
		//생성자를 호출해서 멤버변수(객체배열)초기화
		members[0]=new Member("홍길동", 195, 120, "오나라");
		members[1]=new Member("유비", 187, 97, "한나라");
		members[2]=new Member("제갈공명", 167, 73, "제나라");
		members[3]=new Member("강감찬", 152, 58, "고려");
		members[4]=new Member("이성계", 182, 95, "고려");
		
	}
	
	//회원의 이름을 매개변수로 받아서 해당 이름을 가지고있는 회원 객체배열에서 찾아
	//해당 회원의 정보를 출력하는 기능 구현
	
	boolean searchMember(String name) {
		
		boolean searchResult = false;
		
		for(int i=0;i<members.length;i++) {
			if(members[i].getName().equals(name)) {
				//해당 이름의 회원이 찾아졌으면 정보를 출력.
				prtInfo(members[i]);
				searchResult = true;
			}
		}
		return searchResult;
	}
	
	
	//파라미터(매개변수) 값으로 회원객체의 정보를 받아서 출력하는 메소드
	private void prtInfo(Member member){
		System.out.println(member.getName()+"으로 찾은 결과값");
		System.out.println("이름 : "+member.getName());
		System.out.println("신장 : "+member.getHeight());
		System.out.println("몸무게 : "+member.getWeight());
		System.out.println("국적 : "+member.getNation());
	}
	
	
	
	
	
	
	
	
	
	
	
}
