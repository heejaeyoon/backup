package chap02;

public class ContinureEx {

	public static void main(String[] args) {
		System.out.println(5%2 !=0);
		System.out.println(10/3);
		System.out.println(10%3);
		for(int i = 1; i<=10 ; i++) {
			if(i%2 != 0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
