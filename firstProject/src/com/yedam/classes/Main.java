package com.yedam.classes;

public class Main {

	public static void main(String[] args) {
		
//		Student s1 = new Student();
//		s1.setStuNo(12121713);
//		s1.setstuName("뭉소냉");
//		s1.setmajor("행정");
//		
//		System.out.println(s1.getStuNo());
//		System.out.println(s1.getstuName());
//		System.out.println(s1.getmajor());
//		
//		Student s2 = new Student(41515,"몰겟당","힘들과");
		
		Student a4 = new Student();
		a4.setstuName("김유신");
		
		Student a1 = new Student();
		a1.setAll(11111,"김유신","전공이름1");
		
		Student a2 = new Student();
		a2.setAll(22222,"학생이름2","전공이름2");
		
		Student a3 = new Student();
		a3.setAll(33333, "학생이름3", "전공이름3");
		
		
		Student[] stuAry1 = {a1,a2,a3};
		Student[] stuAry2 = new Student[5];
		
//		for(int i =0; i<stuAry1.length; i++) {
//			stuAry2[i] = stuAry1[i];
//					}
		
		String searchName ="김유신";
		
		for(Student s : stuAry1) {
			if(s.getstuName().equals(searchName))
				System.out.println(s.getAll());
		}
		
//		for(int i=0; i<3; i++) {
//			System.out.println("배열" + i + "번째 값");
//			System.out.println(stuAry1[i].getAll());
//		}
//		
		
		
		
		
		
		
		
//		Student[] stuAry = {s1,s2};
		
//		for(int i=0; i<2; i++) {
//			System.out.println(stuAry[i].suc());
//		}
	}
	
	
	
}
