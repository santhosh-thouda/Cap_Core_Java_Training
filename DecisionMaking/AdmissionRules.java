package DecisionMaking;

import java.util.Scanner;

public class AdmissionRules {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter marks: ");
		int marks = sc.nextInt();
		
		System.out.print("Sports Quota: ");
		boolean sportsQuota = sc.nextBoolean();
		
		if(marks >= 90 && sportsQuota == true)System.out.println("Tier-1 Seat");
		else if(marks >= 90)System.out.println("Tier-2 Seat");
		else if(marks >= 75)System.out.println("Tier-3 Seat");
		else System.out.println("Rejected");
	}
}
