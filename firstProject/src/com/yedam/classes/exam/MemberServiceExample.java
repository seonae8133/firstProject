package com.yedam.classes.exam;

public class MemberServiceExample {

	public static void main(String[] args) {
		
		
		
		//로그인 정보
		Member mem1 = new Member("홍","hong");
		mem1.setPassword("hong123");
		
		
		MemberService mService = new MemberService();//MemberService를 호출하고
		boolean result = mService.login(mem1.getId(),mem1.getPassword());//매개값에 members 배열을 넣어주면, 해당 MemberService에서 배열 사용 가능
		
		if(result) {
			System.out.println(mem1.getName() + "로그인되었습니다. 아이디는:"+mem1.getId());
		}else {
			System.out.println("id 또는 password를 확인하세요");
	}
	}
	
}
