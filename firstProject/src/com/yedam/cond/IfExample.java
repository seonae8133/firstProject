package com.yedam.cond;

public class IfExample {

	public static void main(String[] args) {
			int score =80;
			String grade = ""; //null
			
			if (score >= 90) {
				if(score>=95) {
				grade ="A+";
				}
				grade ="A";
			}  else if(score >= 80) {
				if(score >= 85) {
					grade ="B+";
				}
				grade ="B";
			} else if(score >= 70) {
				if(score>= 75) {
				grade ="C+";
				}
				grade ="C";
			} else {
				grade="D";
			}
			
			System.out.println("등급은" +grade +"입니다.");
	}
}
