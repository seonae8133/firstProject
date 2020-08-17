package com.yedam.classes;

public class Person {//클래스명 
	   // --------필드 -----------------
		String name;// 필드는 속성값 담당
		int age;
		
		
		//---------생성자---------------
		//생성자에 대한 정의가 따로 없으면 public Person(){} 같은 매개값이 없는 생성자를
//		 기본 생성자(default Constructor)를 호출한것임
		
		public Person() {//클래스 이름으로 기능담겠다는게 있으면 생성자임:매개값없는
			name = "anonymous";
			age = 10;
		}
		//생성자 오버로딩 : 같은 이름에 매개값을 다르게 중복해서 사용하는것
		//person(매개값1), person(매개값1,매개값2)
		 public Person(String name) {//매개값있는 생성자
		  this.name = name; // 위에 필드에 있는  name필드에 파라미터 name값을 넣음
	  }//**this는 해당 클래스인 Person을뜻함
		
	  public Person(String name, int age) {
		  this.name = name;
		  this.age = age;
	  }
		
		
		//---------메소드------------------
		public String introduce() { // 메소드는 기능당담
			return "이름은" + name + "나이는 " + age;
		}
		public String getName() {
				return name; // 값을 반환해주겠다
		}

		public void setName(String name) {// void : 반환값 없는것
			this.name = name; // 매개값으로 반환되는 name을 필드에name으로 지정하겠다
	}
			
		public int getAge() {
			return age;
	}		
	
		public void setAge(int age) {
			this.age = age;
	}
	
}
