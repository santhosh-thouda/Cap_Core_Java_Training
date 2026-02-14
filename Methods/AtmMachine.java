package Methods;

public class AtmMachine {
	static int updateBalance(int balance, int withdrawal) {
		if(withdrawal > balance) {
			System.out.print("Withdrawal unsuccessfull, Current balance: ");
			return balance;
		}
		else{
			System.out.print("Withdrawal Successfull, Current balance: ");
			return balance-withdrawal;
		}
	}
	public static void main(String[]args) {
		int balance = 10000;
		int withdrawal = 55000;
		System.out.println(updateBalance(balance, withdrawal));
	}
}
