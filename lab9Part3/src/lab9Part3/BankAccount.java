package lab9Part3;

public class BankAccount {
	private int balance;

	public BankAccount(int balance) {
		this.balance = balance;
	}
	
	
	public synchronized int getBalance() {
		return balance;
	}
	
	public synchronized void makeWithdrawl(int withdrawl) {
		balance -= withdrawl;
		
	}

	
}
