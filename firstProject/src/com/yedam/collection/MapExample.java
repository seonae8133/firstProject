package com.yedam.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
//	public static void main(String[] args) {
//		Map<Integer, Member> map = new HashMap<>();
//		map.put(11, new Member("형주니",25));
//		map.put(12, new Member("얌팽강",26));
//		map.put(13, new Member("재훈이",21));
//		
//		System.out.println(map.get(11).getName()+"," + map.get(11).getAge());
//		
//		Set<Integer> set = map.keySet(); //Key에 해당하는값을 set에 담아서
//		for(Integer i : set) {
//			Member m = map.get(i);
//			System.out.println(m.getName() + "," + m.getAge());
//		}
//		
//		Set<Map.Entry<Integer, Member>>entSet = map.entrySet();
//		for(Map.Entry<Integer, Member> m :entSet) {
//			System.out.println(m.getKey() + "," + m.getValue().getName());
//		}
//	}
	
	public static void main(String[] args) {
		
	 Map<String,String> m1 = new HashMap<>();
	 m1.put("이름","홍길동");
	 m1.put("전공","역사학");
	
	 
	getInfo(m1);
	 
	Map<String, Integer > m2 = new HashMap<>();
	m2.put("리정은",26);
	m2.put("앰팽강",26);
	m2.put("최횽준",25);
	getAge(m2);
		
	}
	
	public static void getAge(Map<String, Integer> m2) {
		
		Set<Map.Entry<String, Integer>>entSet = m2.entrySet();
		for(Map.Entry<String, Integer>m  : entSet) {
			System.out.println(m.getKey() + "의 나이는" + m.getValue());
		}
		
	}
	
	public static void getInfo(Map<String,String>m1) {
		System.out.println("이름: " + m1.get("이름"));
		System.out.println("전공: " + m1.get("전공"));
		
		
		
	}
}
