package com.yedam.cond;

public class WhileExample {

	public static void main(String[] args) {
		int i=0;
		int sum =0;
		
		while(i <10) {
			System.out.println(i);
				i++;
				sum=sum+i;
		}
		
		System.out.println("1~" + i + "까지 합"+ sum);
	}
}
