package StreamPractice;

import java.util.ArrayList;

import Stream.Employee;

public class StudentMain {
	public static void main(String[] args) {
		ArrayList<Student> slist = new ArrayList<>();
		slist.add(new Student(101, "Santhu", 98));
		slist.add(new Student(102, "Arjun", 84));
		slist.add(new Student(103, "YashKarle", 31));
		slist.add(new Student(104, "Abhiraj", 91));
		slist.add(new Student(105, "Dheeraj", 88));
		slist.add(new Student(106, "Sanjana", 63));
		slist.add(new Student(107, "Munawar", 78));
		
		slist.stream()
			.filter(x -> x.getMarks()%2 != 0)
			.map(x -> x.getMarks() * x.getMarks())
			.forEach(System.out::println);
	}
}
