package chap14;

public class AEx {
	
	public static void main(String[] args) {
		A a = new A();
		A.B b = a.new B();
		A.B c1 = new A().new B();
		b.field1 = 3;
		b.method1();
		
		A.C c = new A.C();
		c.field1 = 3;
		c.method1();
		A.C.field2 = 3;
		A.C.method2();
		
		//로컬 클래스 객체 생성을 위한 메소드 호출
		a.method();
	}
}
