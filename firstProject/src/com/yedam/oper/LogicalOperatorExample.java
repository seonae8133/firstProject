package com.yedam.oper;

public class LogicalOperatorExample {
	public static void main(String[] args) {
		int charCode = 'A'; //A=65
		
		if(charCode >= 65 & charCode <= 90){
			System.out.println("대문자입니다");
		}
		
		int num1 = 10;
		int num2 =20;
		if(num1++ < 10 && num2++ > 20) { //&&연산자 앞에서 식 검사할때 ++되는데, 그값이 거짓일때는 뒤에 식까지 검사 안하고 if문빠져나옴
			System.out.println("참이다");
		}
		
//		if(num1++ < 10 || num2++ > 20) {
//			System.out.println("참이다2");
//		}
		
		System.out.println(num1 +"," + num2);
		
		int a = 10, b=11;
		int result = a&b;
		int result2 = a|b;
		System.out.println("논리곱결과 :" + result);
		System.out.println("논리곱결과 :" + result2);
		
		result2 = a <<2;
		System.out.println("비트이동결과 :"+ result2);
		
		 result = 30 << 3;
		 System.out.println("비트이동결과: " + result); //result =240 ,
		 
		 result += 30; // 복합대입연산자 result = result + 30;
		 
		 result = 80;
		 boolean pass = false;
		 
		 /* if(result > 80) {
			 pass =true;
		 } else {
			 pass = false;
		 }
		*/
				pass =(result>=80) ? true : false; //앞읙값은 참일경우의 값, 뒤는 아닐때의 값
	}
}
