package com.yedam.classes;

public class CalculatorExample {
	public static void main(String[] args) {
//		Calculator cal = new Calculator();
		//static 이라는 키워드를 붙이면 새 인스턴스 생성 없이도 해당 클래스의 함수를 호출가능
		
		
//		System.out.println("10+20 = " + cal.add(10, 20));
//		System.out.println("10.0+20.0 = " + cal.add(10.0, 20.0));
		
		System.out.println("10+20 = " + Calculator.add(10, 20));
		System.out.println("10.0+20.0 = " + Calculator.add(10.0, 20.0));
		double r1 = 3.5;
//		cal.getArea(r1);
//		
//		System.out.println(cal.getRectagle(4, 5));
//		
//		System.out.println(cal.test(4, 5));
		
		
		Calculator.getArea(r1);
		
		System.out.println(Calculator.getRectagle(4, 5));
		
		System.out.println(Calculator.test(4, 5));
	}
	
	
}
