package Stream;

import java.util.*;

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
		
		elist.stream()
				.sorted((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()))
				.forEach(System.out::println);
		
		
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(50);
		
		list1.stream().distinct().forEach(System.out::println);
	}
}
