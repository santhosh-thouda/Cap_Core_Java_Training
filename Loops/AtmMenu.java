package Loops;

import java.util.Scanner;

public class AtmMenu {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do {
			System.out.println();
			System.out.println("1. Balance Enquiry");
			System.out.println("2. Withdrawal");
			System.out.println("3. Change Language");
			System.out.println("4. International Transaction");
			System.out.println("5. Change PIN");
			System.out.println("6. Logout");
			
			System.out.print("Enter the option which you want to proceed: ");
			choice = sc.nextInt();
			
			switch(choice) {
				case 1 -> System.out.println("Balance: 9000");
				case 2 -> System.out.println("Withdrawal Successfull");
				case 3 -> System.out.println("Changing Language");
				case 4 -> System.out.println("International Transaction Successfull");
				case 5 -> System.out.println("PIN changed");
				case 6 -> System.out.println("Logout Successfull");
				default -> System.out.println("Invalid Selection");
			}
		}while(choice != 6);
	}
}
