package com.yedam.collection;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample2 {
	public static void main(String[] args) {
		
		TreeSet<Person> set = new TreeSet<>();
		set.add(new Person("Hong1",10));
		set.add(new Person("Hong2",14));
		set.add(new Person("Hong3",12));
		set.add(new Person("Hong",11));
		//java.lang.Comparable :Comparable타입으로 cast못하겠다는 오류. 크다 작다라는 기준이 필요
		// Person 클래스 수정해줘야됨 : implements Comparable<Person> 반드시 Comparable 구현하는 클래스여야 크다 작다 구분됨
		
		SortedSet<Person>sSet =  set.headSet(new Person("Sorted",12));//12보다 작은값
		//head : 앞에있는것, tail : 뒤에 있는것
		sSet = set.tailSet(new Person("So",12));
		sSet = set.subSet(new Person("Temp",10),new Person("Temp",13));//앞에 값은 포함, 뒤에 파라미터 값보다는 이하로 출력.
		
		for(Person person : sSet) {
			System.out.println(person.name + "," + person.age);
		}
		
		System.out.println("-------------------------------------------------------");
		
		NavigableSet<Person> nSet = set.headSet(new Person("Sorted",12),true); //true : 해당되는 기준값도 가져옴. / false : 해당되는 기준값은 제외하고 가져옴
		nSet = set.tailSet(new Person("Sorted",12),false);
		set.subSet(new Person ("SSS",10),true,new Person("TTT",12),false);
		
	for(Person person : nSet) {
		System.out.println(person.name + "," + person.age);
		}
		
		
		Iterator<Person> iter = set.iterator(); //반복자를 뽑아냄
		while(iter.hasNext()) { 
//			System.out.println(iter.next().name); // 나이기준으로 String 타입 값 뽑아줌
			
		}
		
	
		
	}
}
