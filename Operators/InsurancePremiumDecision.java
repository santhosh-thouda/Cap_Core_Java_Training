package Operators;

public class InsurancePremiumDecision {
	public static void main(String[]args) {
		int age = 29;
		boolean smoking = false;
		boolean drinking = false;
		int healthScore = 9;
		boolean eligible = (!smoking && !drinking && (healthScore >= 8));
		
		System.out.println(eligible ? "Premium Applicable" : "Premium Not Applicable");
	}
}