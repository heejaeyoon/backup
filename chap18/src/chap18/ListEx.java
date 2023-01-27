package chap18;

import java.util.ArrayList;
import java.util.List;

public class ListEx extends Object{
	public static void main(String[] args) {
		List list2 = new ArrayList<String>();
		list2.add("33qwqwe");
		System.out.println(list2.get(0));
		
		List list = new ArrayList();
		list.add("hello");
		list.add(3.14);
		list.add(23);
		String str = (String) list.get(0);
		Object obj = list.get(0);
		System.out.println(str);
		
		
	}
}
