package _12월21일;

public class CourseEX {
	public static void main(String[] args) {
		Course<Person> pc = new Course<Person>("일반인과정");
		pc.getStudents().add(new Person("일반인"));
		pc.getStudents().add(new Worker("직장인"));
		pc.getStudents().add(new Student("학생"));
		pc.getStudents().add(new HighStudent("고등학생"));
		register(pc);
	}
	
	public static void register(Course<?> cs) {
		cs.print();
	}
}
