package chap04;

import java.util.Iterator;

public class Array {

	public static void main(String[] args) {
		int[][] scores = {{95, 85, 100},{78, 92, 95},{82, 79, 90}};
		
		for(int j=0; j<3; j++) {
		for (int i = 0 ; i<scores.length; i++) {
				System.out.print(scores[i][j]+"\t");
			}
		System.out.println();
		}
	}

}
