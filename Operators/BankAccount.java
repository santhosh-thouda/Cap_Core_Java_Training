package Operators;

public class BankAccount {
	public static void main(String[]args) {
		double balance = 245.982;
		System.out.println(balance);
		
		double debit = 120;
		boolean activeOrNot = balance > 0 ? true : false;
		
		balance = (balance > 0 && debit < balance) ? balance - debit : balance;
		System.out.println(balance > 0 ? "Withdrawal Accepted and Final Balance : "+balance : "Withdrawal Denied");
	}
}
