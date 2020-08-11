package com.yedam.dev;

public class BooleanExample {

	public static void main(String[] args) {
		long l1 = 10L;
		int i1=10;
		
		boolean trueOrFalse= false;
		
		trueOrFalse = l1 == i1; //=는 대입연산자 ==는 같다
//		trueOrFalse = l1 != i1;
				if(trueOrFalse) { 
			System.out.println("이내용은 참일 경우에 출력됩니다.,");
//			위에 boolean trueOrFalse이 false 이기 때문에 출력안됨
		}
		
//		if (l1 == i1) {
//			System.out.println("참일때 출력됨");
//		}
				
				if(l1 >= i1) {
					System.out.println("왼쪽이 크거나 같다.");
				} 
				
		System.out.println(trueOrFalse);
	}
}
