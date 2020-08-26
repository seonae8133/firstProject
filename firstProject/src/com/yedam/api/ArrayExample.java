package com.yedam.api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;



class User implements Comparable <User> {
	String name;
	int grade;
	
	public User(String name, int grade) {
		super();
		this.name = name;
		this.grade = grade;
	}

	@Override
	public int compareTo(User o) {
	return this.name.compareTo(o.name);	
//		return  o.grade - this.grade ; //this.grade = 1번째 요소, o.grade = 2번째요소
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", grade=" + grade + "]";
	}
	
	 

	
}
public class ArrayExample {
	public static void main(String[] args) {
		
	
	String[] names = {"Hong","Park","Choi"};
	int[] scores = {95,80,36,88};
	
	
	System.out.println("-------------정렬전-------------");
	for(String s:names) {
		System.out.println(s);
	}
	
	
	System.out.println("-------------정렬후-------------");
	Arrays.sort(names);
	for(String s:names) {
		System.out.println(s);
	}
	
	User[] users = {new User("user1",1), new User("user2",2),new User("user3",3)};
	

	Arrays.sort(users);
	System.out.println("==================");
	for(User s:users) {
		System.out.println(s);
	}
	// user3, user2, user1
}
}