package com.yedam.oper;

public class OverflowExample {
	public static void main(String[] args) {
		System.out.println(Integer.MIN_VALUE);
		// 2147483647, -2147483648
//		int result = safeAdd(2147483647,10);
//		int result = safeAdd(-2147483648,-10);
		int result = safeAdd(12121,10);
	}

		public static int safeAdd(int a, int b) {
			int sum=0;
			if(Integer.MAX_VALUE  -b <a ) { //양의 수로 범위가 벗어남
				//원래는if((Integer.MAX_VALUE  <a+b인데 잘못된 값 나와서 식을 -b <a로 바꿔줌 )
				System.out.println("유효값이 아닙니다");
				sum = 0;
			}else if((Integer.MIN_VALUE-b) >a) {
				System.out.println("음수 유효값이 아니당");
				System.out.println(sum);
				System.out.println(a);
				System.out.println(Integer.MIN_VALUE-b);
				
			}
			else {
				sum = a+b;
			}
			return sum;
		}
}
