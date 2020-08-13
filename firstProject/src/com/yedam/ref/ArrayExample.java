package com.yedam.ref;

public class ArrayExample {
	public static void main(String[] args) {
		int score1 = 10, score2 = 20, score3 =30, score4=40;
		score2 = 50;
		int sum = score1+score2+score3+score4;
		
		int[] intAry = {10,20,30,40,60,70,80};
		sum = intAry[0] + intAry[1]+intAry[2]+intAry[3];
		intAry[1] = 50;
		System.out.println(sum);
		
//		sum = intAry[0] + intAry[1]+intAry[2]+intAry[3];
//		System.out.println(sum);
		
		
		
		
		sum=0;
		for (int i = 0; i <intAry.length ; i++) {
			System.out.println(intAry[i]);
			sum = sum +intAry[i];
		}
		System.out.println("sum : " + sum);

		double[] dAry = {2.4, 4.3};
		String[] sAry = {"hello","world","java"};
		
		for (int i = 0; i <sAry.length; i++) {
			System.out.println(sAry[i]);
		}
		
		double[] scoreAry = new double[5];// int scoreAry 에 정수형 5자리 배열을 담겠다.
		for (int i=0; i < scoreAry.length; i++) {
			System.out.println(scoreAry[i]);
		}
		
		
		String[] scoreAry1 = new String[5];// String 은 배열초기값  null
		for (int i=0; i < scoreAry1.length; i++) {
			System.out.println(scoreAry1[i]);
		}
		scoreAry1[0] = "one";
		scoreAry1[1] = "two";
		scoreAry1[2] = "three";
		for (int i=0; i < scoreAry1.length; i++) {
			System.out.println(scoreAry1[i]);
		}
		
		int [] mathAry;
		mathAry=new int[]{1,2,3,4};// 앞에 변수이름 선언하고 변수에다가 초기값을 줄때에는 new+변수데이터타입+{초기값}
		
	}
}
