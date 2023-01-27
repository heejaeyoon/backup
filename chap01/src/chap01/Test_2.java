package chap01;

public class Test_2 {
	String hakbun;
	String name;
	int kor, math, eng;
	
	

	public Test_2(String hakbun, String name) {
		this(hakbun, name, 0, 0, 0);
//		this.hakbun = hakbun;
//		this.name = name;
	}

	public Test_2(String hakbun, String name, int kor, int math, int eng) {
		//this(hakbu, name);
		this.hakbun = hakbun;
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}
	
	

}
