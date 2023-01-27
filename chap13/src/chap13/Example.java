package chap13;

public class Example {

	public static void main(String[] args) {
		ImpleC impl = new ImpleC();
		
		InterfaceA ia = impl;
		ia.methodA();
		System.out.println( );
		
		InterfaceB ib = impl;
		ib.methodB();
		System.out.println( );
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		
		
	}

}
