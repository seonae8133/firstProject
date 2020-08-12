package com.yedam.dev;

public class MorningCode {

	public static void main(String[] args) {
			String str1 ="Hello";
			String str2 ="World";
			String name ="손애";
			System.out.println(str1 + " , " +str2);
			System.out.println(str1 + " , " +name);
	
			int v1 = 150, v2 = 270;
			int result = add(v1,v2);
			int result1 = minus(v1,v2);
			System.out.println("결과값 : " + result);
			
			introduce("선애");
			//함수를 호출하려면  string type의 매개값이 괄호 안에 들어가야됨
	
				
				 
				System.out.println("결과는" + result1);
	}
	
	public static int minus(int a,int b) {
		int minusSum = a-b;
		return minusSum;
	}
	
	public static void introduce(String name) {
//		System.out.println("나는 문소내당");
		System.out.println("안녕. 저는 "+ name +"입니다");
	}
	//void : 반환되는 값이 없고 이 메소드 안에서 다 처리하겠다는 뜻
	//introduce() :매개값이 없음
	
	public static int add(int x , int y) { //add method 매개값 : 실행할 값 / 정수형 타입 받고 결과를 리턴해주겠다
		int sum = x + y;
		return sum;
	}
}
