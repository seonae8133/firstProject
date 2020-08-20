package com.yedam.abstracts;

public class Dog extends Animal{

	@Override
	public void sound() {
		System.out.println("커엌오컹"); //부모클래스 추상 메소드는 반드시 자식 클래스에서 재정의 되어야함
		
	}

	
}
