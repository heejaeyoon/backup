package chap1;

public class AccountEx {
	
	public static void main(String[] args) {
		Account account = new Account();
		
		int MIN_BALANCE = 0;
		int MAX_BALANCE = 1000000;
		
		
		account.setBalance(10000);
		System.out.println("현재 잔고: " + account.getBalance());
		
		account.setBalance(-100);
		if (account.getBalance() <= MIN_BALANCE) {
			account.setBalance(10000);
			System.out.println("현재 잔고: " + account.getBalance());
		}
	
		account.setBalance(2000000);
		if (account.getBalance() >= MAX_BALANCE ) {
			account.setBalance(10000);
			System.out.println("현재 잔고: " + account.getBalance());
		}
		
		account.setBalance(300000);
		System.out.println("현재 잔고: " + account.getBalance());
		
		
	}

}
