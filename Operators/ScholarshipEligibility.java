package Operators;

public class ScholarshipEligibility {
	public static void main(String[]args) {
		int marks = 90;
		int familyIncome = 290000;
		boolean sportsOrNcc = true;
		
		boolean eligible = ((marks >= 85) && (familyIncome < 300000) && sportsOrNcc);
		System.out.println(eligible ? "Eligible for Scholarship" : "Not Eligible for Scholarship");
	}
}
