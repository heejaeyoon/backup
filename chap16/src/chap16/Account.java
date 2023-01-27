package chap16;

import java.util.prefs.BackingStoreException;

public class Account {
	private long balance;
	
	public Account() {}
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	public void withdraw(int money) throws BalanceInsufficientEx{
		if(balance < money) {
			throw new BalanceInsufficientEx("잔고부족:"+(money-balance)+ "모자람");
		}
		balance -= money;
		
	}
}
