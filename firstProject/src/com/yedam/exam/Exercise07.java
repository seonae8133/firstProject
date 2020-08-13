package com.yedam.exam;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		
		boolean run = true;
		
		int balance = 0; // 금액 저장하는 변수
		
		Scanner scanner =  new Scanner(System.in);//Scanner 객체에 값을 입력하면(System.in = 값 입력받는것) 입력한 값을 읽어와서scanner에 담음
		
		while(run) {
			System.out.println("-----------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------");
			System.out.println("사용 업무 선택> ");
			int menu = scanner.nextInt(); // 입력받은 메뉴 번호 1~4번중 하나를 읽어와서 menu라는 변수에 담음
			if(menu ==1) {
				System.out.println("예금금액 입력하세용");
				balance += scanner.nextInt(); //balance =balance + scanner.nextInt()
				System.out.println("현재금액은" +balance +"입니당");
			} else if (menu ==2) {//출금
				System.out.println("출금금액 입력하세용");
				balance -= scanner.nextInt(); 
				System.out.println("현재금액은" +balance +"입니당");
			} else if (menu==3) {//잔고
				System.out.println("잔액은 "+ balance);
			} else if(menu == 4) {//종료
			run = false; // while 문 값에 false가 오면, 더이상 문장 실행안하고 while문을 빠져나옴
			}
		}
		System.out.println("프로그램 종료");
	}	
}
