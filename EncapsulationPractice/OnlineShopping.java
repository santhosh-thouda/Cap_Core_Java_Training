package EncapsulationPractice;

class Wallet{
	private int balance;
	
	public void addMoney(int amount) {
		if(amount > 0) {
			balance += amount;
		}
		else {
			System.out.println("Cannot add negative");
		}
	}
	
	public void spendMoney(int amount) {
		if(amount < balance) {
			balance -= amount;
		}
		else {
			System.out.println("Account balance must not go negative");
		}
	}
	
	public int getBalance() {
		return balance;
	}
}

public class OnlineShopping {
	public static void main(String[] args) {
		Wallet w = new Wallet();
		w.addMoney(2000);
		w.spendMoney(1000);
		System.out.println(w.getBalance());
	}
}
