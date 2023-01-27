package chap14_2;

public class Outter1Ex {
	
	public static void main(String[] args) {
		Outter1 out = new Outter1() ;
		Outter1.Nested nested = out.new Nested();
		nested.print();
	}
}
