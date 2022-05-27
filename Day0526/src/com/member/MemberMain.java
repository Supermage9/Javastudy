package com.member;

import java.util.*;

public class MemberMain {
	
	static MemberVO[] members;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		MemberService memberService = new MemberService();
		
		members = new MemberVO[0];
//		ArrayList<MemberVO> members = new ArrayList<MemberVO>();
		
		boolean isStop = false;
		
		do {
			System.out.println("���� �޴� �� �ϳ��� �����ϼ���.");
			System.out.println("1. ȸ������");
			System.out.println("2. ȸ�� ��Ϻ���");
			System.out.println("3. ȸ�� ����");
			System.out.println("4. ȸ�� ����");
			System.out.println("5. ����");
			
			String command = sc.next();
			
			switch (command) {
			case "1":
				WriteAction writeAction = new WriteAction();
				memberService.process(writeAction, sc);
				break;
			case "2":
				ListAction listAction = new ListAction();
				memberService.process(listAction, sc);
				break;
			case "3":
				break;
			case "4":
				UpdateAction updateAction = new UpdateAction();
				memberService.process(updateAction, sc);
				break;
			case "5":
				isStop = true;
			default:
				break;
			}
			
		} while (!isStop);

	}

}
