package chap21;

public class ThreadA extends Thread {
	public ThreadA() {
		this.setName("A스레드");
		
		
	}

	@Override
	public void run() {
		for(int i = 0; i<12; i++) {
			System.out.println(this.getName());
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
