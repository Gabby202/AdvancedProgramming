
public class ThreadsWithExtends extends Thread {
	public ThreadsWithExtends() {
		super("Thread");
	}
	
	public void run() {
		
		String[] s = {"a", "b" ,"c"};
		
		for(int i = 0; i< 10; i++) {
			System.out.println(s[i]);
			
			try{
				sleep((long)(Math.random() * 1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("done");
		}
	}
	
	public static void main(String[] args) {
		new ThreadsWithExtends().start();
		
	}
		
}
