package chap01;

public interface Aaa {
	void bbb();
	default void sss() {
		System.out.println("sss");
	
	}

}
