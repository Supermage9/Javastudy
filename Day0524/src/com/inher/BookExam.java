package com.inher;

import java.util.ArrayList;
import java.util.Scanner;

class Book{
	
	static int count;
	String title;
	int score;
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Book.count = count;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Book[title="+title+",score="+"]";
	}
	
	public Book(String title, int score) {
		this.title=title;
		this.score=score;
		count++;
		
	}
	
}



public class BookExam {

	public static void main(String[] args) {
		
		ArrayList<Book> list = new ArrayList<Book>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("=======================");
			System.out.println("1. å ���");
			System.out.println("2. å �˻�");
			System.out.println("3. ��� å ���");
			System.out.println("4. ����");
			System.out.println("=======================");
			
			System.out.print("�޴� ���� :");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				System.out.print("å ���� :");
				String title = sc.next();
				System.out.print("å ���� :");
				int score = sc.nextInt();
				list.add(new Book(title,score));
				break;
			case 2:
				System.out.print("å ���� :");
				String title2 = sc.nextLine();
				
				for(Book e:list) {
					if(e.getTitle().equals(title2)) {
						System.out.println(e);
					}
				}
				
				break;
			case 3:
				
				break;
			case 4:
				return;
				
			}
			
			
		}
	}

}