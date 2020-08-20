package generic;

import com.yedam.classes.Person;

public class ProductExample {
	public static void main(String[] args) {
		Product<String, Person> pr1 = new Product();
		pr1.setModel(new Person());
		pr1.setType("유형");//스트링 클래스만 유일하게new String을 써도 되고 바로 문자열 써도됨
//		pr1.setType(new String("유형"));
		
		Product<String, Integer> p1 =new Product<>();
		p1.setModel(10);
		p1.setType("최재영");
		Product<String, Integer> p2 =new Product<>();
		p2.setModel(10);
		p2.setType("최재영");
		
		boolean tof = Util.compare(p1, p2);
		
		if(tof) {
			System.out.println("논리적으로 동등");
		}	else { 
			System.out.println("논리적으로 다름");
		}
	} 
	
}
