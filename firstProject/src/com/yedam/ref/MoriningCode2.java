package com.yedam.ref;

public class MoriningCode2 {
	public static void main(String[] args) {
		
		int[][]iAray = new int[5][5];
		int sum = 1;
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				iAray[j][i] = sum++;
				System.out.printf("%3d", iAray[i][j]);
			}
			System.out.println();
		}
			
		}
	}

