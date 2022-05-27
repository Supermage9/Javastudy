package com.member;

import java.util.*;

public class WriteAction implements Action {

	@Override
	public void execute(Scanner sc) {
		System.out.println("����� ȸ���� ������ �Է� �ϼ���.");
		
		System.out.print("�̸� : ");
		String name = sc.next();
		
		System.out.print("���� : ");
		int age = sc.nextInt();
		
		System.out.print("�̸��� : ");
		String email = sc.next();

		System.out.print("���� : ");
		String nation = sc.next();

		System.out.print("��ȭ��ȣ : ");
		String tel = sc.next();
		
		MemberVO member = new MemberVO(age, name, tel, email, nation);
		addMember(member);
	}

	
	// ��� �߰� ���� �޼ҵ�
	private void addMember(MemberVO member) {
		MemberVO[] temp = new MemberVO[MemberMain.members.length+1];
		for(int i = 0; i < MemberMain.members.length; i++) {
			temp[i] = MemberMain.members[i];
		}
		temp[temp.length-1] = member;
		MemberMain.members = temp;
		
	}
}
