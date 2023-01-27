package chap05;

import java.util.Scanner;

public class TestEx {
	public static void main(String [] args) {
		Student[] stu = new Student[3];
		
		stu[0] = new Student("홍길동", "202201", "서울 마포구");
		stu[1] = new Student("홍길철", "202202", "서울 강남구");
		stu[2] = new Student("홍길순", "202203", "서울 성북구");
				
				
		Scanner scan = new Scanner(System.in);	
		for (int i=0; i< stu.length; i++) {
			System.out.println(stu[i].name+"의 국어 점수 입력>");
			stu[i].kor = scan.nextInt();
			System.out.println(stu[i].name+"의 수학 점수 입력>");
			stu[i].math = scan.nextInt();
			System.out.println(stu[i].name+"의 영어 점수 입력>");
			stu[i].eng = scan.nextInt();
			
		}
	}
}
