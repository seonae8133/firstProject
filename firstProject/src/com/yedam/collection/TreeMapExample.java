package com.yedam.collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {//키값 기준으로 크다 작다\.
	public static void main(String[] args) {
		
		TreeMap<Integer,String> scores = new TreeMap<>();
		scores.put(new Integer(87),"최형쭌");
		scores.put(new Integer(98),"조역래");
		scores.put(new Integer(75),"염팽강");
		scores.put(new Integer(95),"이뎡은");
		scores.put(new Integer(80),"깅도은");
		
//		Map.Entry<Integer,String>entry = scores.firstEntry(); //firstEntry : 제일작은 첫번재 값 가지고옴
		Map.Entry<Integer,String>entry = scores.lastEntry(); //firstEntry : 제일작은 첫번재 값 가지고옴
		System.out.println("점수: " + entry.getKey() + 
										", 이름 : " + entry.getValue());
		Integer icnt = scores.firstKey();//리턴되는 값이 키값만 가지고옴
		scores.get(icnt);
		System.out.println("점수: " + icnt + 
										", 이름 : " + scores.get(icnt));
		
		
		Map.Entry<Integer,String>pEntry = scores.pollFirstEntry(); //메세지 호출하면 호출되는 결과 타입값이pEntry에 저장
	}
	
}
