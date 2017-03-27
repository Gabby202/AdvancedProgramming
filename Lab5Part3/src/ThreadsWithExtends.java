
public class ThreadsWithExtends extends Thread {

	static String s[] = { "a", "b", "c" };

	public static synchronized void print() {
		System.out.println(Thread.currentThread().getName() + " " + "\n" + s[0] + "\n" + s[1] + "\n" + s[2]);
	}

	public void run() {

		for (int i = 0; i < 10; i++) {
			print();
		}
		System.out.println("done " + Thread.currentThread().getName());
	}

}
