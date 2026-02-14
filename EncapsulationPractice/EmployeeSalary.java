package EncapsulationPractice;

class Salary{
	private int salary;
	
	public void setSalary(String role, int salary) {
		if(role.equalsIgnoreCase("HR")) {
			this.salary = salary;			
		}
		else {
			System.out.println("Only hr can update salary");
		}
	}
	
	public int getSalary() {
		return salary;
	}
}

public class EmployeeSalary {
	public static void main(String[] args) {
		Salary s = new Salary();
		s.setSalary("Hr", 100000);
		System.out.println(s.getSalary());
	}
}