package impl_runnable.com.lynda.javatraining.threads;

public class Main_Impl {

	public static void main(String[] args) {

		int iterations = 3;

		MyThread thread = new MyThread();
		thread.start();

		MyRunnerable runnable = new MyRunnerable();
		new Thread(runnable).start();


		try {
			for (int i = 0; i < iterations; i++) {
				System.out.println("from main process");
				Thread.sleep(3000);
			}
		} catch (InterruptedException e) {
			System.err.println(e);
		}

	}

}
