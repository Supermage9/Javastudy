package com.member;

import java.util.Scanner;

public class ListAction implements Action {

	@Override
	public void execute(Scanner sc) {
		
		MemberVO[] members = MemberMain.members;
		if(members.length >= 1) {
			for(int i = 0; i < members.length; i++) {
				System.out.println("이름 : " + members[i].getName());
				System.out.println("전화번호 : " + members[i].getTel());
				System.out.println("국적 : " + members[i].getNation());
				System.out.println("나이 : " + members[i].getAge());
				System.out.println("이메일 : " + members[i].getEmail());
			}
			
		} else {
			System.out.println("회원 정보가 존재하지 않습니다.");
		}
		
	}

}
