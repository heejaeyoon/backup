package chap13;

public class CarEx {
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.run();
		
		myCar.tire[0] = new Tire() {
			
			@Override
			public void roll() {
				System.out.println("금호 타이어 굴러간다");
				// TODO Auto-generated method stub
				
			}
		};
		myCar.run();
	}
}
