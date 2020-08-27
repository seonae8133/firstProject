package com.yedam.example11;

import java.util.Objects;

public class NullExample {
	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = null;
		
		System.out.println(Objects.requireNonNull("str1이 null이아닐때 obj 반환 : object = " +str1));
	
		try {
			String name = Objects.requireNonNull(str2);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
		
		System.out.println("--------------------------------");
		try{
			String name = Objects.requireNonNull(str2,"이름이 없습니다.");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	
	
	
	}
}
