package com.vectorex;

import java.util.*;
public class VectorEx02 extends Vector{
	
	public VectorEx02() {
		
		super(1,1);
		
		
	}
	
	public void addInt(int i) {
		addElement(new Integer(i));
	}
	
	public void addFloat(float f) {
		addElement(new Float(f));
	}
	
	public void addString(String s) {
		addElement(s);
	}
	
	public void addCharArray(char a[]) {
		addElement(a);
	}
	
	public void write() {
		Object o;
		int length = size();
		System.out.println("Number of Vector elements is "+length+" and they are :");
		
		for(int i=0;i<length;i++) {
			o = elementAt(i);
			
			if(o instanceof char[]) {
				System.out.println(String.copyValueOf((char[]) o));
			}else {
				System.out.println(o.toString());
			}
			
		}
		
	}
	
	
	
	// Vector v = new Vector(); -> 빈 벡터 생성. 기본 크기 10.
	// Vector v = new Vector(7); -> 빈 벡터 생성. 기본 크기 7.
	// Vector v = new Vector(3,5); -> 3: 초기값설정, 5: 모자라면 5개 증가시켜라.
	
	
	

	public static void main(String[] args) {
		
		VectorEx02 v = new VectorEx02();
		
		int digit = 5;
		float real = 3.14f;
		char letters[]= {'J','A','V','A'};
		String s = new String("is Love");
		
		
		v.addInt(digit);
		v.addFloat(real);
		v.addString(s);
		v.addCharArray(letters);
		
		v.write();
		
		
		
		
		
		
	}

}
