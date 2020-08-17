package com.yedam.classes.exam;

public class Friend3 {
	// 친구주소 이름,나이,전화번호
		/*
		 * 1.정보입력(이름,나이,전화번호)
		 * 2. 리스트
		 * (3) 이름조회
		 * (4) 이름조회 후 수정
		 * 9. 종료
		 * 
		 * 숫자읽을때 nextInt()
		 * 문자 읽을때 : nextLine()
		 * */
	String name;
	int age;
	String phon;
	
	public Friend3(String name, int age, String phon) {
		super();
		this.name = name;
		this.age = age;
		this.phon = phon;
	}

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

	public String getPhon() {
		return phon;
	}

	public void setPhon(String phon) {
		this.phon = phon;
	}
	
	
	
	
}
