package com.yedam.classes;

import java.util.Scanner;

public class Address {
	public static void main(String[] args) {
		
		boolean selc = true;
		Scanner scan = new Scanner(System.in);
		String in1;
		int in2;
		String in3;
		
		Friend[] fdAry = new Friend[2];
		
		while(selc) {
			System.out.println("-----친구 주소 관리 ver1.0----");
			System.out.println("1.정보입력 | 2. 리스트 | 9.종료");
			System.out.println("번호선택");
			
			int selcNo = scan.nextInt();
			
			if(selcNo == 1) {
				
				for(int i =0; i<2; i++ ) {
				System.out.println(" 이름을 입력하시오:");
				in1 = scan.next();
				System.out.println(" 나이를 입력하시오:");
				in2 = scan.nextInt();
				System.out.println(" 전화번호를 입력하시오:");
				in3 = scan.next();
				
				Friend fd = new Friend(in1,in2,in3);
				fdAry[i] = fd;
				}
			} else if (selcNo == 2) {
					System.out.println("----리스트------");
					for(int i=0; i<fdAry.length; i++) {
						System.out.println(i + "=" + fdAry[i]);
					}
					
					
					
				}
//				Friend a=new Friend();
//				a.setfdName(scan.nextLine());
//				System.out.println(a.getfdName());
//				
				
			
				
//				System.out.println("친구 나이를 입력하세요");
//				a.setfdAge(scan.nextInt());
//				System.out.println("친구 전화번호를 입력하세요");
//				a.setfdPone(scan.nextLine());
//				System.out.println(a.fdAll());
			}
			else if(selcNo == 9) {
				selc = false;
			}
			
		}
		
		
		
	}
}
