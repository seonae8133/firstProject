package com.yedam.lamda;
//함수적 인터페이스(functional Interface)

	interface MyFunctionalInterface {
		public void run();//추상메소드 (abstract method)
	}
	
	class MyFuncClass implements MyFunctionalInterface {

		@Override
		public void run() {
			System.out.println("ruuuuunn");
			
		}
		
	}
	public class LamdaExample {
	public static void main(String[] args) {
		MyFunctionalInterface myintf =() -> 
							{System.out.println("runn.");
		};
		myintf.run();
		
		showContent sc =(content) -> {
				System.out.println("내용은" + content + "입니다.");
			};
		sc.show("바나나");
		
		showContent sc2 = (content) -> {
			System.out.println("this is"+content);};
		sc2.show("바나나");
		
		Calculate cal =(a, b) -> a+b;
		cal.sum(10, 5);
	}
}

