package com.yedam.classes;

public class Calculator {
	static double pi = 3.14;
	
	//가로,세로 값을 매개값으로 받아서 , 넓이를 반환해주는 메소드(getRectagle)
	
	public static String getRectagle(int a, int b) {
		int sum = 0;
		sum = a * b;
		return "가로"+a+"세로"+b+"의 넓이는"+sum;
		
	}
	
	public static int  test(int a, int b) {
		int sum = 0;
		sum = a * b;
		return sum ;
	}
	
	public static int add(int x, int y) {
		int sum = 0;
		sum = x + y;
		return sum;
	}
	
	public static double add(double x, double y) {
		return x + y;
	}
	
	
	public static void getArea(double a) {//매개값은 있는데 반환 타입은 없음
		double result = pi * a * a;
		System.out.println("반지름" + a + "의 넓이는 " +result);
	}
}
