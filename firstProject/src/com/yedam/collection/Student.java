package com.yedam.collection;

public class Student implements Comparable<Student> {
		//----------필드----------
		private String name;
		private int mathScore;
		private int engScore;
		//----------기본생성자----------		
		public Student(String name, int mathScore, int engScore) {
			super();
			this.name = name;
			this.mathScore = mathScore;
			this.engScore = engScore;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getMathScore() {
			return mathScore;
		}

		public void setMathScore(int mathScore) {
			this.mathScore = mathScore;
		}

		public int getEngScore() {
			return engScore;
		}

		public void setEngScore(int engScore) {
			this.engScore = engScore;
		}

		@Override
		public String toString() {
			return "학생정보 : 이름 =" + name + ", 수학점수 =" + mathScore + ",영어점수 =" + engScore;
		}

		@Override
		public int compareTo(Student o) {//Comparable가 가지고 있는 추상메소드를 반드시 구현해줘야함

			return this.mathScore-o.mathScore;
		}
		
		
		
}
