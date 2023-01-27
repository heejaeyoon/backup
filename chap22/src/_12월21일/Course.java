package _12월21일;

import java.util.ArrayList;
import java.util.List;

public class Course<T> {
	private String name;
	private List<T> students;
	
	public Course(String name) {
		super();
		this.name = name;
		this.students = new ArrayList<T>();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<T> getStudents() {
		return students;
	}

	public void print() {
		System.out.print(this.name+" :[");
		students.stream().forEach((e)->System.out.print(e.toString()));
		System.out.println("]");
	}
	
	

}