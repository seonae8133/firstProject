package com.yedam.collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

class Fruit {
	String name;
	int price;
	
	
	public Fruit(String name, int price) {
		super();
		this.name = name;
		this.price = price;
		}
	}
	
	
class FruitComp implements Comparator<Fruit> {

	@Override
	public int compare(Fruit o1, Fruit o2) {
		// 
		return o1.price - o2.price; // 오름차순(음수) / 내림차순(양수)
	}
	

}


public class TreemapExample2 {
	public static void main(String[] args) {
		TreeMap<Fruit, Integer> map = new TreeMap<>(new FruitComp()); //TreeMap은 키값 기준으로 크다 작다가 정의됨
		
		map.put(new Fruit("Orange",1000), 1);
		map.put(new Fruit("Grape",3000), 2);
		map.put(new Fruit("Apple",2000), 3);
		Set<Fruit> set = map.descendingKeySet();//단순 set 은 정렬안됨
		NavigableSet<Fruit>dSet = map.descendingKeySet(); // descendingKeySet(내림차순 정렬)이나 NavigableSet(정렬되어있는값) 
		dSet = map.navigableKeySet();
		Iterator<Fruit> iter = dSet.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		Map<Integer,Double> map2 = null;
		int a = 30;
//		Integer i = 30; // 자동형변환 되서 상관없긴함
		Integer i = new Integer(30);
		int b = Integer.parseInt("30");//Map 에서 넘겨주는 값들은 String 값이라 문자를 실제 정수로 바꿪줄때 Integer.parseInt로 숫자열타입으로 변환해줌 
	}
}
