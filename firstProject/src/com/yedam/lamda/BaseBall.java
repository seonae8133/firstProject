package com.yedam.lamda;

public class BaseBall {
	public static void main(String[] args) {
		int[] numList = new int[3];
		int strike;
		int ball;
		int num=0;
	
		
		for(int i=0; i<numList.length; i++) {
			numList[i] = (int) ((Math.random()*9)+1);
			for(int j=0; i>j; j++) {
				if(numList[i]==numList[j]) {
					i--;
				}
			}
			
			
			
			System.out.println(numList[i]);
			
		}//for 
	}
}
