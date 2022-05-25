package com.test;

public class Book {// 클래스 헤더(클래스명)
	
	//멤버필드(변수, 상수), 속성
	
	String name;
	String writer;
	int price;
	int nowPage;
	String isbn;
	
	//기본생성자(ctrl+space)
	public Book(String name, String writer, int price, int nowPage, String isbn) {
		this.name= name;
		this.writer = writer;
		this.price = price;
		this.nowPage = nowPage;
		this.isbn = isbn;
	}
	
	//메소드 (동작,행위)
	public void nextPage() {nowPage++;} //public 생략가능
	public void previousPage() {nowPage--;}
	
	
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

}
