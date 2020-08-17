package com.yedam.classes;

public class PersonExample {

	public static void main(String[] args) {
		
		Person p1 =new Person();  //새인스턴스 생성, 
		p1.setName("손앵이");
		p1.setAge(28);
		
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		
		Person msa = new Person(); //Person타입
		msa.setName("소내");
		msa.setAge(28);
		System.out.println(msa);//com.yedam.classes.Person@50f8360d : 주소값
		
		
		Person ksm = new Person();
		ksm.setName("상민이");
		ksm.setAge(26);
		Person ksm2 = new Person();
		ksm2.setName("상민이");
		ksm2.setAge(26);
		System.out.println(ksm);
		System.out.println(ksm==ksm2);//같은 값이지만 new 로 새 인스턴스 생성하면서 주솟값이 다름
		System.out.println(ksm.getName().equals(ksm2.getName()));
		System.out.println(ksm.getAge() == ksm2.getAge());
		
		System.out.println(msa.introduce());
		System.out.println(ksm.introduce());
		ksm.introduce();
		
		Person[] pAry = {msa, ksm, ksm2};
		
		
//		for(int i=0 ; i<pAry.length; i++) {
//			pAry[i].introduce();
//		}
		
//		Person anoy = new Person();
//		System.out.println(anoy.introduce());
		Person anoy = new Person("형주니");
		
		anoy.name ="염팽강";
		anoy.age = 24;
		System.out.println(anoy.introduce());
		
		Person hsj = new Person("허성준",20);
		hsj.setName("조염내");
		System.out.println(hsj.introduce());
		
	}
}
