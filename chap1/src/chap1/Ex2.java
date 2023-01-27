package chap1;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
//		int sum = 0;
//		for (int i = 1; i <= 10; i++) {
//			sum += i;
//			
//		}
//		System.out.println(sum);
//	
//	
//		int sum2 = 0;
//		int i = 1 ;
//		
//		while ( i <= 10) {
//			sum2 += i;
//			i++;
//		
//			System.out.println(sum2);
//		}
//		
//		for (int x = 1; x<=9; x++) {
//			System.out.println(x+"단");
//			for(int y = 1; y<=9; y++) {
//				System.out.println( x + "x"+ y + "="+ x*y);
//			}
//		}
//		System.out.println("구구단 출력 페이지 입니다");
//		Scanner sc = new Scanner(System.in);
//		System.out.println("원하시는 단을 입력하세요 : ");
//		int dan = sc.nextInt();
//		for(int s = 1; s<=9; s++) {
//			System.out.println(dan+"*"+s+"="+dan*s);
//		}
//		sc.close();
		
//		double num = Math.random();
//		System.out.println(num);
//		
//		int c = (int)(num*6 + 1);
//		System.out.println(c);
//		
//		
//		int i = 0;
//		int ret = 100 + i++;
//		System.out.println(ret);
//		System.out.println(i);
//		
//		
//		
//		int d = 0;
//		int ret2 = 100 + ++d;
//		System.out.println(ret2);
//		System.out.println(d);
		
//		int nn = 85;
//		String ss = nn<60? "과락":"합격";
//		System.out.println(ss);
		
//		int nn = 90;
//		boolean tt = false;
//		if(nn >= 90 && tt == true ) {
//			System.out.println("여기");
//		} else if (nn >80 || tt == false) {
//			System.out.println("저기");
//		}
//
		
//		for(char alp = 'A'; alp <= 'Z'; alp++) {
//			if(alp == 'K') {
//				break;
//			}
//			System.out.println(alp);
//		}
		
		int arr[] = new int[7];
		for (int i=0; i<arr.length; i++) {
			arr[i] = 100+i;
		}
		for (int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}