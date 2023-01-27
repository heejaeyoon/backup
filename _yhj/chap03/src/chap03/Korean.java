package chap03;

public class Korean {
	//필드
	String nation = "대한민국";
	String name;
	String ssn;
	
	//생성자
	public Korean(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	public Korean(String name, String ssn, String nation) {
		this.name = name;
		this.ssn = ssn;
		this.nation = nation;
	}
}
