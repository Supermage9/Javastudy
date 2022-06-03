package study;

public class Book5{
	int booknumber;
	String bookname;
	
	public Book5(int booknumber, String bookname) {
		this.booknumber = booknumber;
		this.bookname = bookname;
	}
	
	@Override
	public String toString() {
		
		System.out.println(bookname+" "+booknumber);
		return bookname+" "+booknumber;
	}
	
}