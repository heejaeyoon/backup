package chap03;

class Test {
	private int num = 10; // private 를 붙이면 다른 클래스에서 접근 불가

	void setNum(int number) {
		if (number > 0) {
			num = number;
		} else {
			System.out.println("0보다 큰 수만 가능");
		}
	}

	void printStr() {
		System.out.println(num);
	}
}

public class Test7 {

	public static void main(String[] args) {
//		new Test().num = 20;
//		new Test().num = 40;
		Test t1 = null;
		Test t2 = new Test();

		t1 = new Test();
//		t1.num = 20;
		t1.setNum(-10);
		t1.printStr();
//		System.out.println(t1.num);
//		t2.num = 40;
		t2.setNum(40);
//		System.out.println(t2.num);
		t2.printStr();
	}

}
