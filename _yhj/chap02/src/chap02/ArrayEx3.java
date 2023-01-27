package chap02;

public class ArrayEx3 {
	
	public static int add(int[] scores) {
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		int[] scores = null int[3];
//		scores = new int[] { 83, 90, 87 };
		scores[0] = 83;
		scores[1] = 90;
		scores[2] = 97;
		
		System.out.println(add(scores));
	}
}

