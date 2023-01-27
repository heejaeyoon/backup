package 스트림;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("홍","신","감");
		
		Stream<String> st = list.stream();
		st.forEach(n->System.out.println(n));
		
		list.stream().forEach(w->System.out.println(w));
		
//		Iterator<String> iterator = list.listIterator();
//		while(iterator.hasNext()) {
//			String name = iterator.next();
//			System.out.println(name);
//		}
	}
}
