
public class ThreadsWithExtends extends Thread {
	
	String s[] = {"a", "b", "c"};
	

	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i + " " +"\n" + s[0] + "\n" + s[1] + "\n" + s[2]);

		}
		System.out.println("done " + Thread.currentThread().getName());
	}

}
