package chap10;
class C{   }
class B extends C{   }

public class A {
	public static void main(String[] args) {
		C c = new B();
		B b = (B) new C();
	}
}
