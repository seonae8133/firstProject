package com.yedam.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	//배열 중간에 어떤 값을 넣을때는 arrayList 보다는 LinkedList 가 더 효율적임
	// arrayList 는 중간에 어떤 값이 삭제되면 다 당겨오기때문에, 뒤에 배열로 계속 옮겨줘야해서 비효율적.
	// 중간에 삽입시 : LinkedList , 제일끝에 값 삽입시는 : arrayList가 나음
	
	public static void main(String[] args) {
		List<Integer> aList = new ArrayList<>();
		long startTime = System.nanoTime(); 
		for(int i=0; i<3000; i++) {
			aList.add(0, new Integer(i));
	}
		long endTime = System.nanoTime();
		System.out.println("걸린시간 : " + (endTime-startTime));

	
	List<Integer> bList = new LinkedList<>();
	startTime = System.nanoTime(); 
	for(int i=0; i<3000; i++) {
		bList.add(0, new Integer(i));
}
	 endTime = System.nanoTime();
	System.out.println("걸린시간 : " + (endTime-startTime));
	}
}

