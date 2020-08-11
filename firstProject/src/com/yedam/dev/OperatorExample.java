package com.yedam.dev;

public class OperatorExample {
	public static void main(String[] args) {
		
		int val1 =10;
		int result = 3+(8-5) *4 +val1++;
		
		System.out.println(result);
		
		result = 10 % 7;
		System.out.println("나머지 :" + result);
		
		result = 10 / 7;
		System.out.println("나누기 :" + result);
		
		double r1 = 10 / 7;
		System.out.println("나누기2 :" + r1);
	
		double r2 = 10 / 7.0;
		System.out.println("나누기3 :" + r2);
		// 소수점으로 결과 뽑으려면 두개중 하나는 실수 타입숫자로 작성해줘야햄
		
		for (int i=1; i <= 10; i++) {
//			System.out.println(i);
			if(i % 2 == 1) {
					System.out.println(i + "는 홀수입니다");
			}else {
				System.out.println(i + "는 짝수임");
			}
		}
	}
}
