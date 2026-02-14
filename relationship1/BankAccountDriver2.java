package relationship1;

public class BankAccountDriver2 {
	public static void main() {
		TransactionHistory2 t = new TransactionHistory2();
		BankAccount2[] b = t.getAccounts();
		
		for(int i = 0; i<b.length; i++) {
			System.out.println(b[i].getAccount());
		}
	}
}
