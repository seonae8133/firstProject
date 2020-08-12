package com.yedam.cond;

public class SwitchExample {
	public static void main(String[] args) {
		//double m =Math.random() *6;//0부터 1사이의 임의의수 만들어쥼 , 0부터 6사이의 임의의 실수 0 < m < 6
		//double m = (int)(Math.random() *6);
		int m = (int)(Math.random()*6)+1; // 0부터 6까지의 임의의 정수
		
		System.out.println(m);
		
		switch (m) {
		case 1 :
			System.out.println("1번나왔당");
			break;
		case 2:
			System.out.println("2번나옴");
			break;
		case 3 :
			System.out.println("3번나옴");
			break;
		case 4 :
			System.out.println("4번나옴");
			break;
		case 5 :
			System.out.println("5번나옴");
			break;
		case 6 :
			System.out.println("6번나옴");
		}
	}
}
