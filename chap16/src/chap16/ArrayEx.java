package chap16;

public class ArrayEx {
	
	public static void main(String[] args) {
		String arr[] = {"가", "나","다"};
		int num = 2;
		System.out.println(arr[num]);
		for(int i = 1; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
