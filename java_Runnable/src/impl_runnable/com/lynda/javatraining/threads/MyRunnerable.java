package impl_runnable.com.lynda.javatraining.threads;

public class MyRunnerable implements Runnable {

	@Override
	public void run() {

		int iterations = 5;
		
		try {
			for (int i = 0; i < iterations; i++) {
				System.out.println("From Runnerbale thread");
				Thread.sleep(1500);
			}
		} catch (InterruptedException e) {
			System.err.println(e);
		}
			
	}

}
