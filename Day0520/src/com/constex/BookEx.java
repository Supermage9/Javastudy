package com.constex;

public class BookEx {
	
	String title;
	String author;
	
	public void show() {
		System.out.println(title+" "+author);
	}
	
	public BookEx() {
		this("","");
		System.out.println("������ ȣ����");
	}
	
	public BookEx(String title) {
		this(title,"���ڹ̻�");
		
	}
	
	public BookEx(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	
	

	public static void main(String[] args) {
		
		BookEx be = new BookEx("ȫ�浿��","���");
		BookEx be2 = new BookEx("ȫ�浿��");
		BookEx be3 = new BookEx();
		be.show();
		be2.show();
		be3.show();
		
		
		
		
		
		
		
		
	}

}