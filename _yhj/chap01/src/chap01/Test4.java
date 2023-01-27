package chap01;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		int ss;
		int val = 0;
		Scanner scan = new Scanner(System.in);
		for(;;) {
			System.out.println(">>");
			ss = scan.nextInt();
			if (ss == 1) {
				System.out.println("예금액>");
				ss = scan.nextInt();
				val = val + ss;
				System.out.println("잔액>"+val);
			}
			if (ss == 4) {
				break;
			}
		}
				
	}

}
