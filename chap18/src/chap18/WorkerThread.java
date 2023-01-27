package chap18;

public class WorkerThread extends Thread{
		
	public void run() {
		for(;;) {
			System.out.println("WorkThread");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
