package relationship1;

public class BankAccount1 {
	Customer1 c;
	
	BankAccount1(){
		c = new Customer1("Santhosh");
	}
	
	public String getCustName() {
		return c.getCustName();
	}
}
