package package2;

import package1.A;

public class B extends A {
	public B() {
		super();
		this.field = "value";
		this.method();
	}
	
	protected void method() {
		A a = new A();
		a.field = "value";
		a.method();
	}
	
	
}
