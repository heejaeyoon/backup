package chap01;

import java.util.Random;
import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ra = new Random();

		while(true) {
			int count = 0;
			System.out.println("구구단을 시작합니다.(총 4문제)");

			for (int a=1; a<5; a++) {
				int r = ra.nextInt(9)+1;
				int r2 = ra.nextInt(9)+1;

				System.out.printf(a+"번. "+r+"X"+r2+"= ");
				int input = sc.nextInt();

				if(input==(r*r2)) {
					System.out.println("정답");
					count++;
				}
				else if(input!=(r*r2)) {
					System.out.println("땡. 정답은 "+(r*r2)+"입니다.");
				}
			}
			System.out.println("====================");
			if (count==3) {
				System.out.println("축하합니다! 만점입니다.");
				System.out.println("====================");
			}
			else if (count==0) {
				System.out.println("빵점입니다.");
				System.out.println("====================");
			}
			else {System.out.println("4문제중 "+count+"문제 맞췄습니다.");
			System.out.println("====================");
			}
			System.out.println("계속할까요? (1)예 (2)아니오");
			int input2 = sc.nextInt();
			if(input2==2) {
				System.out.println("구구단을 종료합니다.");
				break;
			}
		}
	}
}



