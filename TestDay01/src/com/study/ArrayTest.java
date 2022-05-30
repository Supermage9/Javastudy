package com.study;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		
		String names[] = {"홍길동","전우치","이도","세종대왕","이순신","강감찬","양만춘","공민왕"};
		
		Scanner sc = new Scanner(System.in);
		
		int index = -1;
		
		do {
			System.out.print("검색할 이름 입력 :");
			String name = sc.next();
			for(int i =0;i<names.length;i++) {
				//입력받은 이름과 배열에 저장되어 있는 이름이 같은지를 비교함.
				if(name.equals(names[i])) {
					index = i;
				}
			}
			if(index!= -1) { //찾았다.
				System.out.println(name+"은 배열의 "+index+"번째 입니다.");
				break;
			}else {
				System.out.println("해당 이름은 names 배열에 없습니다.");
			}
			
		}while(true);
		
		for(String s : names) {
			System.out.print(s+" ");
		}
	}

}
