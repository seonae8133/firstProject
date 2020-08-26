package com.yedam.collection;

public class Person implements Comparable<Person>{

		String name;
		int age;
		
		public Person(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}

		@Override //  implements Comparable구문이 들어가면 @Override해줘야함
		
		public int compareTo(Person o) { //return type = int
//			return o.age - this.age; // 양수가 나오면 내림차순.
			return this.age - o.age; //음수가 나오면 오름차순, (앞에있는 값이 뒤에있는 값보다 작으면 음수) /
		}
		
		
		
}
