package practice2;

import java.util.*;

public class Student {
	private int studentId;
	private String studentName;
	private Map<String, Integer> courseScores = new HashMap<>();
	
	Student(int studentId, String studentName, Map<String, Integer> courseScores){
		this.studentId = studentId;
		this.studentName = studentName;
		this.courseScores = courseScores;
	}
	
	public int getStudentId() {
		return studentId;
	}
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public Map<String, Integer> getCourseScores() {
		return courseScores;
	}
	
	public void setCourseScores(Map<String, Integer> courseScores) {
		this.courseScores = courseScores;
	}
	
	public String toString() {
		return "Student [id= "+studentId+", name= "+studentName+", courseScores= "+courseScores;
	}
}