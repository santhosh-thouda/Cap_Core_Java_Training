package collection1;

import java.util.*;

// use of hashset 

public class TeacherDriver {
	public static void main(String[] args) {
		TeacherOperations t = new TeacherOperations();
		t.addTeacher(new Teacher(108, "20", "Arjun", "Hyd"));
		t.addTeacher(new Teacher(109, "21", "Santhosh", "NYC"));
		t.addTeacher(new Teacher(102, "23", "Sanjana", "Jaipur"));
		t.addTeacher(new Teacher(101, "18", "YashKarle", "Nagpur"));
		t.addTeacher(new Teacher(110, "15", "Priyanshu", "Delhi"));
		t.addTeacher(new Teacher(119, "29", "Kaushal", "Mumbai"));
		t.addTeacher(new Teacher(108, "20", "Arjun", "Hyd"));
		t.addTeacher(new Teacher(109, "21", "Santhosh", "NYC"));
		t.addTeacher(new Teacher(105, "31", "Dheeraj", "Bhopal"));
		
		t.displayTeachers();
		
	}
}
