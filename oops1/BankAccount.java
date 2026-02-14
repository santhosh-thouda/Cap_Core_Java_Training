package oops1;

public class BankAccount {
	private int balance = 1000;
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int amount) {
		if(amount > 0) {
			balance = amount;
		}
	}
}
