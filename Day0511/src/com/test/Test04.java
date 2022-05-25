package com.test;


/*
 *  문]
 *     컴퓨터와 사용자 사이의 가위바위보 게임을 만드시오
 *     사용자가 먼저 3가지중 하나를 입력하고 실행함
 *     컴퓨터는 랜덤으로 하나를 선택하여 사용자와 비교
 *     누가 이겼는지 판단하고 사용자가 그만을 입력하면 게임 종료
 *     
 *     문자열 배열 선언
 *     
 *     컴퓨터가 내는 것을 랜덤하게 선택하기 위해서는
 *     int n = (int)(Math.random()*3);
 *     
 *     컴퓨터가 낸 것과 비교
 *     
 *     if(str[n].equals("바위"))
 * 
 */
import java.util.*;
public class Test04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		String[]str= {"가위","바위","보"};
//		String com,user;
		
//		while(true) {
//			System.out.print("가위 바위 보 :");
//			user=sc.next();
//			int ran = (int)(Math.random()*3);
//			
//			if(user.equals("가위")) {
//				if(str[ran].equals(user)) {
//					System.out.println("컴퓨터 : "+str[ran]+" 유저 :"+user);	
//					System.out.print("비겼습니다\n");		
//				}
//				if(str[ran].equals("바위")) {
//					System.out.println("컴퓨터 : "+str[ran]+" 유저 :"+user);
//					System.out.print("졌습니다\n");
//				}
//				if(str[ran].equals("보")) {
//					System.out.println("컴퓨터 : "+str[ran]+" 유저 :"+user);
//					System.out.print("이겼습니다\n");
//				}
//			}else if(user.equals("바위")) {
//				if(str[ran].equals("가위")) { 
//					System.out.println("컴퓨터 : "+str[ran]+" 유저 :"+user);
//					System.out.print("이겼습니다\n");
//				}
//				if(str[ran].equals("바위")) {
//					System.out.println("컴퓨터 : "+str[ran]+" 유저 :"+user);
//					System.out.print("비겼습니다\n");
//				}
//				if(str[ran].equals("보")) {
//					System.out.println("컴퓨터 : "+str[ran]+" 유저 :"+user);
//					System.out.print("졌습니다\n");
//				}
//			}else if(user.equals("보")) {
//				if(str[ran].equals("가위")) {
//					System.out.println("컴퓨터 : "+str[ran]+" 유저 :"+user);
//					System.out.print("졌습니다\n");
//				}
//				if(str[ran].equals("바위")) {
//					System.out.println("컴퓨터 : "+str[ran]+" 유저 :"+user);
//					System.out.print("이겼습니다\n");
//				}
//				if(str[ran].equals("보")) {
//					System.out.println("컴퓨터 : "+str[ran]+" 유저 :"+user);
//					System.out.print("비겼습니다\n");
//				}
//			}else {
//				break;
//			}
//			
//			
//		}
		
		String[]com= {"가위","바위","보"};
		
		System.out.println("가위바위보?");
		while(true) {
			System.out.print("가위바위보 :");
			String a = sc.next();
			if(a.equals("그만")) {
				System.out.println("게임을 종료합니다.");
				break;
			}
			int n = (int)(Math.random()*3);
			//0 1 2 중에서 결정된 정수를 리턴
			String b=com[n];
			System.out.print("사용자 : "+a+"컴퓨터 : "+b);
			if(a.equals("가위")) {
				if(b.equals("가위")) {
					System.out.println("비겼습니다.");
				}else if(b.equals("바위")){
					System.out.println("졌습니다.");
				}else {
					System.out.println("이겼습니다.");
				}
			}
			if(a.equals("바위")) {
				if(b.equals("가위")) {
					System.out.println("이겼습니다.");
				}else if(b.equals("바위")){
					System.out.println("비겼습니다.");
				}else {
					System.out.println("졌습니다.");
			    }
			}
			if(a.equals("보")) {
				if(b.equals("가위")) {
					System.out.println("졌습니다.");
				}else if(b.equals("바위")){
					System.out.println("이겼습니다.");
				}else {
					System.out.println("비겼습니다.");
				}
		    }
			
			
			
			
	
		}

	}

}
