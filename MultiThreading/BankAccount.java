package MultiThreading;

public class BankAccount {
	int balance = 1500;
	synchronized public void withdraw(int amount) {
		if(balance >= amount) {
			balance -= amount;
			System.out.println(amount+ " withdrawn successfully");
		}
		else {
			System.out.println("Insufficient balance");
		}
	}
}
