package chap18;

public class ThreadEx {

	public static void main(String[] args) {
//		for(;;) {
//			
//		}
		
		WorkerThread th = new WorkerThread();
		th.start();
		
		Thread th2 = new Thread(new WorkerThread2());
		th2.start();
		
		Thread th3 = new Thread(){
			public void run() {
				for(;;) {
					System.out.println("th3");
					try {
						Thread.sleep(200);
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				}
			}	
		};
		th3.start();
		Thread th4 = new Thread(() -> {
				for(;;) {
					System.out.println("th4");
					try {
						Thread.sleep(200);
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				}
				
		});
		th4.start();

		
	}

}
