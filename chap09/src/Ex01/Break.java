package Ex01;

public class Break extends Mealtime {
	
	public Break(String bobTime, int maxTime) {
		super(bobTime,maxTime);
	}

	@Override
	public boolean roll() {
		++accumulated;
		if(accumulated < maxTime) {
			System.out.println(bobTime + " 아침 식사 시간 :" + (maxTime-accumulated) + "시간");
		return true;
	} else {
		System.out.println("***" + bobTime + " 아침 식사 시간 종료 ***");
		return false;
		}
	}	
	
}
