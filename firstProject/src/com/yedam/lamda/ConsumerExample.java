package com.yedam.lamda;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExample {
	public static void main(String[] args) {
		
		Consumer<String>consumer =(a) -> {
				System.out.println(a + "님 반갑습니다.");
	
		};
		consumer.accept("최령준몽총이");
		
		BiConsumer<String, String> biCon =(a,b) -> {
			System.out.println(a+"은" + b);
		};
		biCon.accept("최령준", "바보다");
		
		
		BiConsumer<Integer,Integer> biInt = (a,b) -> {
			System.out.println(a + "*" + b + "=" +(a*b));
		};
		biInt.accept(24, 5);
}
}
