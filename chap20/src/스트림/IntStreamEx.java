package 스트림;

import java.util.stream.IntStream;

public class IntStreamEx {
	static int sum;
	public static void main(String[] args) {
//		IntStream st = IntStream.rangeClosed(1, 10);
//		st.forEach(a -> sum + a);
		int sum = 0;
		IntStream.rangeClosed(1, 10).forEach(a->sum +=a);
		System.out.println(sum);
	}
}
	
	
