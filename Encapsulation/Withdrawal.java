package Encapsulation;

class BankWithdrawal{
	private int balance = 20000;
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int withdrawal) {
		if((balance - withdrawal) > 15000 && withdrawal > 0) {
			balance -= withdrawal;
		};
	}
}

public class Withdrawal {
	public static void main(String[]args) {
		BankWithdrawal b = new BankWithdrawal();
		System.out.println(b.getBalance());
		b.setBalance(6000);
		System.out.println(b.getBalance());
	}
}
