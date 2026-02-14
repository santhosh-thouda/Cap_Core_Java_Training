package YtMOnePractice;

import java.util.HashMap;

class Salary{
	HashMap<String, Integer> empList = new HashMap<>();
	
	public int totalSalary() {
		int total = 0;
		
		// this is wrong implementation, it will not work
//		for(int i = 0; i<=empList.size(); i++) {
//			total += empList.get(i);
//		}
//		return total;
		
		
		// this is correct way of implementation using for each loop
		for(int salary : empList.values()) {
			total += salary;
		}
		return total;
	}
	
	public String getSalary(String designation) {
		if(empList.containsKey(designation)) {
			return "Salary is "+empList.get(designation);
		}
		else {
			return "No designation match";
		}
	}
	
	public void updateSalary(String designation, int newSalary) {
		if(empList.containsKey(designation)) {
			empList.put(designation, newSalary);
		}
	}
}

public class SalaryDriver {
	public static void main(String[] args) {
		Salary s = new Salary();
		s.empList.put("CEO", 20000);
		s.empList.put("Developer", 5000);
		
		System.out.println(s.totalSalary());
		System.out.println(s.getSalary("Developer"));
		s.updateSalary("Developer", 7000);
		System.out.println(s.getSalary("Developer"));
	}
}
