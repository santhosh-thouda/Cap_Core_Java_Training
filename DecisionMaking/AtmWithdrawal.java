package DecisionMaking;

import java.util.Scanner;

public class AtmWithdrawal {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Balance: ");
		int balance = sc.nextInt();
		
		System.out.print("Withdrawal: ");
		int amount = sc.nextInt();
		
		if(amount % 100 == 0 && balance >= amount)System.out.println("Withdrawal Successfull");
		else System.out.println("Withdrawal Unsuccessful");
	}
}
