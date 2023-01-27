package chap1;

public class Ex1 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int tmp = 0;
		
		tmp = a;
		a = b;
		b = tmp;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(tmp);
	}

}
