package chap08;

public class ClassName {
	//인스턴스 필드와 메소드
	int field1;
	void method1() {}
	static int field2;
	static void mtehod2() {}
	static void method3() {
		ClassName obj = new ClassName();
		obj.field1 = 10;
		
	}
	
	
	//정적 필드와 메소드
	static int field2;
	static void method2() {}
	
	//정적 블록
	static {
//		field1 = 10;
//		method1();
		field2 = 10;
		method2();
	}
	
	//정적 메소드
	static void method3 {
		this.field1 = 10;
		this.method1();
		field2 = 10;
		method2();
	}
}

