package com.yedam.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.yedam.collection.Student;

public class CourseMain {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		List<Student> list = new ArrayList<Student>();
		
		while(run) {
			System.out.println("학생관리");
			System.out.println("1.과정등록 | 2.학생등록 | 3.과정별 학생정보");
			int selNo = scn.nextInt();scn.nextLine();
			
			if(selNo == 1) {
				System.out.println("학생과정 등록");
				
			}
		}
	}
}
