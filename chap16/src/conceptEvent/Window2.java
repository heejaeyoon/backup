package conceptEvent;

public class Window2 implements MyListener{
	MyButton myButton;

	Window2(){ // 사용자 윈도우 만들기 
		System.out.println("윈도우 만들기");
		MyButton mb = new MyButton();
		this.add(mb);
		mb.addListener(this);
	}
	void add(MyButton myButton) {
		this.myButton = myButton;
		System.out.println("버튼을 붙임");
	}
	
	public static void main(String[] args) {
			new Window2()
;		}
	@Override
	public void action() {
		// TODO Auto-generated method stub
		
	}
}
