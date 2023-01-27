package chap18;

public class WorkerThread2 implements Runnable{

	@Override
	public void run() {
		for(;;) {
		System.out.println("WorkThread2");
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		}
	}
}
