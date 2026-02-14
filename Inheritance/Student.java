package Inheritance;

public class Student extends Person{
	int sid;
	Student(String name, int sid){
		super(name);
		this.sid = sid;
	}
	public static void main(String[] args) {
		Student s = new Student("Santhu", 101);
		System.out.println(s.name);
		System.out.println(s.sid);
	}
} 