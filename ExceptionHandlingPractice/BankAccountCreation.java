package ExceptionHandlingPractice;

class NegativeInitialBalanceException extends Throwable{
	NegativeInitialBalanceException(String msg){
		super(msg);
	}
}

public class BankAccountCreation {
	public static void checkNegativeBalance(int initialBalance) throws NegativeInitialBalanceException{
		if(initialBalance < 0) {
			throw new NegativeInitialBalanceException("Initial Balance should not be negative");
		}
		else {
			System.out.println("Initial Balance: " +initialBalance);
		}
	}
	
	public static void main(String[] args) {
		try {
			checkNegativeBalance(-900);
		}
		catch(NegativeInitialBalanceException e) {
			System.out.println(e.getMessage());
		}
	}
}
