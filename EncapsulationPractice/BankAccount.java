package EncapsulationPractice;

class Security{
	private int deposit;
	private int withdraw;
	private int balance;
	
	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}
	public void setWithdraw(int withdraw) {
		if(withdraw < deposit) {
			this.withdraw = withdraw;
			balance = deposit - withdraw;
		}
		else {
			System.out.println("Withdraw can't be more then deposit");
		}
	}
	public int getDeposit() {
		return deposit;
	}
	public int withdraw() {
		return withdraw;
	}
	public int getBalance() {
		return balance;
	}
}

public class BankAccount {
	public static void main(String[] args) {
		Security s = new Security();
		s.setDeposit(5000);
		System.out.println(s.getDeposit());
		s.setWithdraw(2000);
		System.out.println(s.withdraw());
		System.out.println(s.getBalance());
	}
}

