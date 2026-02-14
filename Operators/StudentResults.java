package Operators;

public class StudentResults {
	public static void main(String[]args) {
		int passMarks = 40;
		int subOneMarks = 70;
		int subTwoMarks = 90;
		int subThreeMarks = 80;
		
		int totalMarks =  subOneMarks + subTwoMarks + subThreeMarks;
		System.out.println("Total Marks: " +totalMarks);
		
		String subOneStr = ((subOneMarks > passMarks) ? "The Student is Passed in Subject One" : "The Student is Failed in Subject One");
		String subTwoStr = ((subTwoMarks > passMarks) ? "The Student is Passed in Subject Two" : "The Student is Failed in Subject Two");
		String subThreeStr = ((subThreeMarks > passMarks) ? "The Student is Passed in Subject Three" : "The Student is Failed in Subject Three");
		
		System.out.println(subOneStr);
		System.out.println(subTwoStr);
		System.out.println(subThreeStr);
		
		boolean passed = ((subOneMarks > passMarks) && (subTwoMarks > passMarks) && (subThreeMarks > passMarks));
		System.out.println(passed ? "The Student is Passed" : "The Student is Failed");
	}
}
