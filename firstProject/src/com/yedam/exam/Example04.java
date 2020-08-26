package com.yedam.exam;

import java.util.HashSet;
import java.util.Set;

import com.yedam.test.Person;

public class Example04 {
	public static void main(String[] args) {
		//배열의 크기 3;
		//1~6까지의 임의의 숫자가 반복되지 않도록 배열에 저장해 보세요
		
//		int[] array = new int[3];
//		int array1;
//		for(int i= 0; i<array.length; i++) {
//			
//			int random = (int) ((Math.random()*6)+1); //1~6까지의 숫자	
//				array[i] = random;
//				
//			System.out.println(array[i]);
//		}
//		
		
		Set<Person> pSet = new HashSet<>();
		pSet.add(new Person("Hong1",20));
		pSet.add(new Person("Hong1",21));
		pSet.add(new Person("Hong1",22));
		
		for(Person p: pSet) {
			System.out.println(p.name + ", " + p.age);
		}
	}
}
