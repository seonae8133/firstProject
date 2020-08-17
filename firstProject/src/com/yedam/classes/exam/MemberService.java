package com.yedam.classes.exam;

public class MemberService {//기능만 정의한 class
				
			public boolean login(String id,String password) {
				//db역할
				Member[] members = new Member[3];
				members[0] = new Member("홍길동","hong");
				members[0].setPassword("hong123");
				members[1] = new Member("김유신","kim");
				members[1].setPassword("kim123");
				members[2] = new Member("최재영","choi");
				members[2].setPassword("choi123");
				
				
				boolean result = false;
				
				for(int i=0; i<members.length;i++) {
					if(id.equals(members[i].getId())
							&&password.equals(members[i].getPassword())) {//
						result = true;//id랑pw 배열안에서 찾을수 있으면 ture
						break;
					}else 
						result = false;
				}
				return result;
			}
			public void logout(String id) {
				System.out.println("로그아웃");}
	
			}

