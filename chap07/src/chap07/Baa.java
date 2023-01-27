package chap07;

public class Baa {
	int a;
	void bbb() {
		System.out.println(a);
	}
	int ccc() {
		return a+10;
	}
	void ddd(int a) {
		this.a = a*10;
//		System.out.println(this.a);
//		bbb();
		this.bbb();
	}
	
	int eee(int a) {
		return 20*a;
	}
}	
