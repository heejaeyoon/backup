package chap01;

public class Test_1 {
	public static void main(String[] args) {

		String arr[] = new String[7];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = "100" + i;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		int[] sc = {95,71,84};
		int sum = 0;
		for(int nn: sc) {
			sum = sum+nn;
			
		}
		System.out.println(sum);
		double avg = (double) sum/ 3;
		System.out.println(avg);
	}
	
	
}
