package com.yedam.test;

public class test992 {
	public static void main(String[] args) {
		
		multiTable(3,5);
//		int num = 2;
//		for (; num <= 9; num++) {
//			multiTable(num);
//		}
		multiTable2(1,3);
		
	}
	
	public static void multiTable(int a, int  b) {
		for(int i=a; i<=b; i++) {
			for(int j=1;j<10; j++) {
				System.out.println(i+"x" + j + "=" + (i*j));
			}
		}
		
	}
	
	
	
	public static void multiTable2(int a, int  b) {
		for(int i=a; i<=9; i++) {
			for(int j=1;j<=b; j++) {
				System.out.println(i+"x" + j + "=" + (i*j));
			}
		}
		
	}
	
	public static void multiTable(int a) {
		int num1 =a;
		
		for (int i=1; i<10; i++) {
			System.out.println(num1 + "*" + i + "=" + (num1*i));
		}
	}
	
	
	
	
	public static void multiTable() {
		int num1 =2;
		for (int i=1; i<10; i++) {
			System.out.println(num1 + "*" + i + "=" + (num1*i));
		}
			
		
		
	}
}
