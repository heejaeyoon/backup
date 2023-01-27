package gogo3;

import java.util.Arrays;

public class Ex9 {
	public static void main(String[] args) {
		//		      012345 
		String str = "ABCDE"; // str.length() 는 5
		char ch = str.charAt(4);
		String str2 = str.substring(1,4); // BCD
		String str3 = str.substring(1); // 1~4
		String str4 = str.substring(1, str.length()); // str3과 동일 값 출력
		
		System.out.println(ch);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
	}
}






			


	
