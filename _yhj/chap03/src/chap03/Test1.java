package chap03;

import java.util.Iterator;

public class Test1 {

	public static void main(String[] args) {
		for(int i = 1 ; i <= 9 ; i++ ) {
			System.out.println(i+"단");
			for(int z = 1; z<=9 ; z++) {
				System.out.println(i +  " X " + z + "=" + i*z);
			}
		}
		
	}

}
