package com.yedam.exam;

import java.util.Scanner;

public class People {
	
	public static void showGender(String str) {
		String[] sp = {"*","/","-"};
		String newStr = str;
		
	}
	
	public static void main(String[] args) {
	/*990205-123456
		010205 / 3234567
		980205*2234567
		0102054834567
		*/
		
		String str1 = "010102-345678";
		System.out.println(str1.replace("-","").charAt(6));
		String str2 = "010102-345678";
		System.out.println(str2.replace("-","").charAt(6));
		
		if(str1.replace("-","").charAt(6)=='3') {
			System.out.println("남자");
		}
	}
	
	
	
}