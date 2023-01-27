package chap05;

import java.util.Scanner;

public class ArrayEx {

	public static void main(String[] args) {
		int scores[][];
		boolean run = true;
		Scanner scan = new Scanner(System.in);
		
		int num;
		int num2;	
		
		while (run) {
			System.out.println("과목수 입력>");
			num =scan.nextInt();
			System.out.println("학생수 입력>");
			num2 = scan.nextInt();
			scores = new int[num][num2]; // inpuntNum = 행 (가로//과목수) inpuntNum2 = 열 (세로//학생 수)
			for (int i = 0; i < num; i++) {
				for (int j = 0 ; j < num2; j++) {
					System.out.println(i+"번 과목" +j+"번째 학생 점수 입력>");
					scores[i][j] = scan.nextInt();
				}
			}
			for (int i = 0; i < num; i++) {
				for (int j = 0 ; j < num2; j++) {
					System.out.print(scores[j][i]+"\t");
					}
					System.out.println();
					
	}
}
}
}
