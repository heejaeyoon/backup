package gogo3;

public class Ex13 {
	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine(); 
		FireEngine fe2 = null; 
				
		fe.water();
		car = fe;
//		car.water();
		fe2 = (FireEngine)car;
		fe2.water();
		
	}
}

class Car {
	String color ;
	int door ;
	
	void drive() { // 운전하는 기능
		System.out.println("drive,Brrr~");
	}
	void stop() { // 멈추는 기능
		System.out.println("stop");
	}
}

class FireEngine extends Car {
	void water() {
		System.out.println("water!!!");
	}
}