package Encapsulation;

class EmpSalary{
	private static int salary = 35000;
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int sal) {
		if(sal > 0) {
			salary = sal;
		}
	}
}

public class EmployeeSalary {
	public static void main(String[]args) {
		EmpSalary emp = new EmpSalary();
		System.out.println(emp.getSalary());
		emp.setSalary(50000);
		System.out.println(emp.getSalary());
	}
}
