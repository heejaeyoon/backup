package Ex01;

public class Lunch extends Mealtime {
	
	public Lunch(String bobTime, int maxTime) {
		super(bobTime,maxTime);
	}

	@Override
	public boolean roll() {
		++accumulated;
		if(accumulated < maxTime) {
			System.out.println(bobTime + " 점심 식사 시간 :" + (maxTime-accumulated) + "시간");
		return true;
	} else {
		System.out.println("***" + bobTime + " 저녁 식사 시간 종료 ***");
		return false;
		}
	}	
	
}
