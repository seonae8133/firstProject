package com.yedam.cond;

import java.io.IOException;

public class WhileExample2 {

	public static void main(String[] args) throws IOException {//시스템 리소스를 사용할때는 반드시 예외 처리 해야됨
		
		boolean run = true; // true는  while문 무한반복
		int num = 10;
		int keyCode = 0;
		
		while(run) {
			if(keyCode!=13 && keyCode!=10) {
				System.out.println("키 입력해주세욘");
				keyCode = System.in.read(); //사용자가 keyCode값을 입력하고 엔터치면 그 값을 변수에 담겠다.
				System.out.println(keyCode);
			}
//			System.out.println(keyCode);
			if(keyCode ==57) {
				run = false;
			}
//			System.out.println("num: " + num);
//			if(num-- == 0)
//				run = false;
////			break;
		}
			System.out.println("프로그램종료");
		
		
	}
}
