package ex01;
class Date {int x;}
public class Ex10 {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("mian() : x = " + d.x);
		
		change(d.x);
		System.out.println("After chage(d.x)");
		System.out.println("main() : x = " + d.x);
	}
		static void change(int x) {
			x = 1000 ; 
			System.out.println("change() : x = " + x);
		
	}

}
