package com.yedam.dev;

public class VariableTest {
	public static void main (String[] agrs) {
		
		int b=0;
		int sum =0;
		
		for (int i=0; i<10; i++) {
			
			b=b + 1;
			sum = sum + b;
			System.out.println("sum =" + sum +",b=" +b);
		
			}
	
		System.out.println("합계:" +sum);
	}
	
}
