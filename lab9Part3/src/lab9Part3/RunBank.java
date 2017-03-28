package lab9Part3;

import java.util.Vector;

public class RunBank extends Thread{


	public static void main(String[] args) {
		
		for(int i = 0; i < 1000; i++) {
			
			new BankTransaction().start();
		}
	}


}
