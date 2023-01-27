package Ex01;

public class MealtimeEx {

	public static void main(String[] args) {
		Bob bob = new Bob();
		
		for(int i=1; i<5; i++) {
			int problemLocation = bob.run();
			
			switch (bob) {
			case 1 :
				System.out.println("아침 식사 시간 시작");
				bob.breakfast = new Break("아침시작", 2);
				break;
			case 2 :
				System.out.println("점심 식사 시간 시작");
				bob.lunch = new Lunch("아침시작", 2);
				break;		
		
		
			
			}
		}
	}

}
