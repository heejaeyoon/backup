package chap13;

public class Car {
	Tire[] tire;
	
	Car() {
		tire = new Tire[]  {new HankookTire(),
							new HankookTire(),
							new HankookTire(),
							new HankookTire() };
//		num2 = new int[] {2,3,4,5};
	}
	void run() {
		for(Tire tire : tire) {
			tire.roll();
		}
	}
}
