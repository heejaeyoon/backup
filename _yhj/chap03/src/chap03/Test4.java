package chap03;

public class Test4 {

	public static void main(String[] args) {
	
		String[] aa ;
		aa = new String[3];
		aa[0] = "0";
		aa[1] = "1";
		aa[2] = "2";
		System.out.println(aa.length);
		for (int i = 0; i < aa.length; i++) {
			System.out.println(aa[i]);
//						int tt = aa[i] + 1;
			System.out.println(aa[i]+1);
		}
		
	}
}

		

