package 아티클;

import java.util.ArrayList;
import java.util.List;

public class ArtiEx {
	static List<Article> list;
	
	public static void main(String[] args) {
		list = selectAll();
		for(Article art : list) {
			System.out.println(art);
		}
	}
//		List<Article> list = new ArrayList<Article>();
////		System.out.println(lst.get(0));
//		list.add(new Article(1, "홍길동", "제목1" , "내용1", 0));
//		list.add(new Article(2, "홍길철", "제목2" , "내용2", 0));
//		list.add(new Article(3, "홍길순", "제목2" , "내용3", 0));
////		for (Article art : lst) {
////			System.out.println(art);
////		}
//		System.out.println(select(2));
//	}
	
	
	public static List<Article> selectAll() {
		List<Article> list = new ArrayList<Article>();
//		System.out.println(lst.get(0));
		list.add(new Article(1, "홍길동", "제목1" , "내용1", 0));
		list.add(new Article(2, "홍길철", "제목2" , "내용2", 0));
		list.add(new Article(3, "홍길순", "제목3" , "내용3", 0));
		
		return list;
}
	
	
	public static Article select(int i){	
		return list.get(i);
		
//		Article art = lst.get(0);
//		return art;
		
		
//		return null; //return 타입이 int 일때는 리턴타입 0 , class나 String 타입은 null;
		
	}	
}
