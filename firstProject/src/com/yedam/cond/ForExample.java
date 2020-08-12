package com.yedam.cond;

public class ForExample {
	public static void main(String[] args) {
	
		int sum = 0;
		
		sum = sum +1;
		sum = sum +1;
		sum = sum +1;
		sum+=1; //sum++
		
		System.out.println("결과는"+sum);
		
		sum =0;
		for (int a=0; a <3; a++) {
			sum = sum+1;
		}
		sum +=1;
		
		sum =0;
		for(int a=3; a >0; a--) {
			sum = sum +1;
		}
		System.out.println("최종결과는" + sum);
		
		sum=0;
		for (int i=1; i <= 9; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}
}
