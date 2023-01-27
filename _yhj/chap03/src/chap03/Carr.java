package chap03;

public class Carr {
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	Carr () {
		
	}
	
	Carr(String model){
		this(model,"은색",250);
	}

	Carr(String model, String color) {
		this(model,color, 250);
	}

	Carr(String model, String color, int maxSpeed) {
	
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
		
}
	
		
	
	

}
