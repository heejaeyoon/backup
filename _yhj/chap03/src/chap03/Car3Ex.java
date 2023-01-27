package chap03;

public class Car3Ex {

	public static void main(String[] args) {
		Car3 myCar3 = new Car3();
		
		myCar3.setGas(5);// Car3의 setGas() 메소드 호출 
		
		boolean gasState = myCar3.isLeftGas(); //Car의 isLeftGas() 메소드 호출
		if(gasState) {
			System.out.println("출발합니다.");
			myCar3.run(); // Car3의 run() 메소드 호출
		}
		
		if(myCar3.isLeftGas()) { //Car3의 isLeftGas() 메소드 호출
			System.out.println("gas를 주입할 필요가 없습니다."); 
		} else {
			System.out.println("gas를 주입하세요.");
		}
	}

}
