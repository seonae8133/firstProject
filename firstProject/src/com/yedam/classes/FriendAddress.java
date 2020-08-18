package com.yedam.classes;

import java.util.Scanner;

public class FriendAddress {
	static Scanner scn = new Scanner(System.in); // scn 을 밑에 다른 함수에서도 쓸수 있게 클래스영역에 지정
	static Friend2[] friends = new Friend2[100]; //자식클래스 com.univ 모두 담을수 있음
	
	public static void main(String[] args) {
		
	
		
		while(true) {
			System.out.println("---------------------------");
			System.out.println("1. 학교친구 | 2. 회사친구 | 3.동네친구 | 4.리스트 | 9.종료");
			System.out.println("---------------------------");
			System.out.println("선택> ");
			int selNo = scn.nextInt();scn.nextLine();
			if(selNo == 1) {
				 addUnivFriend();
				 
			} else if(selNo == 2) {
				 addComFriend();
				 
			} else if(selNo == 3) {
				
				addFriend();
			}else if(selNo == 4) {
				friendList();
				
			}else if(selNo == 9) {
				
				break;
			}
		}
		System.out.println("프로그램종료.");
		
	}//end of main()
	
	public static void friendList() {
		for(Friend2 friend : friends) {
			if(friend != null)
			System.out.println(friend.toString());
		}
	}
	
	
	//회사친구 등록 메소드
	public static void addComFriend() {
		System.out.println("회사친구 등록하기");
		   System.out.println(" 이름 :");
		   String name = scn.nextLine();
		   System.out.println("연락처 :");
		   String phone = scn.nextLine();
		   System.out.println("회사명 :");
		   String comName = scn.nextLine();
		  
		   
		   ComFriend friend = new  ComFriend();
		   friend.setName(name);
		   friend.setPhone(phone);
		   friend.setComName(comName);
		  
		   
		   for(int i=0; i<friends.length; i++) {
			   if(friends[i] == null) {
				   friends[i] = friend;
				   break;
			   }
		   }
		   System.out.println("입력완료");
		
	}
	//학교친구등록 메소드.
	public static void addUnivFriend() {
		System.out.println("학교친구 등록하기");
	   System.out.println("학교친구 이름 :");
	   String name = scn.nextLine();
	   System.out.println("학교친구 연락처 :");
	   String phone = scn.nextLine();
	   System.out.println("학교친구 전공명 :");
	   String major = scn.nextLine();
	   
	   UnivFriend friend = new UnivFriend();
	   
	   friend.setName(name);
	   friend.setPhone(phone);
	   friend.setMajor(major);
	   
	   for(int i=0; i<friends.length; i++) {
		   if(friends[i] == null) {
			   friends[i] = friend;
			   break;
		   }
	   }
	   System.out.println("입력완료");
	}
	
	
	//동네친구 등록 메소드
	public static void addFriend() {
		System.out.println("동네친구 등록하기");
		   System.out.println("이름 :");
		   String name = scn.nextLine();
		   System.out.println("나이 :");
		   int age = scn.nextInt();
		   System.out.println("연락처 :");
		   String phone = scn.nextLine();
		  
	
		   
		   Friend2 friend = new  Friend2();
		   
		   
		   friend.setName(name);
		   friend.setAge(age);
		   friend.setPhone(phone);
		  
		   
		   for(int i=0; i<friends.length; i++) {
			   if(friends[i] == null) {
				   friends[i] = friend;
				   break;
			   }
		   }
		   System.out.println("입력완료");
		
	}
	
}
