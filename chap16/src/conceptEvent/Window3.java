package conceptEvent;

class MyactionListener implements MyListener{

	@Override
	public void action() {
		
	}
}
	
	
public class Window3 {
	MyButton myButton;

	Window3(){ // 사용자 윈도우 만들기 
		System.out.println("윈도우 만들기");
		MyButton mb = new MyButton();
		this.add(mb);
		mb.addListener(new MyactionListener());
	}
	void add(MyButton myButton) {
		this.myButton = myButton;
		System.out.println("버튼을 붙임");
	}
	
	public static void main(String[] args) {
			new Window3()
;		}
}
