package chap15;

public class Parent {
	void parentMethod() {}
}
class child extends Parent {}

class A {
	Parent field = new Parent() {

		@Override
		void parentMethod() {
			super.parentMethod();
		};
		
	};
	void method1 (Parent parent) {}
	void method2 () {
			method1(new Parent());
	}
	void method() {
		Parent localVar = new child() {
			
		};
	}
	
}