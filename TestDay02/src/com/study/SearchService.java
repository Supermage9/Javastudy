package com.study;

//���� ȸ�� �˻���� ����
public class SearchService {
	
	
	
	Member members[] = new Member[5];
	
	public SearchService() {
		//�����ڸ� ȣ���ؼ� �������(��ü�迭)�ʱ�ȭ
		members[0]=new Member("ȫ�浿", 195, 120, "������");
		members[1]=new Member("����", 187, 97, "�ѳ���");
		members[2]=new Member("��������", 167, 73, "������");
		members[3]=new Member("������", 152, 58, "���");
		members[4]=new Member("�̼���", 182, 95, "���");
		
	}
	
	//ȸ���� �̸��� �Ű������� �޾Ƽ� �ش� �̸��� �������ִ� ȸ�� ��ü�迭���� ã��
	//�ش� ȸ���� ������ ����ϴ� ��� ����
	
	boolean searchMember(String name) {
		
		boolean searchResult = false;
		
		for(int i=0;i<members.length;i++) {
			if(members[i].getName().equals(name)) {
				//�ش� �̸��� ȸ���� ã�������� ������ ���.
				prtInfo(members[i]);
				searchResult = true;
			}
		}
		return searchResult;
	}
	
	
	//�Ķ����(�Ű�����) ������ ȸ����ü�� ������ �޾Ƽ� ����ϴ� �޼ҵ�
	private void prtInfo(Member member){
		System.out.println(member.getName()+"���� ã�� �����");
		System.out.println("�̸� : "+member.getName());
		System.out.println("���� : "+member.getHeight());
		System.out.println("������ : "+member.getWeight());
		System.out.println("���� : "+member.getNation());
	}
	
	
	
	
	
	
	
	
	
	
	
}
