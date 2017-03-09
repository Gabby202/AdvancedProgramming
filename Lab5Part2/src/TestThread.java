
public class TestThread {
	public static void main(String[] args) {
	
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		
		new Thread(new ThreadWithRunnable(num1)).start();
		new Thread(new ThreadWithRunnable(num2)).start();
		new Thread(new ThreadWithRunnable(num3)).start();

	}
}
