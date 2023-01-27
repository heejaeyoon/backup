package chap12;

public interface I {
	default void d( ) {
		System.out.println("d");
	}
}
