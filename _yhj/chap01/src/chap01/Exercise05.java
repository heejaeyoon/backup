package chap01;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		boolean run = true;
		
		int balance = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while (run) {
			System.out.println("---------------------------------------------------");
			System.out.println("1.현재 체중 | 2.감량해야하는 체중 | 3.목표 체중 | 4.목표 달성");
			System.out.println("---------------------------------------------------");
			System.out.println("선택> ");
			
			
			int num = sc.nextInt();
			
			switch(num) {
			case 1:
				System.out.println("현제 체중>");
				balance += sc.nextInt();
				break;
			case 2:
				System.out.println("감량해야하는 체중>");
				balance -= sc.nextInt();
				break;
			case 3:
				System.out.println("목표 체중>");
				System.out.println(balance);
				break;
			case 4:
				run = false;
				break;
			}
			
			System.out.println();
		}
		
		System.out.println("프로그램 종료");
	}

}