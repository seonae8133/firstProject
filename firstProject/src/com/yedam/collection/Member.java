package com.yedam.collection;

public class Member {
	
	//----필드---------------
	private String name;
	private int age;
	
	//---생성자--------------
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public int hashCode() {
		return this.name.hashCode();	
//		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Member mem = (Member) obj;
		return this.name.equals(mem.name);
//		return super.equals(obj);
	}
	
	
	
}
