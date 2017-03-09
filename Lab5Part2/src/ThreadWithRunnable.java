
public class ThreadWithRunnable implements Runnable{


	private int num;

	public ThreadWithRunnable(int num) {
		this.num = num;
	}

	public void run()  {
		
	
		
		for(int i = 0; i < 10; i++) {
			System.out.println(num);

			try {
				Thread.sleep((long) (Math.random() * 1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
