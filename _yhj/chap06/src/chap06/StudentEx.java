package chap06;

public class StudentEx {

	public static void main(String[] args) {
		Students st = new Students();
		st.stuArr = new Student[10];
		st.init();
		System.out.println(st.searchStudent("03"));
		st.updateScore("03",50,100,90);
		System.out.println(st.searchStudent("03"));
	}

}
