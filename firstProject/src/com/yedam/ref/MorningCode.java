package com.yedam.ref;

public class MorningCode {
	public static void main(String[] args) {
		double[] dAry = new double[5];
		dAry[0] = 1.2;
		
		for (int i=0; i<5; i++) {
			System.out.println(dAry[i]);
		}
		
		int[][] iAry = new int[5][3];
		int num1 = 1;
		
		for(int i =0; i<5; i++) {
			for(int j=0; j<5; j++) {
				iAry[i][j] = num1++;
			}
		}
		
		
		int result = iAry[0][0]; // int result = iAry[0] 은 입력x , 위에서 2차원배열로 정의해서 iAray[0]으로하면 정수가 아니라 인덱스로 인식함
	}
}

