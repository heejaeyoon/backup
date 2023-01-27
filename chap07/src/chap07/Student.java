package chap07;

public class Student {
	String name;
	String hakbun;
	Scores scores;
	
	
	void updateScore(int kor, int math, int eng) {
		scores.setKor(kor);
		scores.setMath(math);
		scores.setEng(eng);
		
	}
	
	public void printScore() {
		System.out.println(hakbun+"학번 "+ name+"의 총점은 "+scores.sum()+"점");
		
	}
	
	public Scores getScores() {
		return scores;
	}



	public void setScores(Scores scores) {
		this.scores = scores;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}



	public Student(String name, String hakbun) {
		this.name = name;
		this.hakbun = hakbun;
	}

	
	
	public Student(String name, String hakbun, Scores scores) {
		this.name = name;
		this.hakbun = hakbun;
		this.scores = scores;
	}



	@Override
	public String toString() {
		return "Student [name=" + name + ", hakbun=" + hakbun + ", scores=" + scores + "]";
	}
	
	
}
	
