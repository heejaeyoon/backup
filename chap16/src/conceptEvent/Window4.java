package conceptEvent;

public class Window4 {
	class MyactionListener implements MyListener{

		@Override
		public void action() {
			
		}
	}
		
	MyButton myButton;

	Window4(){ // 사용자 윈도우 만들기 
		System.out.println("윈도우 만들기");
		MyButton mb = new MyButton();
		this.add(mb);
		mb.addListener(new Window4.MyactionListener());
		
	}
	void add(MyButton myButton) {
		this.myButton = myButton;
		System.out.println("버튼을 붙임");
	}
	
	public static void main(String[] args) {
			new Window4()
;		}
}
