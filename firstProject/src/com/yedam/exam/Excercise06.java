package com.yedam.exam;

public class Excercise06 {
	public static void main(String[] args) {
		
		for(int i=1; i <=5; i++) {
			for(int j=1; i>=  j; j++) {
				System.out.print("*");
				}
			System.out.println("");
		}
		
		int j = 1;
		for (int i = 0; i<=j;i++) {
			System.out.print("*");
			
			if(i!=0) {
				System.out.println("*");
				j++;
			}
			System.out.println("");
		}
	
	}
}
