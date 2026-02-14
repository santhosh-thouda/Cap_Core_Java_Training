package ExceptionHandlingPractice1;

class InsufficientBalanceException extends Exception{
	InsufficientBalanceException(String msg){
		super(msg);
	}
}

class InvalidPinException extends Exception{
	InvalidPinException(String msg){
		super(msg);
	}
}

class OutOfCashException extends Exception{
	OutOfCashException(String msg){
		super(msg);
	}
}

public class AtmWithdraw {
	static void checkBalance(int availableBalance, int withdrawBalance) throws InsufficientBalanceException{
		if(withdrawBalance > availableBalance) {
			throw new InsufficientBalanceException("Insufficient Balance");
		}
		else {
			System.out.println("Withdraw successfull");
		}
	}
	
	static void checkPin(int actualPin, int pinEntered) throws InvalidPinException{
		if(actualPin != pinEntered) {
			throw new InvalidPinException("Pin entered incorrectly, exception created");
		}
		else {
			System.out.println("Pin entered correctly");
		}
	}
	
	static void checkCash(int cash) throws OutOfCashException{
		if(cash < 0) {
			throw new OutOfCashException("Atm out of cash exception created");
		}
		else {
			System.out.println("Atm has balance");
		}
	}
	
	public static void main(String[] args) {
		try {
			checkBalance(1000, 2000);
		}
		catch(InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			checkPin(0202, 02025);
		}
		catch(InvalidPinException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			checkCash(-5000);
		}
		catch(OutOfCashException e) {
			System.out.println(e.getMessage());
		}
	}
}
