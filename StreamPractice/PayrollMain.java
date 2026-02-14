package StreamPractice;

import java.util.ArrayList;

import Stream.Employee;

public class PayrollMain {
	public static void main(String[] args) {
		ArrayList<Payroll> elist = new ArrayList<>();
		elist.add(new Payroll(101, "Santhu", 98000));
		elist.add(new Payroll(102, "Arjun", 84000));
		elist.add(new Payroll(103, "YashKarle", 90000));
		elist.add(new Payroll(104, "Abhiraj", 91000));
		elist.add(new Payroll(105, "Dheeraj", 81000));
		elist.add(new Payroll(106, "Sanjana", 100000));
		elist.add(new Payroll(107, "Munawar", 79000));
		
		elist.stream()
			.sorted((a, b) -> Double.compare(a.getSalary(), b.getSalary()))
			.forEach(System.out::println);
		
		
	}
}
