package conceptEvent;

public class MyButton {
	MyListener myListener;
	
	void addListener(MyListener myListener) {
		this.myListener = myListener;
		System.out.println("리스너 연결");
	}
}
