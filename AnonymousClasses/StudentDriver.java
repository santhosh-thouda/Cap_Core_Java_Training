package AnonymousClasses;

import java.util.*;

public class StudentDriver {
	public static void main(String[] args) {
		ArrayList<Student> slist = new ArrayList<>();
		slist.add(new Student(101, "Santhu", 98));
		slist.add(new Student(102, "Arjun", 91));
		slist.add(new Student(103, "Abhiraj", 82));
		slist.add(new Student(104, "YashKarle", 90));
		slist.add(new Student(105, "Sanjana", 99));
		
//		Student s = new Student();
		
		Collections.sort(slist, (a,b) -> b.marks - a.marks);
		
		for(Student s : slist) {
			System.out.println(s.toString());
		}
	}
}
