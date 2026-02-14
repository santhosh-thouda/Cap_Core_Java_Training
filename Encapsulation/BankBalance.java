package Encapsulation;

class BankBalance1{
	private int balance = 2000;
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		if(balance > 0) {
			this.balance = balance;
		}
	}
}

public class BankBalance {
	public static void main(String[]args) {
		BankBalance1 b = new BankBalance1();
		b.setBalance(5000);
		System.out.println(b.getBalance());
	}
}