package chap07;

public class ScoresEx {

	public static void main(String[] args) {
		Student stu = new Student("홍","01");
//		Scores sco = new Scores(89, 91 , 88);
//		stu.setScores(sco);
		stu.setScores(new Scores(89, 91, 88));
//		System.out.println(stu);
//		stu.scores.printSum();
		stu.printScore();
		stu.updateScore(90, 90, 90);
		stu.printScore();
	}
	
}
		
		
