package chap15_1;

public class A {
	void m() {
		
	}
}
//class B extends A {}
class C {
	void mc3() {
		A aa2 = new A() {

			@Override
			void m() {
				// TODO Auto-generated method stub
				super.m();
			}
			
		};
}
	A a = new A() {
	void mc1(A a) {}	
	void mc2() {
//		A aa = new A();
		mc1(new A(){
				}
			);
		}
	};
}
