package com.yedam.test;



//com.yedam.test.Math
class Math {
	
	public static int max(int a, int b) { //static : 클래스를 읽어오면서 static되어있으면 클래스를 읽어올때 max라는 메소드도 같이 실행가능하도록 메모리에 올림 (그럼 메인에서 인스턴스 생성 안해도 클래스 이름으로 사용가능)
		int result = (a >= b) ? a : b;
		return result;
	}
	
	public static int min(int a, int b) {
		int result1 = (a >b) ? b: a;
		return result1;
	}
	
	public static double min(double a, double b) {
		double result1 = (a >b) ? b: a;
		return result1;
	}
	
	
	
}
public class NewExample {
	public static void main(String[] args) {
	
//	   Math math = new Math();
	   int result = Math.max(10, 5); // Math 클래스 자체가 static 이라서 인스턴스 생성없이 클래스이름.함수로 지정가능.
	   System.out.println("큰 수는: " + result);
	   int result1 = Math.min(39, 25);
	   System.out.println("작은 수는: " + result1);
//	  result1 = Math.min(24.6, 3.8);
	   System.out.println("작은 수는: " + result1);
	}
	
	

}
