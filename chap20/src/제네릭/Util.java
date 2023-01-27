package 제네릭;

public class Util {
	public static <T> Box<T> boxing(T t){
		Box<String> box = Util.<String>boxing("홍인");
		System.out.println(box.getT());
		return null;
		}
	}
