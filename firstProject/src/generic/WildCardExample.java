package generic;

public class WildCardExample {
	public static void registerCourse(Course<?> course) {
		
	}
	
	public static void registerCoruseStudent(Course<? extends Student>course) {
		//Course<Student>,Course<HighStudent>
	}
	
	public static void registerCourseWorker(Course <? super Worker>course) {
		//Course<Worker>, Course<Person>
	}
	public static void main(String[] args) {
		
		Course<Person> crsPerson = new Course<>("일반인과정",5);
		crsPerson.add(new Person("일반일1"));
		crsPerson.add(new Worker("직장인1"));
		crsPerson.add(new Student("학생1"));
		crsPerson.add(new HighStudent("고등학생1"));
		

		Course<Worker> crsWorker = new Course<>("직장인과정",5);
		crsWorker.add(new Worker("직장인2"));
		
		Course<Student> crsStudent = new Course<>("학생과정",5);
		crsStudent.add(new Student("학생2"));
		
		
		Course<HighStudent> crsHighStudent = new Course<>("고등학생과정",5);
		crsHighStudent.add(new HighStudent("고등학생2"));
		
		
		//일반인등록가능 .Course<?> course //모든 클래스 받을수 있음
		registerCourse(crsPerson);
		registerCourse(crsWorker);
		registerCourse(crsStudent);
		//학생등록가능. Course<? extends Student>course // 지정클래스 및 하위 클래스
		registerCoruseStudent(crsStudent);
		registerCoruseStudent(crsHighStudent);
		//직장인등록가능. Course <? super Worker>course // 지정클래스 및 상위 클래스
		registerCourseWorker(crsWorker);
		registerCourseWorker(crsPerson);
	
		
		
	}
}
