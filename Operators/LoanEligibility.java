package Operators;

public class LoanEligibility {
	public static void main(String[]args) {
		int age = 28;
		int monthlySalary = 43000;
		int creditScore = 812;
		
		boolean eligible = ((age > 21) && (monthlySalary >= 25000) && (creditScore >= 700));
		System.out.println(eligible ? "Eligible" : "Not Eligible");
	}
}
