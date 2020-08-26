package com.yedam.collection;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapExample13 {
	public static void main(String[] args) {
		TreeMap<Student,String> tMap = new TreeMap<>();
		tMap.put(new Student("Hong", 69,79),"체육특기생");
		tMap.put(new Student("Park", 78,88),"일반학생");
		tMap.put(new Student("Choi", 85,79),"체육특기생");
		tMap.put(new Student("Kim", 90,86),"일반학생");
		
		SortedMap<Student,String> sMap = tMap.headMap(new Student("Sorted",80,88));
		Set<Student> set = sMap.keySet();
		
		for(Student s : set) {
			System.out.println(s.getName()+"," + s.getMathScore());
		}
		
		NavigableSet<Student> rangeMap = set.headSet(new Person("Sorted",12),true);
		
		
		tMap.headMap(new Student("Sorted",80,79));//80점 이하...
		tMap.tailMap(new Student("Sorted",80,79));//80점 이상...
		tMap.subMap(new Student("Sorted",70,79),new Student("Sorted",80,79));//70점 에서 80사이
		
		System.out.println(tMap.headMap(new Student("Sorted",80,79)));
		System.out.println(tMap.tailMap(new Student("Sorted",80,79)));
		System.out.println(tMap.subMap(new Student("Sorted",70,79),new Student("Sorted",80,79)));
		
	}
}
