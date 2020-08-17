package inherit;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child("홍길동",15,10);
		child.getName(); // 부모 Parent getName()
		child.getAge();// 부모 Parent getAge()
		child.getGrade(); // 자신getGrade()
		
		Parent parent = new  Child("김유신", 20, 20);//부모클래스에 자식 클래스 인스턴스는 할당할수 있는데.
		parent.getName();
		parent.getAge();
//		parent.getGrade();// 부모 클래스는 자식 클래스에만 있는 함수는 사용 못햠
		
		
		Vehicle v1 = new Taxi();
		v1.run();
		v1 = new Bus();
		v1.run();
		
		Driver driver = new Driver();
        driver.drive(new Taxi());
        driver.drive(new Bus());
        
        Parent parnet1 = new Parent();
        System.out.println(parnet1.toString());
	}
	
}
