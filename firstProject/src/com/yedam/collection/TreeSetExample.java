package com.yedam.collection;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		
		TreeSet<Integer> tSet = new TreeSet<>();
		tSet.add(new Integer(87)); //TreeSet은 크다 작다라는 개념을 가지고 있음
		tSet.add(new Integer(98));//TreeSet = add라는 메서드로 값 추가
		tSet.add(new Integer(75));
		tSet.add(new Integer(95));
		tSet.add(new Integer(80));
		
		Integer t = tSet.first();//제일 낮은 객체를 리턴
		t = tSet.last();
		
		t = tSet.floor(new Integer(90));//90을 기준으로 해서 기준값보다 작거나 같다
		System.out.println("floor :"+t);
		
		t = tSet.lower(new Integer(90)); //90을 기준으로 해서 작은값
		System.out.println("lower :"+t);
		
		t= tSet.ceiling(new Integer(90)); // 90을 기준으로 해서 크거나 같다
		System.out.println("ceiling :"+t);
		
		t= tSet.higher(new Integer(90)); // 90을 기준으로 해서 큰값
		System.out.println("higher :"+t);
		
		
		
		Iterator<Integer> dIter = tSet.descendingIterator();
		while(dIter.hasNext()) { //가지고 올 요소가 있는지 체크
		System.out.println(dIter.next()); // 큰값부터(내림차순으로 정렬된) 출력
		}
		
		System.out.println("-----------------------------------------");
		
		NavigableSet<Integer> nSet = tSet.descendingSet();//리턴되는 타입이 set
		for(Integer icnt : nSet) {
			System.out.println(icnt);
		}
		
		
		
		
		int size = tSet.size();
		for(int i=0; i<size; i++) {
			t = tSet.pollFirst();//제일 낮은 객체부터 꺼내오고 컬렉션에서 제거함
			System.out.println("pollFirst" + t + ", " + tSet.size());
		}
		
		
		for(int i=0; i<size; i++) {
			t = tSet.pollLast();//제일 큰 객체부터 꺼내오고 컬렉션에서 제거함
			System.out.println("pollFirst" + t + ", " + tSet.size());
		}
		
		
		
//		t=tSet.pollFirst(); // 안에 들어있는 값을 빼오고나서 지우는것.
//		System.out.println("pollFirst :" +t + ", size :" + tSet.size());
//		t=tSet.pollFirst();
//		System.out.println("pollFirst :" +t + ", size :" + tSet.size());
//		t=tSet.pollFirst();
//		System.out.println("pollFirst :" +t + ", size :" + tSet.size());
//		//iterator : 반복자 (안에 있는 값을 하나씩 빼내는 기능)
		Iterator<Integer> iter = tSet.iterator();
		while(iter.hasNext()) {
			Integer icnt = iter.next();
			System.out.println(icnt);
		}
		
		
		
	}
}
