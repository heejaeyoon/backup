package chap03;

public class Tool {
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	Tool () {
		
	}
	
	Tool(String model){
		this.model = model;
	}

	Tool(String model, String color) {
		this.model = model;
		this.color = color;
	}

	Tool(String model, String color, int maxSpeed) {
	
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
		
}
	
		
	
	
