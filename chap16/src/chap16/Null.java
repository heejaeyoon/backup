package chap16;

public class Null {
	public static void main(String[] args) {
		String data = null;
		try {
			System.out.println(data.toString());
		} catch (NullPointerException ev) {
//			e.printStackTrace();
			System.out.println(ev.getMessage());
			data= "test";
			System.out.println(data.toString());
		}
	}
}
