package com.yedam.oper;

public class StringEqualExample {
	public static void main(String[] args) {
		int v1=20;
		int v2=30;
		if (v1 == v2) {
			System.out.println("기본타입 일 경우 비교");
		}
		
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello"); //new String을 했을때 같은 값이라도 주솟값이 다르기 때문에 str1 == str3 은 출력안됨
		
		if(str1==str2) {
			System.out.println("str1=str2 같은 문자이다1");
		}
		
		if(str1==str3) {
			System.out.println("str1=str3 같은 문자이다2");
		}
		
		if(str1.equals(str3)) { //equals 함수 : 문자열 비교 함수
			System.out.println("str1=str3 같은 문자이다3");
		}
		
		System.out.println((1==1)&&(2==2));
		System.out.println((1==1)&&(2==3));
		System.out.println((1==1)||(2==3));
	}
}
