package collection;

import java.util.LinkedList;
import java.util.*;
import java.lang.*;

class Employee{
	private int empId;
	private String empName;
	
	public Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}
	
	public void setEmployeeId(int empId) {
		this.empId = empId;
	}
	
	public int getEmployeeId() {
		return empId;
	}
	
	public void setEmployeeName(String empName) {
		this.empName = empName;
	}
	
	public String getEmployeeName() {
		return empName;
	}
}

class EmployeeUtil{
	LinkedList <Employee> empList = new LinkedList<>();
	
	public LinkedList<Employee> getEmployeeList(){
		return empList;
	}
	
	public void setEmployeeList(LinkedList<Employee> empList) {
		this.empList = empList;
	}
	
	public void addEmployee(Employee e) {
		empList.add(e);
	}
	
	public Employee getEmployeeById(int empId) {
		for(Employee e : empList) {
			if(e.getEmployeeId() == empId) {
				return e;
			}
		}
		return null;
	}
	
	public void deleteEmployeeById(int id) {
		for(Employee e : empList) {
			if(e.getEmployeeId() == id) {
				System.out.println("Employee found");
				empList.remove(e);
				System.out.println("Employee deleted successfully");
			}
		}
	}
	
	// this method will create an error, (so we need to use ListIterator)
//	public void displayEmployees() {
//		for(Employee e : empList) {
//			System.out.println(e.toString());
//		}
//	}
	
	ListIterator<Employee> li = empList.listIterator();
	
	for() 
}

public class EmployeeDriver {
	public static void main(String[] args) {
		EmployeeUtil eu = new EmployeeUtil();
		
		eu.addEmployee(new Employee(101, "Santhosh"));
		eu.addEmployee(new Employee(102, "Sanjana"));
		eu.addEmployee(new Employee(103, "Dheeraj"));
		eu.addEmployee(new Employee(104, "Shubham"));
		
		int idToDelete = 101;
		
		if(idToDelete > 0) {
			eu.deleteEmployeeById(idToDelete);
		}
		
		eu.displayEmployees();
	}
}

