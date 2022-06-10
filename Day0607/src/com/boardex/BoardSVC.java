package com.boardex;


import java.util.*;

public class BoardSVC {
	
	ArrayList<BoardVO> boardList;
	
//	ArrayList<HashMap<String, String>> boardList;
	
	public BoardSVC() {
		boardList = new ArrayList<BoardVO>();
//		boardList = new ArrayList<HashMap<String, String>>();
		
		
	}
	
	//�۾���
	public void writeArticle(Scanner sc) {
		System.out.println("�Խ��� ���� �ۼ��ϼ���");
		System.out.print("�ۼ��� :");
		String register = sc.next();

		System.out.print("�̸��� :");
		String email = sc.next();

		System.out.print("��й�ȣ :");
		String password = sc.next();
		
		System.out.print("���� :");
		String subject = sc.next();

		System.out.print("�۳��� :");
		String content = sc.next();
		
		BoardVO boardVO = new BoardVO(register, subject, email, content, password);
		//ArrayList�� �߰�
		addArticle(boardVO);
		
		
	}
	
	//���� ����Ʈ�� �߰�
	private void addArticle(BoardVO boardVO) {
		boardList.add(boardVO);
	}
	
	
	
	//��Ϻ���	
	public void listArticle(Scanner sc) {
		
		if(boardList.size()>0) {
			
			for(int i=0;i<boardList.size();i++) {
				System.out.println(boardList.get(i));
			}
			
		}else {
			System.out.println("���� �����ϴ�.");
		}
	
	}
	
	
	
	//�ۻ���
	public void removeArticle(Scanner sc) {
		
		System.out.println("�Խñ��� ������ ���� ���� �ۼ��ڿ� ��й�ȣ�� �Է��ϼ���");
		System.out.print("�ۼ��� :");
		String name = sc.next();
		System.out.print("��й�ȣ :");
		String password = sc.next();
		
		removeArticle(name,password);
		
	}
	public void removeArticle(String register,String passwd) {
		//���� ��� ����
		if(boardList.size()>0) {
			
			int index = -1;
			
			for(int i=0;i<boardList.size();i++) {
				
				if(boardList.get(i).getRegister().equals(register)) {// �ۼ��ڰ� ��ġ�ϴ°��
					if(boardList.get(i).getPassword().equals(passwd)) { // ��й�ȣ�� ��ġ�ϴ� ���
						boardList.remove(boardList.get(i));
						index = i;
						
					}
				}
				
			}
			if(index == -1) {//�ε����� ���� ���
				System.out.println("�ش� �ۼ��ڰ� ���ų� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				return;
			}
		
		}else {
			System.out.println("���� �����ϴ�.");
		}
		
	}
	
	
}