package com.yedam.exam;

import java.util.Scanner;

public class eExample {
	public static void main(String[] args) {
	
		
		Scanner scanner = new Scanner(System.in);
		
		int[] intAry = new int[3];
		
		int temp = 0;
		
		for(int i=0; i < intAry.length; i++) {
			 intAry[i] = scanner.nextInt();
		    for(int j =1 ; j<3; j++) {
		    	if(intAry[i]<intAry[j]) {
		    		temp = intAry[i];
		    		intAry[i]=intAry[j];
		    	
		    	}
		    }	
			
		}
		
		for(int i=0; i < intAry.length; i++) {
			
			System.out.println(intAry[i]);		
		}
		
		
			 
		
		
}

		// 사용자 입력값 3개 받아서 작은수 -> 큰수 출력 (Scanner 클래스 활용)
	
	
	
	
	
}
