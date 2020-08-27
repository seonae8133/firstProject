package com.yedam.test;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class NewExample4 {
	Member mem ;
	//New Example 안에서만 쓸 클래스:중첩클래스
	class Member {
		String id;
		Member (String id){
			this.id = id;
		}
		@Override
		public boolean equals(Object obj) {
			if(obj instanceof Member) {
			Member mem = (Member) obj;
						return id.equals(mem.id);
//			return super.equals(obj); : 주소값으로 비교됨
			}else {
				return false;
			}
		}
		@Override
		public int hashCode() {//object클래스가 가지고 있는 함수 : hashCode()
			return Objects.hash(id);//id값이 같으면 동일한 해시코드로 지정
			//			return super.hashCode();
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
//		Member m1 = new Member("hong"); / 중첩 클래스는 만드는 방법이 다름(아래참고)
		NewExample4 ne = new NewExample4();
		Member m1 = ne.new Member("hong");
		Member m2 = ne.new Member("hong");
		System.out.println(m1.equals(m2));
		
		System.out.println(Objects.hash("hhh"));
		
		Set<Member> set = new HashSet<>();//set컬렉션은 중복값 안받음
		set.add(m1);
		set.add(m2);
		for(Member m : set) {
			System.out.println(m.id);
		}
		
}
}
