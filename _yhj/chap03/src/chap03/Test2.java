package chap03;

import java.util.Iterator;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("구구단을 위한 숫자입력1>");
		int num = scan.nextInt();
		System.out.println("구구단을 위한 숫자입력2>");
		int num2 = scan.nextInt();
		// System.out.println(num);
		for (int j = num; j <= num2; j++) {
			for (int i = 1; i <= 9; i++) {
				System.out.println(j + "X" + i + "=" + j * i);
			}

		}
	}
}
