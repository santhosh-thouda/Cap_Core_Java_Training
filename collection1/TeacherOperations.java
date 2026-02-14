package collection1;

import java.util.ArrayList;
import java.util.HashSet;

public class TeacherOperations {
	ArrayList<Teacher> tlist = new ArrayList<>();
	HashSet<Teacher> tset = new HashSet<>();
	
	void addTeacher(Teacher t) {
		if(!tset.contains(t)) {
			tlist.add(t);
		}
	}
	
	public void displayTeachers() {
		for(Teacher t : tlist) {
			System.out.println(t.toString());
		}
	}
}
