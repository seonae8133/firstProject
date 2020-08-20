package generic;

import java.util.HashMap;
import java.util.HashSet;

import com.yedam.classes.Person;

public class GenericExample {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("최령준");
		set.add("염팽강");
		
		HashSet<Person> set2 = new HashSet<>();
		set2.add(new Person());
		set2.add(new Person());
		
		HashMap<String,Integer > map = new HashMap<>();
		map.put("조염내", 28);
		map.put("문소냉", 50);
	}
}
