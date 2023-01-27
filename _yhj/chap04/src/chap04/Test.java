package chap04;

import java.util.Scanner;

public class Test {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int scores[][]; 
		
		boolean run = true;
		
		int inputNum;
		int inputNum2;
		while (run) {
			System.out.println("과목 수 입력>");
			inputNum = sc.nextInt();
			System.out.println("학생 수 입력>");
			inputNum2 = sc.nextInt();
			scores = new int[inputNum][inputNum2]; // inpuntNum = 행 (가로//과목수) inpuntNum2 = 열 (세로//학생 수)
			for (int i = 0; i < inputNum; i++) {
				for (int j = 0 ; j < inputNum2; j++) {
					System.out.println(i+"번 과목" +j+"번째 학생 점수 입력>");
					scores[i][j] = sc.nextInt();
				}
			}
			for (int i = 0; i < inputNum; i++) {
				for (int j = 0 ; j < inputNum2; j++) {
					System.out.print(scores[j][i]+"\t");
					}
					System.out.println();
					
				}	
			}
		
}
}