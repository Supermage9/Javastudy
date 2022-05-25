package study;


import java.io.*;

public class Test003 {

	public static void main(String[] args) throws IOException{

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int i,j,k;
		
		System.out.print("첫번째 정수 입력 :");
		i = Integer.parseInt(br.readLine());
		
		System.out.print("두번째 정수 입력 :");
		j = Integer.parseInt(br.readLine());
		
		System.out.print("세번째 정수 입력 :");
		k = Integer.parseInt(br.readLine());
		
		if (i>j) {
			i = i ^ j ;
			j = j ^ i ;
			i = i ^ j ;
			}
		
		if (i>k) {
			i = i ^ k ;
			k = k ^ i ;
			i = i ^ k ;
			}
		
		if (j>k) {
			j = j ^ k ;
			k = k ^ j ;
			j = j ^ k ;
		    }
		
		
		System.out.printf("%d,%d,%d",i,j,k);
		
		/*
		 * temp = b; // 두 정수의 자리를 바꾼다.
		 * b=c;
		 * c=temp;
		 */
		
		
		
}	
}
