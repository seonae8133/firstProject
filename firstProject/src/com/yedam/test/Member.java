package com.yedam.test;

public class Member {
		//----------필드--------------
		public String id;
		
		//----------생성자--------------
		public Member(String id) {
			this.id = id;
		}
		
		@Override
		public boolean equals(Object obj) {
			if(obj instanceof Member) {
				/*참조변수가 참조하고 있는 인스턴스의 실제 타입을 알아보기 위해 instanceof 연산자를 사용합니다. 
				주로 조건문에 사용되며, instanceof의 왼쪽에는 참조변수를 오른쪽에는 타입(클래스명)이 피연산자로 위치합니다. 
				그리고 연산의 결과로 boolean값인 true, false 중의 하나를 반환 합니다*/
				Member member = (Member) obj;
				if(id.contentEquals(member.id)) {
					return true;
					
				}
			}
			return false;
		}

		@Override
		public int hashCode() {
			
			return id.hashCode();
		}
		
		
		
}
