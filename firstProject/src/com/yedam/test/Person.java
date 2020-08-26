package com.yedam.test;

public class Person {
	public String name;
	public int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public int hashCode() {
		return this.age;
//		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		Person p = (Person) obj;
		return this.age==p.age;
	}
	
	
	
}
