package Methods;

public class EmployeeSystem {
	static void employeeDetails(String name, int age, String city, int totalSalary){
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("City: "+city);
		System.out.println("This Month Salary: "+totalSalary);
	}
	
	static int calculateSalary(int daysWorked, int workingDays) {
		int salaryPerDay = 300000/workingDays;
		int totalSalary = salaryPerDay * daysWorked;
		return totalSalary;
	}
	
	public static void main(String[]args) {
		int totalSalary = calculateSalary(28, 30);
		employeeDetails("Santhosh", 21, "Hyderabad", totalSalary);
	}
}
