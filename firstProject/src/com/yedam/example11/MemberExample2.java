package com.yedam.example11;

public class MemberExample2{
	class Member  implements Cloneable{
		public String name;
		public int age;
		public int[] scores;
		public Car car;
		
		public Member(String name, int age, int[] scores, Car car) {
			this.name = name;
			this.age = age;
			this.scores = scores;
			this.car= car;
		}

		@Override
		protected Object clone() throws CloneNotSupportedException {
			//먼저 얕은 복사를 해서 name.age를 복제한다
			return super.clone();
		}
		
		
	
}		

	public static void main(String[] args) {
		
	}
}
