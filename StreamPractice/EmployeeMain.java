package StreamPractice;

import java.util.ArrayList;

import Stream.Employee;

public class EmployeeMain {
	public static void main(String[] args) {
		ArrayList<Employee> elist = new ArrayList<>();
		elist.add(new Employee(101, "Santhu", 98000));
		elist.add(new Employee(102, "Arjun", 84000));
		elist.add(new Employee(103, "YashKarle", 90000));
		elist.add(new Employee(104, "Abhiraj", 91000));
		elist.add(new Employee(105, "Dheeraj", 81000));
		elist.add(new Employee(106, "Sanjana", 100000));
		elist.add(new Employee(107, "Munawar", 79000));
		
		System.out.println("Salaries more then 85000...");
		elist.stream().filter(x -> x.getSalary() > 85000).forEach(System.out::println);
		
		System.out.println("\nIncrease each salary by 10%...");
		elist.stream()
			.map(x -> (x.getSalary() + x.getSalary()/100)*10).forEach(System.out::println);
		
		
	}
}
