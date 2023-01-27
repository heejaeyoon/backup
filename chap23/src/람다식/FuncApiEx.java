package 람다식;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FuncApiEx {
	public static void main(String[] args) {
		Consumer<Integer> co = (t)-> {
			System.out.println(t);
//			return t;
		};
		co.accept(100);
		Supplier<String> sp = ()->{
//			System.out.println("test");
			return "test";
		};
		System.out.println(sp.get());
		Function<String, Integer> f= (x) -> {
					return Integer.parseInt(x);
		};
		System.out.println(f.apply("300"));
		
		IntBinaryOperator op = (x, y) -> {
			return x*y*200;
		};
		System.out.println(op.applyAsInt(10, 20));
		
		
		Predicate<String> pr = s ->{
			return s.equals("test");
		};
		System.out.println(pr.test("test"));
	}
}
