package DecisionMaking;

import java.util.Scanner;

public class ScholarshipEligibility {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Marks: ");
		int marks = sc.nextInt();
		
		System.out.print("Family Income: ");
		int familyIncome = sc.nextInt();
		
		if(marks >= 85 && familyIncome <= 300000)System.out.println("Eligible for Scholarship");
		else System.out.println("Not eligible for Scholarship");
	}
}
