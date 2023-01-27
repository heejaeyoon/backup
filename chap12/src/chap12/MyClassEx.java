package chap12;

public class MyClassEx {
	public static void main(String[] args) {
//		RemoteControl rc = new RemoteControl() {
			
		
		MyClass mc = new MyClass(new Television());
		mc.methodA();
		mc.methodB(new Television());
	}
}
