package com.yedam.collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

		public static void main(String[] args) {
			Set<Member> set = new HashSet<>();
			
			
			//HashSet : set 을 구현하는 것
			set.add(new Member("희다",20));
			set.add(new Member("깅도응",21));
			set.add(new Member("깅도응",22));
			
			//set은 원래 중복허용 안되지만, 서로다른 인스턴스 주소에 담은거라 입력된것임
			/*com.yedam.collection.Member@7852e922
			com.yedam.collection.Member@70dea4e
			com.yedam.collection.Member@4e25154f
			*/
			
			for(Member mem : set) {
				System.out.println(mem.getName()+ "," + mem.getAge());
			}
		}
}
