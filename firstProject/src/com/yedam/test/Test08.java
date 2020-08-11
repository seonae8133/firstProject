package com.yedam.test;

public class Test08 {
	public static void main(String[] args) {
		byte byteValue = 10;
		float floatValue = 2.5F;
		double doubleValue = 2.5;
		
		byte result1 = (byte) (byteValue + byteValue); //정수 연산하게 되면 기본적으로  int됨
		int result2 = 5+ byteValue;
		float result3 = 5+floatValue;
		double result4 = 5 + doubleValue;
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}
}
