package chap16;

public class ExcepEx {
	
	public static void main(String[] args) {
		try {
			test();
			
		} catch (Exception e) {
			System.out.println("커스텀 예외 테스트");
		}
	}

	public static void test() throws CustomException{
		throw new CustomException("예외 테스트 입니다");
	}
}