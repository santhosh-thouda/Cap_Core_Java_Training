package Operators;

public class SalaryIncrement {
	public static void main(String[]args) {
		int salary = 30000;
		int experience = 6;
		boolean disciplinary = true;
		
		boolean eligible = (experience > 5 && disciplinary);
		
		salary += eligible ? 5000 : 0;
		System.out.println(eligible ? "Incremented 5000" : "No Increment");
		System.out.println("Salary: " +salary);
	}
}
