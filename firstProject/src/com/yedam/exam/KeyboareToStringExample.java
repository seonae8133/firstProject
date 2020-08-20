package com.yedam.exam;

import java.io.IOException;

public class KeyboareToStringExample {

	public static void main(String[] args) throws IOException {
		byte[] bytes = new byte[100];
		
		System.out.println("입력");
		
		int readByteNo = System.in.read(bytes);
		
		
//		System.out.println(bytes); //[B@7852e922
		String str = new String(bytes, 0, readByteNo-2);
		
	}
}
