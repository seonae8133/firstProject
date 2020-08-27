package com.yedam.test;

import java.util.function.IntBinaryOperator;

public class NewExample3 {
	public static void main(String[] args) {
		IntBinaryOperator ib = null;
		int result = cal(ib,10,20);
		System.out.println("cal 결과 :" +result);
	}
	
	public static int cal(IntBinaryOperator ib, int a, int b) {
		int result = ib.applyAsInt(a, b);
		return result;
	}
}
