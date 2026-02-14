package relationship1;

public class BankAccount2 {
	private long account;
	private String name;
	
	BankAccount2(String name, long account){
		this.account = account;
		this.name = name;
	}
	
	public String getName(String name) {
		return name;
	}
	
	public long getAccount() {
		return account;
	}
}
