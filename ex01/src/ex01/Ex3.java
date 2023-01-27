package ex01;

import java.util.Arrays;

public class Ex3 {

	public static void main(String[] args) {
		int[] score = {79 , 88, 91, 33, 100, 55, 95};
		
		int max = score[0];
		int min = score[0];
		
		for(int i = 0; i<score.length; i++) {
			if( max < score[i]) {
				max = score[i];
			} else if(min > score[i]) {
				min = score[i];
			}
		}
		System.out.println("최대 값은: " + max);
		System.out.println("최소 값은: " + min);
	}
}
