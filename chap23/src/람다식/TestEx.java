package 람다식;

public class TestEx {
	public static void main(String[] args) {
		Test t = (x)->{
//			System.out.println(x);
			return Integer.parseInt(x);
		};
		int num = t.m("10");
		t.m("10");
	}
}
