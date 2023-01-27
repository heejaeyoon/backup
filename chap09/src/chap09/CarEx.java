package chap09;

public class CarEx {
	public static void main(String[] args) {
		Car car = new Car(); // car 객체 생성
		
		for(int i = 0; i<5; i++) {	 // car 객체의 run() 메소드 5번 반복 실행
			int problemLocation = car.run();
			
			switch(problemLocation) {
				case 1 : 
					System.out.println("앞 왼쪽 HankookTire로 교체"); //앞 왼쪽 타이어가 펑크났을 때 
					car.frontLeftTire = new HankookTire("앞왼쪽",15); // Hankook Tire로 rycp
					break;
				case 2 :
					System.out.println("앞 오른쪽 KumhoTire로 교체"); // 앞 오른쪽 ''
					car.frontLeftTire = new KumhoTire("앞오른쪽",13); // Kumho ''
					break;
				case 3 :
					System.out.println("뒤 왼쪽 HankookTire로 교체"); 
					car.frontLeftTire = new HankookTire("뒤왼쪽",14);
					break;
				case 4 :
					System.out.println("뒤 오른쪽 KumhoTire로 교체");
					car.frontLeftTire = new KumhoTire("뒤오른쪽",17);
					break;
			}
			System.out.println("-------------------------"); // 1회전 시 출력되는 내용을 구분
		}
		
	}
}
