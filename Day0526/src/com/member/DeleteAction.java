package com.member;

import java.util.Scanner;

public class DeleteAction implements Action {

	@Override
	public void execute(Scanner sc) {
		
		System.out.println("������ ȸ�� �̸� �Է��ϼ���.");
		System.out.print("�̸� �Է�:");
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
			System.out.println("ȸ�� ������ �������� �ʽ��ϴ�.");
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
