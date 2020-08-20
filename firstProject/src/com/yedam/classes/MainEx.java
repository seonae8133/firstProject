package com.yedam.classes;

final class FinalClass{
	
}
//class ExtendClass extends FinalClass {
//	FinalClass는 final 붙어서 다른 클래스에서 상속도 불가
//}

//class ExString extends String {
//	
//}
public class MainEx {

		final int age=10;
		
		public static void main(String[] args) {
			Friend fr = new Friend(); //인스턴스
			fr.getsetfdAge(); //인스턴스 메소드
			
//			Calculator cal = new Calculator();
//			cal.add(10,10);
			
			Calculator.add(10, 10); //정적메소드(static)이 붙으면 클래스가 로딩되는 시점에 메소드 이름붙여 기능 사용 가능
				// 인스턴스 멤버, 정적멤버
			
			final int val = 10; // final이 변수에 붙으면 변수의 값을 다시 재정의 할수 없음
//			var2 =20; (변경 불가)
			
			MainEx ex = new MainEx();
//			ex.age = 20; (final 붙어서 변경 불가)
			
		}
		
}
