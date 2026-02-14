package ExceptionHandlingPractice1;

class NetworkFailureException extends Exception{
	NetworkFailureException(String msg){
		super(msg);
	}
}

class InsufficientBalanceException extends Exception{
	InsufficientBalanceException(String msg){
		super(msg);
	}
}

class InvalidBeneficiaryException extends Exception{
	InvalidBeneficiaryException(String msg){
		super(msg);
	}
}

public class MoneyTransfer {
	static void checkNetwork(boolean data, int mbps) throws NetworkFailureException{
		if(data && mbps > 0) {
			System.out.println("Network connected successfully");
		}
		else {
			throw new NetworkFailureException("Network failed to connect");
		}
	}
	
	static void checkBalance(int balance, int transfer) throws InsufficientBalanceException{
		if(balance < transfer) {
			throw new InsufficientBalanceException("Insufficient Balance Exception occured");
		}
		else {
			System.out.println("Transferred money: "+transfer);
			System.out.println("Balance left: "+(balance-transfer));
		}
	}
	
	static void checkBeneficiary(String name) throws InvalidBeneficiaryException{
		if(name == null || name.isEmpty()) {
			throw new InvalidBeneficiaryException("Beneficiary name is invalid, enter valid one");
		}
		else {
			System.out.println("Name: "+name);
		}
	}
	
	public static void main(String[] args) {
		try {
			checkNetwork(true, 10);
		}
		catch(NetworkFailureException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			checkBalance(2000, 1000);
		}
		catch(InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			checkBeneficiary("Santhosh");
		}
		catch(InvalidBeneficiaryException e) {
			System.out.println(e.getMessage());
		}
	}
}
