package chap02;

public class StundentEx {

	public static void main(String[] args) {
		String name = "홍길동"; // 지역 변수(메인 메소드가 실행되어야만 사용가능)
		System.out.println(name);
		System.out.println(Student.age); // 스태틱으로 만든것은 객체를 안만들어도 불러 올 수 있다
		
		Student s1 = new Student();
		System.out.println(s1.name); // 멤버 필드를 사용할때 사용. 객체생성이 되어야 사용가능
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		s1.name="김사랑";
		System.out.println(s1.name);
		s1.print();
		Student s2 = new Student();
		System.out.println(s2.name);
		System.out.println("s2 변수가 또 다른 Student 개체를 참조합니다.");
	}

}
