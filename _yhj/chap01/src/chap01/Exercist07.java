package chap01;

import java.util.Scanner;

public class Exercist07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇 단? ");
		
		int a = sc.nextInt();
			for (int b = 1; b < 10; b++) {
			System.out.println(a + "*" + b + "=" + a * b);
			}
		}
		
	}


