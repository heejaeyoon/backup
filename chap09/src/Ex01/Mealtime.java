package Ex01;

public class Mealtime {
	public int maxTime; // 안먹고 버티는 시간
	public int accumulated;  // 누적시간
	public String bobTime; // 식사때
	
	public Mealtime(String bobTime, int maxTime) {
		this.bobTime = bobTime;
		this.maxTime = maxTime;
	}
	
	public boolean roll() {
		++accumulated; 
		if(accumulated < maxTime) {
			System.out.println(bobTime + "지금의 밥 시간 : " + (maxTime-accumulated)+ "시간");
			return true;
		} else {
			System.out.println("***" + bobTime + " 식사지간 지났습니다 ");
			return false;
		}
	}
	
	
}
