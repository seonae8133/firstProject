package com.yedam.test;

public class Example5 {

	public static void main(String[] args) {
		nvl(null,"초기값");
		nvl("입력값","초기값");
	}
	
	public static void nvl(String str1, String defaultValue) {
//		System.out.println((str1==null)? defaultValue :str1);
		if(str1 == null) {
			System.out.println(defaultValue);
		} else if (defaultValue != null) {
			System.out.println(str1);
		}
	}
}
 