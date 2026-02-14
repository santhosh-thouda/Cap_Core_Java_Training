package Operators;
import java.util.*;

public class StudentMarks{
	public static void main(String[]args) {
		int marks = 70;
		int attendence = 76;
		System.out.println("Marks: " +marks);
		System.out.println("Attendence: " +attendence);
		
		System.out.println(marks >= 40 && attendence >= 75 ? marks += 5 : "Failed");
		
	}
}
