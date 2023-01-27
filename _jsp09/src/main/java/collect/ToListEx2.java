package collect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ToListEx2 {
	public static void main(String[] args) {
//		List<Student> tt2 = new ArrayList<>();
//		tt2.add(new Student("홍길동", 10, Student.Sex.MALE, Student.City.Seoul));
		
		
		List<Student> totalList = Arrays.asList(
				new Student("홍길동", 10, Student.Sex.MALE, Student.City.Seoul),
				new Student("김수애", 6, Student.Sex.FEMALE, Student.City.Pusan),
				new Student("신용권", 10, Student.Sex.MALE, Student.City.Pusan),
				new Student("박수미", 6, Student.Sex.FEMALE, Student.City.Seoul)
			);
		
		Map<Student.Sex, List<Student>> ms = totalList.stream()
				.collect(Collectors.groupingBy(Student::getSex));
		
		ms.get(Student.Sex.FEMALE).stream()
			.forEach(s -> System.out.println(s.getName()));
	

		Map<Student.City, List<String>> ms2 = totalList.stream()
			.collect(Collectors.groupingBy(Student::getCity,
					Collectors.mapping(Student::getName, Collectors.toList()))
				);
	
		Map<Student.City, List<Student>> ms3 = totalList.stream()
				.collect(Collectors.groupingBy(Student::getCity, Collectors.toList()));
		
		Map<Student.Sex, Double> ms4 = totalList.stream()
				.collect(Collectors.groupingBy(Student :: getSex,
						Collectors.averagingDouble(Student::getScore)));
		System.out.println(ms4.get(Student.Sex.MALE));
		
		Map<Student.Sex, String> ms5 = totalList.stream()
				.collect(Collectors.groupingBy(Student :: getSex,
						Collectors.mapping(Student::getName,Collectors.joining(","))));
		System.out.println(ms5.get(Student.Sex.FEMALE));
		
		Map<Student.City, String> ms6 = totalList.stream()
				.collect(Collectors.groupingBy(Student :: getCity,
						Collectors.mapping(Student::getName,Collectors.joining(","))));
		System.out.println(ms6.get(Student.City.Seoul));
		
		
	}
}
