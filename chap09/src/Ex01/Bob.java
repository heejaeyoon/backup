package Ex01;

public class Bob {
	
	Mealtime breakfast = new Mealtime("아침 식사 시간", 5);
	Mealtime lunch = new Mealtime("점심 식사 시간", 2);
	Mealtime dinner = new Mealtime("저녁 식사 시간", 4);
	
	int run() {
		System.out.println("[시간이 흘러갑니다.]");
		if(breakfast.roll() == false ) {stop(); return 1; }
		if(lunch.roll() == false ) {stop(); return 2; }
		if(dinner.roll() == false ) {stop(); return 3; }
		return 0;
	}
	void stop() {
		System.out.println("[시간이 다 지났습니다]");
	}
}
