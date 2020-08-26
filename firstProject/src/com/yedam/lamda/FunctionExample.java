package com.yedam.lamda;

import java.util.function.Function;

public class FunctionExample {
	public static void main(String[] args) {
		Function<String,String> func1 = (str) -> {
			return str + "is nothing";
		};
		String result = func1.apply("something");
		System.out.println(result);
		
		
		Function<String,Integer> func2 = (str) -> {
			return str.length();
		};
		int len = func2.apply("Hello");
	}
	

	
}
