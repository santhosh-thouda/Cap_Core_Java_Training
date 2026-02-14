package Methods;

public class BankBalanceUpdate {
	static int balanceUpdate(int deposit, int totalBalance) {
		totalBalance += deposit;
		return totalBalance;
	}
	public static void main(String[]args) {
		int deposit = 4000;
		int totalBalance = 1000;
		System.out.println(balanceUpdate(deposit, totalBalance));
	}
}
