package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.lang.Iterable;
import java.util.ListIterator;

class Student{
	int id;
	String name;
	Student(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	Student(){};
	
	String getStudent(int id) {
		return name;
	}
	
	int getId(int id) {
		return id;
	}
	
//	public static ArrayList<Object> stu(){
//		ArrayList<Object> stu1 = new ArrayList<>();
//		stu1.add(123);
//		stu1.add(456);
//		stu1.add(789);
//		return stu1;
//	}
}

public class Example3 {
	public static void main(String[] args) {
		List<Student> s = new ArrayList<>();
		s.add(new Student(101, "Santhosh"));
		s.add(new Student(102, "Kavya"));
		s.add(new Student(103, "Poonam"));
		s.add(new Student(104, "Ravi"));
//		System.out.println(s);
		
//		boolean found = false;
//		for(Student st : s) {
//			if(st.id == 104) {
//				System.out.println("Yes, name : "+st.name);
//				found = true;
//			}		
//		}
//		
//		if(!found) {
//			System.out.println("No");
//		}
		
		
		// incorrect code
//		ListIterator<Student> stu = s.listIterator();
//		boolean found1 = false;
//		while(stu.hasNext()) {
//			int searchId = 101;
//			if(stu.next().id == searchId) {
//				System.out.println("Yes student exists, name : "+stu.next().getStudent(stu.next().id));
//				found1 = true;
//			}
//		}
//		
//		if(!found1) {
//			System.out.println("No");
//		}
		
		
		// for loop correct code
//		int searchId = 101;
//		for(Student st : s) {
//			if(st.id == searchId) {
//				System.out.println("Yes");
//			}
//			else {
//				System.out.println("No");
//			}
//		}
		
		
		Iterator ss = s.iterator();
		while(ss.hasNext()) {
			Student sss = (Student) ss.next();
			System.out.println(sss.id+ ": " +sss.name);
			
			// incorrect code syntax
//			System.out.println(ss.next().id);
//			System.out.println(ss.next().name);
		}
		
	}
}