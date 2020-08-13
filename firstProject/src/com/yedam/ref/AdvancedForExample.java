package com.yedam.ref;

import java.util.Scanner;

public class AdvancedForExample {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int[] scores = new int[5];
		
		for(int i=0 ; i<scores.length; i++) {
			System.out.println("점수입력해라 집가고싶다");
			scores[i] = scn.nextInt();
		}
		
//		int[] scores = {9,3,8,7,5};
		int sum = 0;
		double avg = 0;
		int maxValue = 0;
		
		for(int num : scores) {//배열에 들어있는 정수만큼만 반복
			sum += num;// sum = sum+num;
//			System.out.println(sum + ","+num);
		}
		avg = (double) sum / scores.length;
		System.out.println("합계점수다 : "+ sum + ", 평균이다 :" + avg+", 최고점수: "+ maxValue);
	}
}	