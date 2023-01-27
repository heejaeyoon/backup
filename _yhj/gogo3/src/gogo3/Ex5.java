package gogo3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex5 {

	public static void main(String[] args) {
		int[] score = {79, 88, 91, 31, 100, 55, 95};
		
		int max = score[0];
		int min = score[0];
		
		for(int i = 1 ; i<score.length; i++) {
			if(score[i]>max) {
				max = score[i];
		}	else if(score[i]<min){
				min = score[i];
			}	
		}
		System.out.println("최대 값은:" + max);
		System.out.println("최소 값은:" + min);
	}
}

	
