package lab9Part3;

public class BankTransaction extends Thread {
	
	private static BankAccount account = new BankAccount(10000);
	
	public void run() {
		
		account.makeWithdrawl(10);
		
		System.out.println(Thread.currentThread().getName() + " balance after withdrawal: " + account.getBalance());
	}
}
