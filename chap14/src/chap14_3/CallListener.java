package chap14_3;

public class CallListener implements Button.onClickListner{

	@Override
	public String onClick() {
		return "전화 걸기";
	}
	
}
