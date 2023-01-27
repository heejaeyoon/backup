package chap08;

public class Aaa {
	static int a;
	int b;
	static void aaa(int temp) {
//		b = temp;
		System.out.println(a);
	}
	void bbb() {
		System.out.println(a);
		System.out.println(this.b);
	}
}
