package com.yedam.dev;
// 2020-08-11(화)수업
/*
com.yedam.dev.CharExample
*/
public class CharExample {

	public static void main(String[] args) {
//		char c1 =44032;
//
//		for(int i=0; i<26; i++) {
//			System.out.print(c1++ + "\t"); // 줄바꿈 없이 출력
//			//65에 해당되는 unicode값 = A
//		}
//		
//		char c2 = 'A';
//		System.out.println((int)c2);
//		System.out.println((byte)c2);
//		System.out.println((double)c2);
//		System.out.println((short)c2);
////		데이터 형 변환 ((int)변수)
//		
		char c2 = '가'; // 가의 숫자는 44032임
		System.out.println((int) c2);
		System.out.println((short) c2);
		System.out.println((byte) c2); // byte범위 벗어나서 0으로 값 반환
		
		
	}
}
