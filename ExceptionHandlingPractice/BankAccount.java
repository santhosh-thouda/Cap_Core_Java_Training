package ExceptionHandlingPractice;

public class BankAccount {
	private int balance = 5000;
	
	void withdraw(int amount) throws InsufficientBalanceException{
		if(amount > balance) {
			throw new InsufficientBalanceException("Insufficient Balance!");
		}
		balance -= amount;
		System.out.println(balance);
	}
}
