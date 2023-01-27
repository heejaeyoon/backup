package chap12;

public class RCEx {

	public static void main(String[] args) {
		RemoteControl rc2 = new RemoteControl() {
			private int volume;
			@Override
			public void turnOn() {
				
			}
			
			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setVolume(int volume) {
				// TODO Auto-generated method stub
				
			}
		};
		RemoteControl rc;
		
		rc = new Television();
		rc = new Audio();
		
	}

}
