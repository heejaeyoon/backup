package chap14_2;

public class Outter {
	public void method1(int arg) {
		int localVariable = 1;
//		arg = 100;
//		localVariable = 100;
		
		class Inner {
			public void method( ) {
				int result = arg + localVariable;
			}
		}
	}
	
	public void method2(int arg) {
		int localVariable = 1;
//		arg = 100;
//		slocalVariable = 100;
		
		class Inner {
			public void method( ) {
				int result = arg + localVariable;

			}
		}
	}
}