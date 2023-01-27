package chap17;

import java.util.Iterator;

public class BeepTask extends Thread {
	
	public void run() {
		for(int i = 0 ; i<5; i++) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("이름:"+Thread.currentThread().getName());
		
		}
	}
	

}
