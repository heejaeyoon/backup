package 함수적인터페이스;

import java.util.function.DoubleConsumer;

public class ConsumerEx {
	public static void main(String[] args) {
		DoubleConsumer cos = t-> System.out.println(t+"rrr");
		cos.accept(3.14);
	}
	
}
