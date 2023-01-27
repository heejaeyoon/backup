package chap12;

public class MyClass {
	RemoteControl rc;
	
	MyClass(RemoteControl rc) {
		this.rc = rc;
	}
	
	void methodA() {
		RemoteControl rc;
	}
	
	void methodB() {
		RemoteControl rc;
	}
	
	void methodB (RemoteControl rc) {
		
		MyClass mc = new MyClass(rc);
		mc.methodA();
		mc.methodB(rc);
	}
}
