package chap01;

public class Test2 {

	public static void main(String[] args) {
		for (int i=0; i < 100; i++) {
			System.out.println((int)(Math.random()*10)+1); // 앞에 int로 묶어주면 type을 강제로 정수로 변환
		}
	}
}
	

