package ex01;

import java.util.Arrays;

public class Ex5 {

	public static void main(String[] args) {
		int[] num = { 0,1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(num));
		
		for(int i=0 ; i<num.length; i++) {
			int n = (int)(Math.random()*10);
			int tmp = num[i];
			num[i] = num[n];
			num[n] = tmp;
		}
		System.out.println(Arrays.toString(num));
	}
}
