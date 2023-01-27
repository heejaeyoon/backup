package hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapEX {
	public static void main(String[] args) {
		Map<Integer,String> map =new HashMap<Integer,String>();
		map.put(85,"신");		
		map.put(85,"김");		
		map.put(85,"이");		
		map.put(85,"박");		
		System.out.println(map.get("김"));
	}

}
