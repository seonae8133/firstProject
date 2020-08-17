package com.yedam.classes;

import java.util.Scanner;

public class Address2 {
	
	public static void main(String[] args) {
		
//		Friend2 [] friends =null; // 값은 할당안되고 생성만 해둠
		Friend2 [] friends = new Friend2[100];
		Scanner scn = new Scanner(System.in); //사용자 입력값 읽어오는 System.in
		boolean run =true;
		
		while(run) {
			
			System.out.println("-----------------------------");
			System.out.println("1.정보입력(이름,나이,전화번호) | 2. 리스트 | 9.종료");
			System.out.println("-----------------------------");
			System.out.println("선택> ");
			int selectNo = scn.nextInt();scn.nextLine(); 
			
			if(selectNo == 1) {
				System.out.print("이름 입력> ");
				String name = scn.nextLine(); 
				System.out.print("나이 입력> ");
				int age = scn.nextInt();scn.nextLine(); 
				System.out.print("전화번호 입력> ");
				String phone = scn.nextLine();//입력받아서 그 값을 반환해주는 nextLine
				
				Friend2 f = new Friend2(name,age,phone);
				
				
				for(int i=0; i<friends.length; i++) {
					if(friends[i]==null) {//클래스 배열의 경우 null이 초기화값임
						friends[i] =f; //초기값인 null을if문에서 체크하고, 하나만 입력하고
						break; // 빠져나오기
					}
					friends[i]=f;
				}
				
			} else if(selectNo ==2) {
				for(Friend2 frnd : friends) {
					if(frnd != null) {
						System.out.println("이름 :" + frnd.getName() 
						+ "나이 : " + frnd.getAge() + "전화번호 :" +frnd.getPhone());
					}
				}
				/*
				 * for(int i=0; i<friends.length;i++) {
					if(firends[i] != null) {
						System.out.println("이름 :" + frnd.getName() 
						+ "나이 : " + frnd.getAge() + "전화번호 :" +frnd.getPhone());
					}
				}
				 */
				
			} else if(selectNo == 9) {
				run = false;						
			}
		}
		
		System.out.println("프로그램 종료.");
		
		
		
		
	}
}
