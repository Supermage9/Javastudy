package com.study;

class House{
	
	int price;
	int size;
	String dong;
	String kind;
	
	public House() { //기본생성자
		this(100,32,"상계동","아파트");
		
	} 
	public House(int price) { // 생성자 오버로딩
		this(price,32,"상계동","아파트");
	} 
	public House(int price,int size) {
		this(price,size,"상계동","아파트");
	} 
	public House(int price,int size,String dong) {
		this(price,size,dong,"아파트");
	} 
	public House(int price,int size,String dong,String kind) {
		//초기작업
		this.price = price;
		this.size = size;
		this.dong = dong;
		this.kind = kind;
	} 
	
}






public class ThisconstructorExam {

	public static void main(String[] args) {
		
		House h1 = new House();
		House h2 = new House(300);
		House h3 = new House(300,40);
		House h4 = new House(300,40,"서초동");
		House h5 = new House(300,40,"서초동","빌라");
		
		System.out.println(h1.price+","+h1.size+","+h1.dong+","+h1.kind);
		System.out.println(h2.price+","+h2.size+","+h2.dong+","+h2.kind);
		System.out.println(h3.price+","+h3.size+","+h3.dong+","+h3.kind);
		System.out.println(h4.price+","+h4.size+","+h4.dong+","+h4.kind);
		System.out.println(h5.price+","+h5.size+","+h5.dong+","+h5.kind);

	}

}
