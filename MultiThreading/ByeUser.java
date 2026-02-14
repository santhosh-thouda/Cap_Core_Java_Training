package MultiThreading;

public class ByeUser extends Thread{
	BankAccount acc;
	
	ByeUser(BankAccount acc){
		this.acc = acc;
	}
	
	public synchronized  void run() {
		acc.withdraw(1500);
		System.out.println("From Bye User class");
	}
}
