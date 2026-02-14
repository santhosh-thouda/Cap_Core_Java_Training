package MultiThreading;

public class HaiMain {
	public static void main(String[] args) {
		BankAccount b1 = new BankAccount();
		HaiUser h1 = new HaiUser(b1);
		BankAccount b2 = new BankAccount();
		ByeUser h2 = new ByeUser(b1);
		
		h1.start();
		h2.start();
	}
}
