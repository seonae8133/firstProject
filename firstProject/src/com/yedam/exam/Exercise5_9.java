package com.yedam.exam;

import java.util.Scanner;

public class Exercise5_9 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------");
			System.out.println("1.학생수 | 2. 점수입력 | 3. 점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------");
			System.out.println("번호선택해라");
			
		  int selectNo = scanner.nextInt();
		  
		  if(selectNo ==1) {
			  System.out.println("학생수 입력하세여");
			 studentNum =scanner.nextInt();
			  System.out.println("학생수는" +studentNum + "임");
			  scores =new int[studentNum];
		  }else if(selectNo == 2){
			  for(int i=0; i<scores.length; i++) {
				  System.out.println("scores["+i+"]>");			  
				  scores[i] = scanner.nextInt();
			  }
		  }else if(selectNo ==3) {
			  for(int i=0; i<scores.length; i++) {
				  System.out.println("scores ["+i+"] :" +scores[i]);
			  }
		  }else if(selectNo == 4) {
			  int max=0;
			  int sum =0;
			  int count = 0;
			  for(int i=0; i<scores.length; i++) {
				  if(max<scores[i]) {
					  max = scores[i] ;
				  }
				  sum += scores[i];
				  count++;
			  }
			  int avg =sum/count;
			  System.out.println("최대값 : " + max);
//			  System.out.println("총 합계 : " +sum);
			  System.out.println("평균점수 : "+avg);
//			  System.out.printf("평균점수%.2f : "+avg);
//			  System.out.println();
		  }else if(selectNo ==5) {
			  run = false;
		  }
		}
		System.out.println("그만하자");
	}
}
