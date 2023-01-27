package chap14_3;

public class MessageListener implements Button.onClickListner {

	@Override
	public void onClick() {
		System.out.println("메세지를 보냅니다");
	}
	
}
