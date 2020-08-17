package inherit;

public class Child extends Parent { //Parent class를 상속 받는당
	
	private int grade;//Child 의 필드 추가
	
	public Child(String name, int age) {//상속받을때는 부모 클래스의 생성자 파라미터와 동일해야됨
		super(name,age);
	}
	
	public Child(String name, int age, int grade) {
		super(name,age);
		this.grade = grade;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {

		return "Child [grade=" + grade + "]";
	}
	
}
