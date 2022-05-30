package com.member;

import java.util.Scanner;

public class DeleteAction implements Action {

	@Override
	public void execute(Scanner sc) {
		
		System.out.println("삭제할 회원 이름 입력하세요.");
		System.out.print("이름 입력:");
		String name = sc.next();
		
	}
	
	private void deleteMember(String name) {
		
		int deleteIndex = -1;
		MemberVO[] members = MemberMain.members;
		MemberVO[] temp = null;
		
		for(int i=0; i<members.length;i++) {
			if(members[i].getName().equals(name)) {
				deleteIndex = i;
			}
		}
		
		if(deleteIndex == -1) {
			System.out.println("회원 정보가 존재하지 않습니다.");
			return;
		}
		
		if(members.length>=1) {
			temp = new MemberVO[members.length-1];
			
			for(int i = 0;i<members.length;i++) {
				if(i == deleteIndex) {
					continue;
				}else if(i>deleteIndex) {
					temp[i-1] = members[i];
				}
				temp[i]=members[i];
			}
			
		}
		
		MemberMain.members = temp;
		
		
	}
	
	
	

}
