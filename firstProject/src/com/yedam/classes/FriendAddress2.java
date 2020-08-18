package com.yedam.classes;

import java.util.Scanner;

public class FriendAddress2 {

	static Friend2[] friend1 =new Friend2[100];
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("----------------");
			System.out.println("1.학교친구 | 2.회사친구 | 3. 동네친구 | 4.리스트 | 9.종료");
			System.out.println("----------------");
			System.out.println("선택> ");
			int selcNo = scan.nextInt();
			if(selcNo == 1) {
				System.out.println("학교친구 정보 입력");
				friendList();
			}
		}
	}
	
	public static void friendList() {
		for(Friend2 fd : friend1) {
			if(fd != null) {
				System.out.println(fd.toString());
				
			}
		}
		
	}
	
	
	//회사친구 등록 메소드
	public static void addComFriend() {
		
		
	}
	//학교친구등록 메소드.
	public static void addUnivFriend() {
		
	}
	
	
	//동네친구 등록 메소드
	public static void addFriend() {
		
		
	}
}
