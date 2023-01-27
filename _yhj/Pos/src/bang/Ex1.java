package bang;

public class Ex1 {

	public static void main(String[] args) {
		int a = 1_000_000; // 1,000,000 1백만 = 10의 6제곱
		int b = 2_000_000; // 2,000,000 2백만 = 10의 6제곱
		
		// 10의 12제곱. int 범위는 10의 9제곱
		// long 타입에 저장하려는건 좋았으나 a*b의 값이 int타입이라 오버플로우 발생
//		long c = a * b; // 오버플로우 발생
		
		long c = (long)a *b ;
		
		System.out.println(c);  // a*b = 2,000,000,000,000?? 
		
		
		double pi = 3.141592;
		
		System.out.println(pi);
		System.out.println(pi*1000);
		System.out.println(Math.round(pi*1000));
		System.out.println(Math.round(pi*1000)/1000); 
		System.out.println((double)Math.round(pi*1000)/1000); 
		System.out.println(Math.round(pi*1000)/1000.0); 
			
		
		System.out.println(pi*1000);
		System.out.println((int)(pi*1000));
		System.out.println((int)(pi*1000)/1000);
		System.out.println((int)(pi*1000)/1000.0);	}

}
