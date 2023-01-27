package chap11;

import java.util.Scanner;

public class DriverEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Driver driver = new Driver();
		Vehicle2 vehicle;
//		Bus bus = new Bus();
//		Taxi taxi = new Taxi();
		System.out.println("택시와 버스 중 하나를 선택>");
		String inS = sc.nextLine();
		if (inS.equals("택시")) {
			vehicle = new Taxi();
			driver.drive(vehicle);
		} else if(inS.equals("버스")){
			vehicle = new Bus();
			driver.drive(vehicle);
		}
		
		
//		driver.drive(bus);
//		driver.drive(taxi);
	}

}
