package ex01;
class Data2 {int x;}

public class Ex11 {

	public static void main(String[] args) {
		Data2 d = new Data2();
		d.x = 10;
		System.out.println("maint() : x = "+d.x);
		
		change(d);
		System.out.println("After change(c)");
		System.out.println("main() : x = " + d.x);
	}
		static void change(Data2 c) {
			c.x = 1000;
			System.out.println("change() : x = " + c.x);
		}
	}


