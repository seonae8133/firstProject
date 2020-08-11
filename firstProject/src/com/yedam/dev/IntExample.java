package com.yedam.dev;

public class IntExample {
	public static void main (String[] args) {
		int var1 = 10;   //십진수 10
		int var2 = 012; //앞에 0붙이면 8진수/ 8진수 12 => 10
		int var3 = 0xA; //뒤에 x붙으면 16진수 16진수 A -> 10
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		
		byte b1 =10;
		//byte result = b1 + 10;
		//int result = b1 + 10;
		int result =(byte)( b1 + 10);
		//정수타입은 연산하면 연산자 좌우의 값들을 int타입을 대상으로함.
		// 작은 범위의 byte값을 int에 넣는건 오류 안남, 반대로 int 를byte에 넣으려고 하면 에러뜸/ 연산자 좌우 데이터 타입 같아야함
		
		
		
	}

}
