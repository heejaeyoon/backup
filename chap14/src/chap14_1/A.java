package chap14_1;

public class A {
	static String str = "test";
	static int x = 100;
	B field1 = new B();
	static C field2 = new C();
	
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
		
	
	class B {}
	static class C {}
}
