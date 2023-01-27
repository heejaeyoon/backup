package chap05;

public class StudentEx {

	public static void main(String[] args) {
		
		Student st = new Student("홍길동", "2020", "서울 마포구", 80, 90, 60);
//		System.out.println(st.sum());
		int result = st.sum();
//		st.printSum();
		System.out.println(st.avg());
		
	}

}
