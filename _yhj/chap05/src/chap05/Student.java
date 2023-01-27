package chap05;

public class Student {
	String name;
	String hakbun;
	String address;
	int kor;
	int math;
	int eng;
	
	public Student(String name, String hakbun, String address) {
		
		this.name = name;
		this.hakbun = hakbun;
		this.address = address;
		
	}
	public Student(int kor, int math, int eng) {
		
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		
	}
	double avg( ) {
		return sum() / 3.0 ;
		
	}
	void printAvg(){
		System.out.println(avg());
		
	}
		
	void printSum() {
		System.out.println(sum());
	}
	int sum() { //총점
		return this.kor + this.math + this.eng;
	}
}
