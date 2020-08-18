package com.yedam.classes;

public class ComFriend  extends Friend2 {
	
	// ---------필드 -------------
	
	private String comName; //회사이름
	
	
	public ComFriend() {
		super();
	}


	public String getComName() {
		return comName;
	}


	public void setComName(String comName) {
		this.comName = comName;
	}


	@Override
	public String toString() {
		return "회사친구 이름 : " + super.getName() +
					", 연락처 : " + super.getPhone() +
					", 회사명: " + this.comName;
	}
	
	
	
	
}
