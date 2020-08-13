package com.yedam.dev;

public class MoriningCode13 {

		public static void main(String[] args) {
			
			
			
			int num = 0;
			for (int i=0; i<10; i++) {
				if(i%2 != 0) // 2로나눈 나머지가 0(짝수)이면 밑에 출력하고, 나머지가 0이 아니면(홀수)출력안함 
					continue;
				System.out.println(i);
			}
			
			
			int n = 0;
			while(true) {
				System.out.println("-----");
				System.out.println(n);
				if(n++ == 5)
					break;
				else if (n==3)
					continue;// 밑에 구문 실행안하고 다음으로 넘어감
				System.out.println("프로그램 진행중...");
			}
			
			
			
			
			int j=0;
			while(j<10) {
				int i= 0;
				while(i<10) {
				i++;
				}
			}
			
	/*		int sum =0;
			for(int j=0; j<5; j++) {
				for(int i=0; i<10; i++) {
				sum += i; //sum = sum + i
				System.out.println(i);
				}
			}
		*/	
			
			
			
			
			int score = 90;
			if(score >=90) {
				if(score >= 95)
				System.out.println("95 이상입니다.");
				else
					System.out.println("90이상입니다");
			}else if(score >= 80) {
				System.out.println("80 이상입니다");
			}else { // else 문에는 if 처럼 조건이 들어올수 없음
				System.out.println("80 미만입니다.");
			}
			
		}
}
