package ExceptionHandlingPractice;

public class ATM {
	public static void main(String[] args) {
		BankAccount ba = new BankAccount();
		try {
			ba.withdraw(6000);
		}
		catch(InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
	}
}
