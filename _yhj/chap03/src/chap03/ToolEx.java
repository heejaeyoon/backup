package chap03;

public class ToolEx {

	public static void main(String[] args) {
		Tool tool1 = new Tool();
		System.out.println("tool1.company : " + tool1.company);
		System.out.println();
		
		Tool tool2 = new Tool("자가용");
		System.out.println("tool2.company : " + tool2.company);
		System.out.println("tool2.model : " + tool2.model);
		System.out.println();
		
		Tool tool3 = new Tool("자가용","빨강");
		System.out.println("tool3.company : " + tool3.company);
		System.out.println("tool3.model : " + tool3.model);
		System.out.println("tool3.color : " + tool3.color);
		System.out.println();
		
		Tool tool4 = new Tool("택시","검정",200);
		System.out.println("tool4.company : " + tool4.company);
		System.out.println("tool4.model : " + tool4.model);
		System.out.println("tool4.color : " + tool4.color);
		System.out.println("tool4.maxSpeed : " + tool4.maxSpeed);
		System.out.println();


	}

}
