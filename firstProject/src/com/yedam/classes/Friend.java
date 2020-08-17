package com.yedam.classes;

import java.util.Scanner;

public class Friend {
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
	String fdName;
	int fdAge;
	String fdPone;
	
	public Friend() {
		fdName = "테스트";
		fdAge = 11;
		fdPone = "010-1234-5678";
	}
	
//	public Friend(String fdName,int fdAge, String fdPone) {
//	this.fdName = fdName;
//	this.fdAge = fdAge;
//	this.fdPone = fdPone;
//	}
	
	public Friend(String fdName, int  fdAge, String fdPone) {
		this.fdName =fdName;
		this.fdAge = fdAge;
		this.fdPone = fdPone;
	}
	
	public void setfdName(String fdName) {
		this.fdName = fdName;
	}


	public String getfdName() {
	return fdName;
	}
//-------------------------------------------------------
	
	public void setfdAge(int fdAge) {
		this.fdAge = fdAge;
	}


	public int getsetfdAge() {
	return fdAge;
	
}
	
//-------------------------------------------------------
	
	
	public void setfdPone(String fdPone) {
		this.fdPone = fdPone;
	}


	public String getfdPone() {
	return fdPone;
	}
	
	
	public String fdAll() {
		return "친구이름"+fdName +"친구나이" + fdAge + "친구전화번호" + fdPone ;
	}
}
