package MultiThreading;

public class HaiUser extends Thread{
		BankAccount acc;
		
		HaiUser(BankAccount acc){
			this.acc = acc;
		}
		
		public synchronized void run() {
			acc.withdraw(1500);
			System.out.println("From Hai User class");
		}
}
