package jdbc;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrEx {
	public static void main(String[] args) {
		String[] strArr = {"홍","신","감"};
		Stream<String> strStream = Arrays.stream(strArr);
		strStream.forEach(e->System.out.println(e));
		
	}
}
