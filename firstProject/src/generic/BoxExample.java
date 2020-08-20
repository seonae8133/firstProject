package generic;

import com.yedam.classes.Person;

public class BoxExample {
	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		box.set(new String("Hello"));
		String result = box.get();
		
		Box<Person> box2 = new Box<>();
		box2.set(new Person());
	    Person p1 = box2.get();
		
	    Box<Person> box3 = Util.boxing(new Person());
	    System.out.println(box3);
	    Box<String> box4 = Util.boxing(new String("ggg"));
	    System.out.println(box4);
	/*
	Box box = new Box();
	String str1 = new String("Hello");
	box.set(str1);
	String result = (String)box.get(); //get메소드가 리턴해주는게 Object타입//자식 클래스 맞게 형변환 해줘야함
	
	Person p1 = new Person();
	box.set(p1);
	Person p2 = (Person) box.get();
	
	result = (String)box.get(); //runtime
	*/ 
	}
}
