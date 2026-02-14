package relationship1;

public class TransactionHistory2 {
	private BankAccount2[] b;
	
	private BankAccount2[] createAccount(){
		if(b == null) {
			b = new BankAccount2[] {
					new BankAccount2("Santhosh", 1929277373),
					new BankAccount2("Sanjana", 1234567788),
					new BankAccount2("Hema", 987657654),
					new BankAccount2("Kavya", 536782138)
			};
		}
		return b;
	}
	
	public BankAccount2[] getAccounts() {
		return createAccount();
	}
}
