package com.yedam.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
	/*1) 학생이름, 수학점수, 영어점수를 입력받고 (3명)
		2) 수학평균, 영어 평균 계산하는 분석
		3) 수학 최고점수와 학생을 보는 최고점수
		4) 종료
		ArrayList 사용
		*/
		
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		List<Student> list = new ArrayList<Student>();
		
		while(run) {
			System.out.println("학생별 점수 계산기");
			System.out.println("1.점수입력 | 2.점수 분석| 3.수학통계 | 9.종료");
			System.out.println("번호 선택>");
			int selcNo = scn.nextInt();scn.nextLine();
			
			if(selcNo ==1) {
				System.out.println("학생이름 입력");
				String name = scn.nextLine();
				System.out.println("수학점수 입력");
				int math = scn.nextInt();scn.nextLine();
				System.out.println("영어점수 입력");
				int english = scn.nextInt();scn.nextLine();

				list.add(new Student(name,math,english));
				
				
				for(int i =0; i<list.size(); i++) {
					System.out.println(list.get(i).toString());
				}
				
			}else if(selcNo ==2) {
				int mathSum=0;
				int  englishSum = 0;
				
				for(int i =0; i<list.size(); i++) {
					mathSum += list.get(i).getMathScore();
					englishSum += list.get(i).getEngScore();
				}
				System.out.println("수학점수 평균 :" + (double)(mathSum/list.size())
					                        	+", 영어점수 평균" + (double)(englishSum/list.size()));
				
					
			}else if(selcNo ==3) {
				int max = 0;
				int num = 0;
				for(int i=0; i<list.size(); i++) {
					if(list.get(i).getMathScore() >max) {
						max =  list.get(i).getMathScore();
						 num = i;
						 
					}
				}
				System.out.println("수학 최고점수:" + list.get(num).getMathScore() + ", 최고 점수 학생 :" + list.get(num).getName());
				
			}else if(selcNo==9)
			run = false;
		
		}
		System.out.println("프로그램 종료");
		
		
}
}
