package com.yedam.classes;

public class Student {
	
	String stuName;
	int stuNo;
	String major;
	
	public Student() {
		stuName ="최형준";
		stuNo = 15121713;
		major = "IT";
		
	}
	
	public Student(int stuNo) {
		this.stuNo = stuNo;
	}
//	
//	public Student(int stuNo, String stuName) {
//		this.stuNo = stuNo;
//		this.stuName = stuName;
//	}
//
//	public Student(int stuNo, String stuName,String major) {
//		this.stuNo = stuNo;
//		this.stuName = stuName;
//		this.major = major;
//}
	
	public void setAll(int stuNo,String stuName, String major) {
		this.stuNo =stuNo;
		this.stuName = stuName;
		this.major = major;
	}
	
	
	public String getAll() {
		return "(" + stuNo + "," + stuName + "," +major+")" ;
	}
	
	
//@Override
//	public String toString() {
//		return "Student [stuName=" + stuName + ", stuNo=" + stuNo + ", major=" + major + "]";
//	}

	//	public void setStuNo(int stuNo) {
//		this.stuNo = stuNo;
//	}
//	
//	
//	public int getStuNo() {
//		return stuNo;
//	}
//	
	public String getstuName() {
		return stuName;
	}
	
	public void setstuName(String stuName) {
		this.stuName = stuName;
	}
	
//	public String getmajor() {
//		return major;
//	}
//	
//	public void setmajor(String major) {
//		this.major = major;
//	}
//
//	public String suc() {
//		return "(" + stuNo + "," + stuName + "," +major+")" ;
//	}

}
