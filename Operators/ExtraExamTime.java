package Operators;

public class ExtraExamTime {
	public static void main(String[]args) {
		int examTime = 120;
		boolean disabled = true;
		boolean  approved = true;
		
		examTime += (disabled || approved) ? 30 : 0;
		
		System.out.println(examTime);
	}
}
