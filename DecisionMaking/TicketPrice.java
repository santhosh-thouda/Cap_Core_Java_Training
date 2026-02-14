package DecisionMaking;

import java.util.Scanner;

public class TicketPrice {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter age: ");
		int age = sc.nextInt();
		
		if(age < 12)System.out.println("Ticket Price: ₹100");
		else if(age >= 12 && age <=60) System.out.println("Ticket Price: ₹200");
		else System.out.println("Ticket Price: ₹150");
	}
}
