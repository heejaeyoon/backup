package chap13;

public interface ParentInterface {
	void method1();
	default void method2() { /*실행문*/}
}
