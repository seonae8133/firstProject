package com.yedam.classes;

import java.util.Calendar;

public class CalendarExample {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(); // 메모리 시작되는 시점에 날짜,시간 등 cal에 담아줌
		System.out.println(cal.get(Calendar.YEAR)); //2020-08-19
		System.out.println(cal.get(Calendar.MONTH)); //월이 0부터 시작해서 7은 8월임 / 월:0~11
		System.out.println(cal.get(Calendar.DATE));
		//
//		2020년 3월 1일의 년도, 월 ,요일 정보
		cal.set(2020, 2,1);
		System.out.println("현재월" + cal.get(Calendar.YEAR)); 
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		System.out.println(cal.get(Calendar.DATE));
		 
		 cal.set(2020,7,1);
		 
		 //2020년 8월 달력을 보여주세요
		 createCalender(2020,8);
	}
	

	public static void createCalender(int year, int month) {
		//2020년 8월달
		System.out.println(year+"년"+month+"월 달력입니다.");
		
		Calendar cal = Calendar.getInstance();
		 
	   System.out.println("  일   월   화   수   목   금   토");
	   int aDay ;
	   
	   if(month==1||month==3||month==5||month==7||month==8||month==10||month==12) {
		   aDay = 31;
		}else if(month==2) {
		   aDay = 29;
	   }else {
		   aDay = 30;
	   }
	   
	   


		for(int i=1; i<=31; i++) {
			System.out.printf("%3d",i);
			if(i%7 == 0) {
			System.out.println();
			}
	 	}
	
		
	}
}
