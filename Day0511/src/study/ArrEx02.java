package study;


//Arrays.toString()
//toString() : 배열의 모든 요소[첫번째 요소,~]의 값들을 문자열 형식으로 만들어서 반환함

import java.util.*;
public class ArrEx02 {

	public static void main(String[] args) {
		
		int[]iArr1 = new int[10];
		int[]iArr2 = new int[6];
		int[]iArr3 = new int[] {100,95,80,70,60};
		int[]iArr4 = {100,95,80,70,60};
		
		char[] chArr = {'a','b','c','d'};
		
		//iArr1의 배열에 1~10까지 순서대로 저장함
		for(int i=0;i<iArr1.length;i++) {
			iArr1[i]=i+1;
			System.out.print(iArr1[i]+"  ");
		}
		System.out.println();
		
		for(int i=0;i<iArr2.length;i++) {
			iArr2[i]=(int)(Math.random()*45)+1;
			System.out.print(iArr2[i]+"  ");
		}
		
		System.out.println();
		
		for(int i=0;i<iArr3.length;i++) {
			System.out.print(iArr3[i]+"  ");
		}
		
		System.out.println();
		
		for(int i=0;i<iArr4.length;i++) {
			System.out.print(iArr4[i]+"  ");
		}
		System.out.println();
		
		System.out.println(Arrays.toString(iArr2));
		
		System.out.println();
		
		System.out.println(chArr);
		
		
		
		
	}

}
