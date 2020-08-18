package com.yedam.classes;

public class Friend2 {
	//필드
	private String name;// private를 선언하면 외부의 클래스에서는 해당 name을 사용못함
	private int age;
	private String phone;
	
	//생성자 오버로딩 : 매개변수의 !!데이터타입!! 이달라야함, 또는 갯수가 다르거나
	// 같은 타입으로 3개 만들면 안됨
	public Friend2(String name, int  age, String phone) {
		this.name =name;
		this.age = age;
		this.phone = phone;
	}

	public Friend2() {
		
	}
	//메소드
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	@Override
	public String toString() {
		return "동네친구 이름 : " + this.getName() +
					", 연락처 : " + this.getPhone();
	}
}
