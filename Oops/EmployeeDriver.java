package Oops;

public class EmployeeDriver {
	public static void main(String[]args) {
		Employee e = new Employee();
		e.eid = 101;
		e.name = "Santhu";
		System.out.println(e.eid);
		System.out.println(e.name);
		
		e.eid = 102;
		e.name = "Sanjana";
		System.out.println(e.eid);
		System.out.println(e.name);
	}
}
