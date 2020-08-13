package com.yedam.exam;

public class Exercise5_7 {
	public static void main(String[] args) {
		//배열의 항목에서 최댓값 구하기
		int max = 0;
		int[] arry = {1,5,3,8,2};
		
		for(int i=0; i<arry.length; i++) {
			if(arry[i]>max) {
				max = arry[i];
			}
	  }
		System.out.println("max: " + max);
		
	}
}
