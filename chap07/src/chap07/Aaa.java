package chap07;

public class Aaa {
	int a;
	int b;
	int c;
	
	
	
	Aaa(){ // 기본생성자
	
	}
	
	Aaa(int a) {
//		this.a = a;
		this(a, 0, 0 ); 
	}
	
	Aaa(int a,int b) {
//		this.a = a;
//		this.b = b;
		this(a, b, 0);
	}
	
	Aaa(int a,int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
}
