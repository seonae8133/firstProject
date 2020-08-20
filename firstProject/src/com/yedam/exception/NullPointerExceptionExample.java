package com.yedam.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		String str = "Hello";
		try {//예외가 발생할수 있는 구문
				System.out.println(str.toString());
		}catch(NullPointerException e) {
			System.out.println("Null 값을 참조하고 있습니다.");
		}catch(Exception e1) {
			System.out.println("알수없는 예외 발생");
		}
		
		
		int[] intAry = new int[5];
		
		for(int i=0; i<= 5; i++) {
			try {
			System.out.println("i의 값 : " + intAry[i]);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("배열범위 초과했음, 배열크기5인데 i의 6번째 때문에");
				System.out.println();
			}
		}
		
		Scanner scn = new Scanner(System.in);
		System.out.println("숫자 입력하세요");
		try {
		int num = scn.nextInt();
		}catch(InputMismatchException e2) {
			System.out.println("숫자값으로 다시 입력해");
		}
		
		System.out.println("정상종료.");//예외 발생하지 않았을때 출력

	}
}
