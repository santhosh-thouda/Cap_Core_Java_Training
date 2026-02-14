package Encapsulation;

class Student1{
	String name;
	int id;
	
	Student1(String name, int id){
		this.name = name;
		this.id = id;
	}
	
	static void accept(Student1 s) {
		System.out.println(s.name);
		System.out.println(s.id);
	}
}

public class Student {
	public static void main(String[]args) {
		Student1 std = new Student1("Santhu", 101);
		Student1.accept(std);
	}
}
