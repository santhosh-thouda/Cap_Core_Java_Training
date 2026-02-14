package Loops;

import java.util.Scanner;

public class WalletBalanceReduce {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int walletBalance = 2000;
		int transaction;
		do {
			System.out.print("Transaction amount: ");
			transaction = sc.nextInt();
			
			if(transaction > walletBalance)System.out.println("Transaction money can't be more then wallet balance.");
			
			walletBalance -= transaction;
			
		}while(walletBalance != 0);
	}
}
