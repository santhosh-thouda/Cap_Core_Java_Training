package YtMOnePractice;

import java.util.*;

public class ScholarshipImple {
	static HashMap<Integer, Student> hm = new HashMap<>();
	
	static {
		hm.put(111, new Student("Alan", 111, 99));
		hm.put(222, new Student("Jennifer", 222, 100));
		hm.put(333, new Student("Aarya", 222, 98));
		hm.put(444, new Student("Jen", 222, 93));
		hm.put(555, new Student("Jack", 555, 55));
	}
	
	public void addStudent(Student std) {
		hm.put(std.studentId, std);
	}
	
	public ArrayList<Student> getStudentDetails(String scholarshipScheme){
		ArrayList<Student> slist = new ArrayList<>();
		for(Student s : hm.values()) {
			if(s.scholarshipScheme == scholarshipScheme) {
				slist.add(s);
			}
		}
		return slist;
	}
	
	public boolean deleteStudent(int id) {
		Student s = hm.remove(id);
		if(s == null)return false;
		else return true;
	}
}
