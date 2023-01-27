package chap13;

public interface ChildInterface2 extends ParentInterface{

	@Override
	default void method2() {/*실행문*/}
	
	void method3();
	
	
}
