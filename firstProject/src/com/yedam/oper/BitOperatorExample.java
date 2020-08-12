package com.yedam.oper;

public class BitOperatorExample {
	public static void main(String[] args) {
		int v1=10;
		int v2 = ~v1; // ~ : 비트연산 ,  1이면 0 0이면 1로 반전시키겠다
		System.out.println("v1 :" + v1);
		System.out.println("v2 :" + v2);
		System.out.println("v2 :" + (v2+1));
		
		byte b1 = 10;
		byte b2 =4;
		int b3 = b1+b2;
		int b4 = b1 % b2;
		
		int result = 10 / 4; //연산의 결과는2.5인데 앞에 값이 인수라 결과 2만나옴
		double result2 = 10/4;
		double result3 = 10/4.0;
		
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
	}
}
